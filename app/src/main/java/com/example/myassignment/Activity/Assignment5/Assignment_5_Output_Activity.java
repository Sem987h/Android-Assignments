package com.example.myassignment.Activity.Assignment5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.myassignment.databinding.Assignment5OutputBinding;

public class Assignment_5_Output_Activity extends AppCompatActivity {

    private Assignment5OutputBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=Assignment5OutputBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent=getIntent();

        String mystring1 = intent.getStringExtra("data1");
        String mystring2 = intent.getStringExtra("data2");
        String mystring3 = intent.getStringExtra("data3");
        String mystring4 = intent.getStringExtra("data4");
        String mystring5 = intent.getStringExtra("data5");


        if(mystring1!=null){
            binding.txtname.setText(mystring1);
        }
        if(mystring2!=null){
            binding.txtbd.setText(mystring2);
        }
        if(mystring3!=null){
            binding.txtemail.setText(mystring3);
        }
        if(mystring4!=null){
            binding.txtnum.setText(mystring4);
        }
        if(mystring5!=null){
            binding.txtadd.setText(mystring5);
        }

    }
}