package com.mm.rootsvida.Adapters;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.mm.rootsvida.Models.ItemViewHome;
import com.mm.rootsvida.Models.PostBlockView;
import com.mm.rootsvida.R;

public class PostBlockAdapter extends BaseViewHolder {

    private TextView textBlock1,textBlock2,textBlock3,textBlock4;

    public PostBlockAdapter(@NonNull View itemView) {
        super(itemView);

        textBlock1 = itemView.findViewById(R.id.textBlock1);
        textBlock2 = itemView.findViewById(R.id.textBlock2);
        textBlock3 = itemView.findViewById(R.id.textBlock3);
        textBlock4 = itemView.findViewById(R.id.textBlock4);
    }

    @Override
    void setData(ItemViewHome item) {

        PostBlockView postBlockView = item.getPostBlockView();
        textBlock1.setText(postBlockView.getTextBlock1());
        textBlock2.setText(postBlockView.getTextBlock2());
        textBlock3.setText(postBlockView.getTextBlock3());
        textBlock4.setText(postBlockView.getTextBlock4());

    }


}
