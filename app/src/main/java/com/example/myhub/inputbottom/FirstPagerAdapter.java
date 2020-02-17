package com.example.myhub.inputbottom;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

/**
 * Time:2020/2/17 20:33
 * Author: han1254
 * Email: 1254763408@qq.com
 * Function:
 */
public class FirstPagerAdapter extends FragmentPagerAdapter {

    private String[] list;

    public FirstPagerAdapter(@NonNull FragmentManager fm, String[] list) {
        super(fm);
        this.list = list;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return new TestFragment(list[position]);
    }

    @Override
    public int getCount() {
        return list.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return list[position];
    }
}
