package com.example.myassignment.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.myassignment.databinding.ActivityI2I3LifeCycleBinding;

public class Activity_I2_I3_LifeCycle extends AppCompatActivity {

    private ActivityI2I3LifeCycleBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityI2I3LifeCycleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Toast.makeText(getApplicationContext(), "onCreate", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        Toast.makeText(getApplicationContext(), "onStart", Toast.LENGTH_LONG).show();
        super.onStart();
    }

    @Override
    protected void onPause() {
        Toast.makeText(getApplicationContext(), "onPause", Toast.LENGTH_LONG).show();
        super.onPause();
    }

    @Override
    protected void onResume() {
        Toast.makeText(getApplicationContext(), "onResume", Toast.LENGTH_LONG).show();
        super.onResume();
    }

    @Override
    protected void onRestart() {
        Toast.makeText(getApplicationContext(), "onRestart", Toast.LENGTH_LONG).show();
        super.onRestart();
    }

    @Override
    protected void onStop() {
        Toast.makeText(getApplicationContext(), "onStop", Toast.LENGTH_LONG).show();
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Toast.makeText(getApplicationContext(), "onDestroy", Toast.LENGTH_LONG).show();
        super.onDestroy();
    }

}