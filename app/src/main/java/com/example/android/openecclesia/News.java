package com.example.android.openecclesia;

/**
 * Created by Michael on 10/1/16.
 */
public class News {

    private String mTitle;
    private String mSectionName;
    private String mURL;
    private String mDate;
    private String mNewsType;

    //constructor

    public News (String title, String section, String url, String date, String type) {
        mTitle = title;
        mSectionName = section;
        mURL = url;
        mDate = date;
        mNewsType = type;
    }

    public News (String title, String section, String date, String type) {
        mTitle = title;
        mSectionName = section;
        mDate = date;
        mNewsType = type;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getSectionName() {
        return mSectionName;
    }

    public String getURL() {
        return mURL;
    }

    public String getDate() {
        return mDate;
    }

    public String getNewsType() {
        return mNewsType;
    }

}
