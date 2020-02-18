package com.mm.rootsvida.Models;

import java.util.ArrayList;
import java.util.List;

public class PostVerticalView {

    String category;

    List<Post> postList;

    public PostVerticalView(String category, List<Post> postList) {
        this.category = category;
        this.postList = postList;
    }

    public PostVerticalView() {
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(ArrayList<Post> postArrayList) {
        this.postList = postArrayList;
    }
}
