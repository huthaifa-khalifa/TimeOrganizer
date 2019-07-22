package com.pearson.lagp.timeorganizer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FirstWeekFragment extends Fragment {

    public FirstWeekFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = (View) inflater.inflate(R.layout.days_list, container, false);

        final ArrayList<Day> days = new ArrayList<Day>();
        days.add(new Day(R.string.sunday));
        days.add(new Day(R.string.monday));
        days.add(new Day(R.string.tuesday));
        days.add(new Day(R.string.wednesday));
        days.add(new Day(R.string.thursday));
        days.add(new Day(R.string.friday));
        days.add(new Day(R.string.saturday));


        DayAdapter adapter = new DayAdapter(getActivity(), days);

        ListView listView = (ListView)  rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;

    }

}
