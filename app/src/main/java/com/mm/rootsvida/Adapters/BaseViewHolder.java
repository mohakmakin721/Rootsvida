package com.mm.rootsvida.Adapters;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mm.rootsvida.Models.ItemViewHome;

public abstract class BaseViewHolder extends RecyclerView.ViewHolder {

    abstract void setData(ItemViewHome item);

    public BaseViewHolder(@NonNull View itemView) {
        super(itemView);
    }
}
