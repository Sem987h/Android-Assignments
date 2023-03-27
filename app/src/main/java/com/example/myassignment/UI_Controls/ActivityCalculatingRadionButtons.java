package com.example.myassignment.UI_Controls;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;

import com.example.myassignment.databinding.ActivityCalculatingRadionButtonsBinding;

public class ActivityCalculatingRadionButtons extends AppCompatActivity {

    private ActivityCalculatingRadionButtonsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityCalculatingRadionButtonsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

           binding.rbGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
               @Override
               public void onCheckedChanged(RadioGroup radioGroup, int i) {

                   if (binding.rbAddition.isChecked()) {

                       int a = Integer.parseInt(binding.edtOneRadio.getText().toString());
                       int b = Integer.parseInt(binding.edtTwoRadio.getText().toString());

                       int c = a+b;

                       binding.btnRadioEnter.setText(String.valueOf(c));

                   }

                   if (binding.rbSubstraction.isChecked()) {

                       int a = Integer.parseInt(binding.edtOneRadio.getText().toString());
                       int b = Integer.parseInt(binding.edtTwoRadio.getText().toString());

                       int c = a-b;

                       binding.btnRadioEnter.setText(String.valueOf(c));

                   }

                   if (binding.rbMultiplication.isChecked()) {

                       int a = Integer.parseInt(binding.edtOneRadio.getText().toString());
                       int b = Integer.parseInt(binding.edtTwoRadio.getText().toString());

                       int c = a*b;

                       binding.btnRadioEnter.setText(String.valueOf(c));

                   }

                   if (binding.rbDivision.isChecked()) {

                       int a = Integer.parseInt(binding.edtOneRadio.getText().toString());
                       int b = Integer.parseInt(binding.edtTwoRadio.getText().toString());

                       int c = a/b;

                       binding.btnRadioEnter.setText(String.valueOf(c));

                   }
               }
           });

    }
}