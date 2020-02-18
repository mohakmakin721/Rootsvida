package com.mm.rootsvida.ui.HomeFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.mm.rootsvida.Adapters.ItemViewHomeAdapter;
import com.mm.rootsvida.Adapters.PostAdapter;
import com.mm.rootsvida.Models.ItemViewHome;
import com.mm.rootsvida.Models.Post;
import com.mm.rootsvida.Models.PostBlockView;
import com.mm.rootsvida.Models.PostVerticalView;
import com.mm.rootsvida.R;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    RecyclerView postRecyclerView;
    private ItemViewHomeAdapter adapter;
    private List<ItemViewHome> mData;


    PostAdapter postAdapter;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    private String textBlock1,textBlock2,textBlock3,textBlock4;
    List<String> textBlockList;
    List<Post> postList;
    long postCount,categoryCount;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        View fragmentView = inflater.inflate(R.layout.fragment_home,container,false);
        postRecyclerView = fragmentView.findViewById(R.id.postRV);
        postRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        postRecyclerView.setHasFixedSize(true);
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("Posts");



        return fragmentView;
    }

    @Override
    public void onStart() {
        super.onStart();

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                mData = new ArrayList<>();
                for(DataSnapshot postsnap: dataSnapshot.getChildren())
                {
                    PostVerticalView postVerticalView;
                    PostBlockView postBlockView;
                    ItemViewHome itemViewHome= new ItemViewHome();
                    postList = new ArrayList<>();
                    textBlockList = new ArrayList<>();
                    if(postsnap.getKey().contains("block"))
                    {

                        postBlockView = postsnap.getValue(PostBlockView.class);
                        itemViewHome = new ItemViewHome(postBlockView);

                    }
                    else{
                        for(DataSnapshot postInPostSnap : postsnap.getChildren())
                        {
                            Post post = postInPostSnap.getValue(Post.class);
                            postList.add(post);
                        }
                        postVerticalView = new PostVerticalView(postsnap.getKey(),postList);
                        itemViewHome = new ItemViewHome(postVerticalView);
                    }
                    mData.add(itemViewHome);
                }

                //postAdapter = new PostAdapter(getActivity(),postVerticalViewArrayList);
                //postRecyclerView.setAdapter(postAdapter);

                adapter = new ItemViewHomeAdapter(getActivity(),mData);
                postRecyclerView.setAdapter(adapter);


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


    }
}