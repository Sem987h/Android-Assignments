package com.example.myassignment.UI_Controls;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;

import com.example.myassignment.databinding.ActivityDisplayTextViewBinding;

public class DisplayTextViewActivity extends AppCompatActivity {

    private ActivityDisplayTextViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityDisplayTextViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

            binding.ivAvatar.setVisibility(View.INVISIBLE);

            binding.cbDisplay.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                    if (binding.cbDisplay.isChecked())
                    {
                        binding.ivAvatar.setVisibility(View.VISIBLE);
                        binding.txtShow.setVisibility(View.INVISIBLE);
                    }
                    else
                    {
                        binding.ivAvatar.setVisibility(View.INVISIBLE);
                        binding.txtShow.setVisibility(View.VISIBLE);
                    }

                }
            });

    }
}