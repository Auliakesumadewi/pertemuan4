package com.example.activtylifecycle2;

import static com.example.activtylifecycle2.R.id.*;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        Button btFinish = findViewById(bt_finish);
        btFinish.setOnClickListener(v->{
            finish();
        });
    }
}