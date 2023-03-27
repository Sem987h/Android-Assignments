package com.example.myassignment.UI_Controls;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.example.myassignment.R;
import com.example.myassignment.databinding.ActivityChangeColorOnRadioBtnBinding;

public class ChangeColorOnRadioBtn extends AppCompatActivity {

    private ActivityChangeColorOnRadioBtnBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityChangeColorOnRadioBtnBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.RvRed.setOnClickListener(view -> {

            binding.changeOnRadio.setBackgroundColor(Color.RED);
            binding.RvRed.setTextColor(Color.WHITE);

        });

        binding.RvBlue.setOnClickListener(view -> {

            binding.changeOnRadio.setBackgroundColor(Color.BLUE);

            binding.RvBlue.setTextColor(Color.WHITE);

        });

        binding.RvGreen.setOnClickListener(view -> {

            binding.changeOnRadio.setBackgroundColor(Color.GREEN);

        });

    }
}