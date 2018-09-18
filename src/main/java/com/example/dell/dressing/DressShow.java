package com.example.dell.dressing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class DressShow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dress_show);
        Intent intent = getIntent();
        Log.d("height", intent.getStringExtra("height"));
        Log.d("position", intent.getStringExtra("position"));
    }
}
