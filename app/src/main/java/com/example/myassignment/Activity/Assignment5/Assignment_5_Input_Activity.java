package com.example.myassignment.Activity.Assignment5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myassignment.databinding.Assignment5InputBinding;
import com.example.myassignment.databinding.Assignment5InputBinding;

public class Assignment_5_Input_Activity extends AppCompatActivity {


    private Assignment5InputBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=Assignment5InputBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = binding.edttxtname.getText().toString();
                String bd = binding.edttxtbd.getText().toString();
                String email = binding.edttxtemail.getText().toString();
                String phone = binding.edttxtnum.getText().toString();
                String address = binding.edttxtadd.getText().toString();

                Intent intent1 = new Intent(Assignment_5_Input_Activity.this, Assignment_5_Output_Activity.class);
                intent1.putExtra("data1", name);

                intent1.putExtra("data2", bd);

                intent1.putExtra("data3", email);

                intent1.putExtra("data4", phone);

                intent1.putExtra("data5", address);

                startActivity(intent1);
            }
        });

    }
}