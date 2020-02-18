package com.mm.rootsvida.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mm.rootsvida.Models.ItemViewHome;
import com.mm.rootsvida.R;
import com.mm.rootsvida.ui.Constant;

import java.util.List;

public class ItemViewHomeAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    private Context mContext;
    private List<ItemViewHome> mData;

    public ItemViewHomeAdapter(Context mContext, List<ItemViewHome> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view ;

        switch(viewType){
            case Constant.ITEM_BLOCK_VIEWTYPE:
                view = LayoutInflater.from(mContext).inflate(R.layout.row_block_post_item,parent,false);
                return new PostBlockAdapter(view);
            case Constant.ITEM_LINEAR_SCROLL_VIEWTYPE:
                view = LayoutInflater.from(mContext).inflate(R.layout.row_post_item,parent,false);
                return new PostAdapter(view);
            default: throw new IllegalArgumentException();

        }
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder holder, int position) {

        holder.setData(mData.get(position));

    }

    @Override
    public int getItemViewType(int position) {
        return mData.get(position).getViewType();
    }

    @Override
    public int getItemCount() {
        if(mData!=null)
            return mData.size();
        else
            return 0;
    }
}
