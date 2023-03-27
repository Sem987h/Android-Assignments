package com.example.myassignment.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.myassignment.MainActivity;
import com.example.myassignment.databinding.ActivityI1SplashscreenBinding;

public class Activity_I1_SplashScreen extends AppCompatActivity {

    private ActivityI1SplashscreenBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityI1SplashscreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent=new Intent(Activity_I1_SplashScreen.this, MainActivity.class);
                startActivity(intent);
                finish();

            }
        },5000);

    }
}