package com.example.hyenatestforegroundservice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Bike bike = new Bike();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.util.Log.d(TAG, "onCreate: bike connect");
        bike.connect();

        android.util.Log.d(TAG, "onCreate: bike disconnect");
        bike.disconnect();
    }
}
