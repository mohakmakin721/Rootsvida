package com.mm.rootsvida.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mm.rootsvida.Models.ItemViewHome;
import com.mm.rootsvida.Models.Post;
import com.mm.rootsvida.Models.PostVerticalView;
import com.mm.rootsvida.R;

import java.util.ArrayList;
import java.util.List;

public class PostAdapter extends BaseViewHolder {

    private TextView category;
    private RecyclerView recyclerView;


    public PostAdapter(@NonNull View itemView) {
        super(itemView);
        category =itemView.findViewById(R.id.row_post_category);
        recyclerView = itemView.findViewById(R.id.inPostRV);

    }



    @Override
    void setData(ItemViewHome item) {

        PostVerticalView postVerticalView = item.getPostVerticalView();
        category.setText(postVerticalView.getCategory());
        List<Post> postList = item.getPostVerticalView().getPostList();

        PostItemAdapter postItemAdapter = new PostItemAdapter(itemView.getContext(),postList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(itemView.getContext(), LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(postItemAdapter);

    }

}
