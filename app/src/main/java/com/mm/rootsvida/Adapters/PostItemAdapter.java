package com.mm.rootsvida.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.mm.rootsvida.Models.Post;
import com.mm.rootsvida.R;

import java.util.ArrayList;
import java.util.List;

public class PostItemAdapter extends RecyclerView.Adapter<PostItemAdapter.MyViewHolder> {

    Context mContext;
    List<Post> postList;

    public PostItemAdapter(Context mContext, List<Post> postList) {
        this.mContext = mContext;
        this.postList = postList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View rowItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_post_in_row_post,parent,false);

        return new MyViewHolder(rowItem);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tvTitle.setText(postList.get(position).getTitle());
        Glide.with(mContext).load(postList.get(position).getPicture()).into(holder.imgPost);


    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tvTitle;
        ImageView imgPost;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.row_post_title);
            imgPost = itemView.findViewById(R.id.row_post_img);
        }
    }
}
