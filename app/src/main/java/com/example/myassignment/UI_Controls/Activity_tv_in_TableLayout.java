package com.example.myassignment.UI_Controls;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myassignment.databinding.ActivityTvInTableLayoutBinding;

public class Activity_tv_in_TableLayout extends AppCompatActivity {

    private ActivityTvInTableLayoutBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityTvInTableLayoutBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



    }
}