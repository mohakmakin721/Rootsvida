package com.mm.rootsvida.Models;

import com.mm.rootsvida.ui.Constant;

public class ItemViewHome {

    private PostBlockView postBlockView;
    private PostVerticalView postVerticalView;
    private int viewType;

    public ItemViewHome() {
    }

    public ItemViewHome(PostVerticalView postVerticalView) {
        this.postVerticalView = postVerticalView;
        viewType = Constant.ITEM_LINEAR_SCROLL_VIEWTYPE;
    }

    public ItemViewHome(PostBlockView postBlockView) {
        this.postBlockView = postBlockView;
        viewType = Constant.ITEM_BLOCK_VIEWTYPE;
    }

    public PostBlockView getPostBlockView() {
        return postBlockView;
    }

    public void setPostBlockView(PostBlockView postBlockView) {
        this.postBlockView = postBlockView;
    }

    public PostVerticalView getPostVerticalView() {
        return postVerticalView;
    }

    public void setPostVerticalView(PostVerticalView postVerticalView) {
        this.postVerticalView = postVerticalView;
    }

    public int getViewType() {
        return viewType;
    }

    public void setViewType(int viewType) {
        this.viewType = viewType;
    }
}
