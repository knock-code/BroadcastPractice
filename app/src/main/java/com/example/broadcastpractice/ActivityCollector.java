package com.example.broadcastpractice;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

public class ActivityCollector {
    public static List<Activity> activities = new ArrayList<>();
    //添加
    public static void addActivity(Activity activity){
        activities.add(activity);
    }
    //删除
    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }
    //全部退出栈
    public static void finishAll(){
        for (Activity activity : activities){
            if (!activity.isFinishing()){
                activity.finish();
            }
        }
    }
}
