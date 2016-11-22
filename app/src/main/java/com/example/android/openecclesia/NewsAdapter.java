package com.example.android.openecclesia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Michael on 10/1/16.
 */
public class NewsAdapter extends ArrayAdapter<News> {

    private static final String LOCATOR_SEPARATOR = "T";

    private TextView titleView;

    private TextView sectionView;

    private TextView webPubView;

    private TextView typeView;

    public NewsAdapter(Context context, ArrayList<News> news) {
        //This creates the internal storage for the context and the list
        //second argument calls for a value if using a single TextView
        //the adapter is not going to use the 2nd adapter
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        News currentNews = getItem(position);
        //Checks if the existing view is being reused. If not then inflate the view that shows on the
        //multiple list views
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.items_list,parent,false);
        }

        titleView = (TextView) listItemView.findViewById(R.id.webTitleView);
        sectionView = (TextView) listItemView.findViewById(R.id.sectionView);
        webPubView = (TextView) listItemView.findViewById(R.id.webPubView);
        typeView = (TextView) listItemView.findViewById(R.id.typeView);

        String originalDate = currentNews.getDate();
        String readableDate;
            String[] parts = originalDate.split(LOCATOR_SEPARATOR);
            readableDate = parts[0];

        titleView.setText(currentNews.getTitle());
        sectionView.setText(currentNews.getSectionName());
        webPubView.setText(readableDate);
        typeView.setText(currentNews.getNewsType());

        return listItemView;
    }
}
