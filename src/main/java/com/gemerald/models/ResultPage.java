package com.gemerald.models;

import java.io.Serializable;

public class ResultPage implements Serializable {

    private String imgSource;
    private String greetings;

    public String getImgSource() {
        return imgSource;
    }

    public void setImgSource(String imgSource) {
        this.imgSource = imgSource;
    }

    public String getGreetings() {
        return greetings;
    }

    public void setGreetings(String greetings) {
        this.greetings = greetings;
    }
}
