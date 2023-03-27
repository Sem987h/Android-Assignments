package com.example.myassignment.UI_Controls;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.TypedValue;

import com.example.myassignment.R;
import com.example.myassignment.databinding.ActivityIncreaseDecreaseFontBinding;

public class IncreaseDecreaseFont extends AppCompatActivity {

    private ActivityIncreaseDecreaseFontBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityIncreaseDecreaseFontBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        /// You can also use this

//        binding.tvIDCrease.setTextSize(TypedValue.COMPLEX_UNIT_PX,binding.tvIDCrease.getTextSize()+1);
//        binding.tvIDCrease.setTextSize(TypedValue.COMPLEX_UNIT_PX,binding.tvIDCrease.getTextSize()-1);


            binding.btnIncreasse.setOnClickListener(view -> {

                binding.tvIDCrease.setTextSize(0, binding.tvIDCrease.getTextSize() + 5.0f);

            });

            binding.btnDecrease.setOnClickListener(view -> {

                binding.tvIDCrease.setTextSize(0, binding.tvIDCrease.getTextSize() - 5.0f);

            });

    }
}