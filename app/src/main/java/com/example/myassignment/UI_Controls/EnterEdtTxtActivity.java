package com.example.myassignment.UI_Controls;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.myassignment.databinding.ActivityEnterEdtTxtBinding;

public class EnterEdtTxtActivity extends AppCompatActivity {

    private ActivityEnterEdtTxtBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityEnterEdtTxtBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

            binding.btnCrtEdtTxt.setOnClickListener(view -> {

                if (binding.edtNoCrtEdtTxt.getText().toString().length()>0){
                    try {
                        binding.ScrollEdtTxt.removeAllViews();
                    }
                    catch (Throwable e){
                        e.printStackTrace();
                    }

                    int lenght = Integer.parseInt(binding.edtNoCrtEdtTxt.getText().toString());

                    for (int i=0;i<lenght;i++){

                        EditText editText = new EditText(EnterEdtTxtActivity.this);
                        editText.setId(i+1);
                        editText.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                        editText.setHint("EditText "+(i+1));
                        binding.ScrollEdtTxt.addView(editText);

                    }
                }
            });

    }
}