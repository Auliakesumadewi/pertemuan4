package com.example.activtylifecycle2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private  final String LOG = this.getClass().getSimpleName();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        @SuppressLint({"MissingInflatedId","LocalSuppress"})
        Button btshowsecond = findViewById(R.id.bt_show_second);

        btshowsecond.setOnClickListener(o ->{
            Intent intent = new Intent(  this, SecondActivity.class);
            startActivity(intent);
        });
        Log.d(LOG, "-- onCreate()--");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG, "onStart() --");
    }
}