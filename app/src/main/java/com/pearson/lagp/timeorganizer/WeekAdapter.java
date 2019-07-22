package com.pearson.lagp.timeorganizer;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class WeekAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public WeekAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FirstWeekFragment();
        } else if (position == 1) {
            return new SecondWeekFragment();
        } else if (position == 2) {
            return new ThirdWeekFragment();
        } else if (position == 3) {
            return new FourthWeekFragment();
        } else {
            return new FifthWeekFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.first_week);
        } else if (position == 1) {
            return mContext.getString(R.string.second_week);
        } else if (position == 2) {
            return mContext.getString(R.string.third_week);
        } else if (position == 3) {
            return mContext.getString(R.string.fourth_week);
        } else {
            return mContext.getString(R.string.fifth_week);
        }
    }
}