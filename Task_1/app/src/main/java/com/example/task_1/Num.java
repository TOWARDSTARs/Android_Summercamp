package com.example.task_1;

import android.app.Activity;

public class Num extends Activity {
    public static int content;

    public Num( int content) {
        this.content = content;
    }

    public static int getContent() {
        return content;
    }
}