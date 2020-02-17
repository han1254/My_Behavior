package com.example.myhub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myhub.databinding.ActivityWelcomeBinding;
import com.example.myhub.inputbottom.InputBottomActivity;
import com.example.myhub.jinxiang.JinXiangPageActivity;

import java.util.List;

public class WelcomeActivity extends AppCompatActivity {

    private ActivityWelcomeBinding databinding;
    private List<Void> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        databinding = DataBindingUtil.setContentView(this, R.layout.activity_welcome);

        databinding.btnBottomInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WelcomeActivity.this, InputBottomActivity.class));
            }
        });

        databinding.btnJinxiang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WelcomeActivity.this, JinXiangPageActivity.class));
            }
        });
    }
}
