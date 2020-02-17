package com.example.myhub.inputbottom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;


import android.os.Bundle;


import com.example.myhub.R;
import com.google.android.material.tabs.TabLayout;
import com.youth.banner.Banner;
import com.youth.banner.indicator.CircleIndicator;

import java.util.ArrayList;
import java.util.List;

public class InputBottomActivity extends AppCompatActivity {

    private LinearAdapter adapter;

    private List<Void> list;
    private RecyclerView inputBottomRecycler;

    private List<Integer> listBanner;

    private ViewPager viewPager;

    private String[] listItems;

    private TabLayout tabLayout;

    private Banner banner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_bottom);
        listBanner = new ArrayList<>();
        listBanner.add(R.drawable.ic_banner);
        listBanner.add(R.drawable.ic_banner);
        listBanner.add(R.drawable.ic_banner);
        listBanner.add(R.drawable.ic_banner);
        banner = findViewById(R.id.my_banner);
        banner.setAdapter(new ImageAdapter(listBanner))
                .setOrientation(Banner.HORIZONTAL)
                .setIndicator(new CircleIndicator(this))
                .setDelayTime(10000);
        banner.start();
        listItems = new String[]{"关注", "推荐", "书籍"};
        tabLayout = findViewById(R.id.test_tab);
        FirstPagerAdapter adapter = new FirstPagerAdapter(getSupportFragmentManager(), listItems);
        viewPager = findViewById(R.id.vp2);

        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);




//        list = new ArrayList<>();
//        adapter = new LinearAdapter();
//        inputBottomRecycler = findViewById(R.id.input_bottom_recycler);
//        inputBottomRecycler.setAdapter(adapter);
    }
}
