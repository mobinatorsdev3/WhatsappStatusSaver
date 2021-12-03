package com.example.spinnerloadingscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.lusfold.spinnerloading.SpinnerLoading;

public class MainActivity extends AppCompatActivity {
    SpinnerLoading spl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spl = findViewById(R.id.spinnerloading);
        spl.setPaintMode(1);
        spl.setCircleRadius(30);

    }
}