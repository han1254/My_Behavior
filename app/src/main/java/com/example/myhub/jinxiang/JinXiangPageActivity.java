package com.example.myhub.jinxiang;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.myhub.R;
import com.example.myhub.databinding.ActivityJiinXiangPageBinding;

public class JinXiangPageActivity extends AppCompatActivity {

    private ActivityJiinXiangPageBinding dataBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jiin_xiang_page);
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_jiin_xiang_page);

    }
}
