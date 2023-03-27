package com.example.myassignment.UI_Controls;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.myassignment.databinding.ActivityUiInputReverseNumBinding;

import java.util.HashMap;

public class Activity_Ui_Input_Reverse_Num extends AppCompatActivity {

    private ActivityUiInputReverseNumBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityUiInputReverseNumBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        HashMap<Character, Integer> charCountMap;
        charCountMap = new HashMap<>();

        binding.btnDownArrow.setOnClickListener(view -> {

            if(!binding.txtInput.getText().toString().isEmpty()){
                StringBuffer c = new StringBuffer(binding.txtInput.getText().toString());
                binding.txtOutputReverse.setText(c.reverse());
                Toast.makeText(Activity_Ui_Input_Reverse_Num.this, "Inserted", Toast.LENGTH_LONG).show();
            }   else {
                binding.txtInput.setError("Enter Number");
            }

        });

    }
}