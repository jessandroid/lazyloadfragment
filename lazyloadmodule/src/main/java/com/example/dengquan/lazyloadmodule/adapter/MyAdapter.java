package com.example.dengquan.lazyloadmodule.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by dengquan on 16-3-21.
 */
public class MyAdapter extends FragmentPagerAdapter {
    private List<Fragment> mList;
    public MyAdapter(FragmentManager fm,List<Fragment> list) {
        super(fm);
        this.mList = list;
    }

    @Override
    public int getCount() {
        return mList != null ? mList.size() : 0;
    }

    @Override
    public Fragment getItem(int position) {
        return mList != null ? mList.get(position) : null;
    }
}
