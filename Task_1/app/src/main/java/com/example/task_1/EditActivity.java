package com.example.task_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EditActivity  extends AppCompatActivity{

    EditText et;
    private String content;
    private String time;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_layout);
        et = findViewById(R.id.et);

    }

}