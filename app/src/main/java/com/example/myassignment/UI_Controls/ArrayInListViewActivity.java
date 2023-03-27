package com.example.myassignment.UI_Controls;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.example.myassignment.R;
import com.example.myassignment.databinding.ActivityArrayInListViewBinding;

public class ArrayInListViewActivity extends AppCompatActivity {

    private ActivityArrayInListViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityArrayInListViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        }
}