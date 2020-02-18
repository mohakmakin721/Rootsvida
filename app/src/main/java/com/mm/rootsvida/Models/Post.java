package com.mm.rootsvida.Models;

import com.google.firebase.database.ServerValue;

public class Post {

    private String postKey;
    private String title;
    private String description;
    private String picture;
    private String category;
    private String tags;
    private String InStock;
    private String userId;
    private Object timeStamp ;

    public Post(String title, String description, String picture, String category, String tags, String InStock, String userId) {
        this.title = title;
        this.description = description;
        this.picture = picture;
        this.category = category;
        this.tags = tags;
        this.InStock = InStock;
        this.userId = userId;
        this.timeStamp = ServerValue.TIMESTAMP;
    }

    public Post() {
    }

    public String getPostKey() {
        return postKey;
    }

    public void setPostKey(String postKey) {
        this.postKey = postKey;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getInStock() { return InStock; }

    public void setInStock(String inStock) { InStock = inStock; }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Object getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Object timeStamp) {
        this.timeStamp = timeStamp;
    }
}
