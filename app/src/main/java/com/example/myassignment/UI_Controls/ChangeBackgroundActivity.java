package com.example.myassignment.UI_Controls;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.myassignment.R;
import com.example.myassignment.databinding.ActivityChangeBackgroundBinding;

public class ChangeBackgroundActivity extends AppCompatActivity {

    private ActivityChangeBackgroundBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityChangeBackgroundBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


//        ButtonName.setBackgroundDrawable(getResources().getDrawable(R.drawable.ImageName));


        binding.btnNight.setOnClickListener(view -> {

            binding.ivNight.setVisibility(View.VISIBLE);
            binding.ivMorning.setVisibility(View.INVISIBLE);

        });

        binding.btnMorning.setOnClickListener(view -> {

            binding.ivNight.setVisibility(View.INVISIBLE);
            binding.ivMorning.setVisibility(View.VISIBLE);

        });

    }
}