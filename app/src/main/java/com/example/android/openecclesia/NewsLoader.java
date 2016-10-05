package com.example.android.openecclesia;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Created by Michael on 10/3/16.
 */
public class NewsLoader extends AsyncTaskLoader<List<News>> {
    /** Tag for log messages */
    private static final String LOG_TAG = NewsLoader.class.getName();

    /** Query URL */
    private String mUrl;

    public NewsLoader(Context context,String url) {
        super(context);
        mUrl = url;

    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<News> loadInBackground() {
        //return null if mURL is empty
        if(mUrl == null){
            return null;
        }
        List<News> news = MainActivity.fetchNewsData(mUrl);
        //load the news URL by using the fetch helper method
        return news;
    }


}
