package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/* == Created by Tom Gehrke on 1/14/2017. == */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId = -1;

    public WordAdapter(Activity context, ArrayList<Word> wordList, int colorResourceId) {
        super(context, 0, wordList);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultWord());

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokWord());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.item_image_view);

        if (currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        if (mColorResourceId > -1) {
            LinearLayout translationLayout = (LinearLayout) listItemView.findViewById(R.id.translationLayout);
            translationLayout.setBackgroundResource(mColorResourceId);
        }

        return listItemView;
    }
}
