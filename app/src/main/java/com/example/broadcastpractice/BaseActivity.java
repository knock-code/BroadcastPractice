package com.example.broadcastpractice;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

/**自定义活动类，继承自此类自动添加到Activity管理类*/
public class BaseActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);
    }
}
