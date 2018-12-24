package com.zm.viewflipperdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    private ViewFlipper marqueeView;
    private String[] textArray = {"华为王牌亮相，5G+4000万徕卡", "圣诞来袭，扫码关注领取大礼！", "2018即将过去，说说您的心里话"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initView() {
        marqueeView = findViewById(R.id.marqueeView);
    }

    private void initData() {
        LayoutInflater inflater = LayoutInflater.from(this);

        for (int i = 0; i < textArray.length; i++) {
            View view = inflater.inflate(R.layout.marquee_scroll_content, null);
            TextView text = view.findViewById(R.id.tv_text);
            text.setText(textArray[i]);
            marqueeView.addView(view);
        }
    }
}
