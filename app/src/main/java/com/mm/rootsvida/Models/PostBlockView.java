package com.mm.rootsvida.Models;

public class PostBlockView {

    private String textBlock1,textBlock2,textBlock3,textBlock4;

    public PostBlockView(String textBlock1, String textBlock2, String textBlock3, String textBlock4) {
        this.textBlock1 = textBlock1;
        this.textBlock2 = textBlock2;
        this.textBlock3 = textBlock3;
        this.textBlock4 = textBlock4;
    }

    public PostBlockView() {
    }



    public String getTextBlock1() {
        return textBlock1;
    }

    public void setTextBlock1(String textBlock1) {
        this.textBlock1 = textBlock1;
    }

    public String getTextBlock2() {
        return textBlock2;
    }

    public void setTextBlock2(String textBlock2) {
        this.textBlock2 = textBlock2;
    }

    public String getTextBlock3() {
        return textBlock3;
    }

    public void setTextBlock3(String textBlock3) {
        this.textBlock3 = textBlock3;
    }

    public String getTextBlock4() {
        return textBlock4;
    }

    public void setTextBlock4(String textBlock4) {
        this.textBlock4 = textBlock4;
    }
}
