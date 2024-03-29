package com.pearson.lagp.timeorganizer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class DayAdapter extends ArrayAdapter {


    public DayAdapter(Context context, ArrayList<Day> days) {
        super(context, 0, days);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Day currentDay = (Day) getItem(position);

        TextView dayTextView = (TextView) listItemView.findViewById(R.id.day_text_view);
        dayTextView.setText(currentDay.getmDay());


        return listItemView;
    }


}
