package com.example.myassignment.Fragment.Assignment9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.myassignment.R;
import com.example.myassignment.databinding.ActivityLoginBinding;
import com.example.myassignment.databinding.FragmentLoginBinding;
import com.example.myassignment.databinding.FragmentRegisterBinding;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding binding;
    private FragmentLoginBinding binding1;
    private FragmentRegisterBinding binding2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.holderLogin, new LoginFragment())
                    .commit();


    }

}