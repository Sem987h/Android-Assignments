package com.example.myassignment.UI_Controls;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.myassignment.databinding.ActivityHideShowTvBinding;

public class Activity_Hide_Show_tv extends AppCompatActivity {

    private ActivityHideShowTvBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityHideShowTvBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.txtShow.setVisibility(View.INVISIBLE);


            binding.btnHide.setOnClickListener(view -> {

                binding.ivToon.setVisibility(View.INVISIBLE);


                binding.txtShow.setVisibility(View.VISIBLE);
                binding.txtHide.setVisibility(View.INVISIBLE);

            });

            binding.btnShow.setOnClickListener(view -> {

                binding.ivToon.setVisibility(View.VISIBLE);


                binding.txtHide.setVisibility(View.VISIBLE);
                binding.txtShow.setVisibility(View.INVISIBLE);

            });




    }
}