package com.sample.foo.simplerssreader;

/**
 * Created by obaro on 27/11/2016.
 */

public class RssFeedModel {

    public String title;
    public String link;
    public String description;

    public RssFeedModel(String title, String link, String description) {
        this.title = title;
        this.link = link;
        this.description = description;
    }
}
