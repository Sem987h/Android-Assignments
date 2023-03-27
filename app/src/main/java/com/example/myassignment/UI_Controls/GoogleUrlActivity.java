package com.example.myassignment.UI_Controls;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;

import android.os.Bundle;
import android.webkit.WebViewClient;

import com.example.myassignment.databinding.ActivityGoogleUrlBinding;

public class GoogleUrlActivity extends AppCompatActivity {

    private ActivityGoogleUrlBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityGoogleUrlBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.WebWiew.setWebViewClient(new WebViewClient());

        binding.WebWiew.loadUrl("https://www.google.com");

    }

    public void onBackPressed() {
        if (binding.WebWiew.canGoBack()) {
            binding.WebWiew.goBack();
        }
        else {
            super.onBackPressed();
        }
    }

}