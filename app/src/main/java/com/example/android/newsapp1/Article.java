package com.example.android.newsapp1;

import java.util.Date;

public class Article {

    //Create URL
    private String mUrl;

    // Article Title
    private String mTitle;

    //section name
    private String mSection;

    //author name
    private String mAuthor;

    // Published time
    private final Date mTime;


    /**
     * Constructs a new {@link Article} object.
     *
     * @param title is the city title of the article
     * @param time is the time when the article published
     * @param author is the author of the article
     *@param section is the section of article
     */
    public Article(String title, String section, String author, Date time, String url) {
        mTitle = title;
        mSection = section;
        mAuthor = author;
        mTime = time;
        mUrl = url;
    }

    /**
     * Get the article title
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Get section name
     */
    public String getSection() {
        return mSection;
    }

    /**
     * Get author name
     */
    public String getAuthor() {
        return mAuthor;
    }


    /**
     * Get published time ane date
     */
    public Date getTime() {
        return mTime;
    }


    // for URL
    public String getUrl(){
        return mUrl;
    }
}
