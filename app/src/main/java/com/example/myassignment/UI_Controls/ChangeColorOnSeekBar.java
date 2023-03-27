package com.example.myassignment.UI_Controls;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.widget.SeekBar;

import com.example.myassignment.databinding.ActivityChangeColorOnSeekBarBinding;

public class ChangeColorOnSeekBar extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener
{

    private ActivityChangeColorOnSeekBarBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityChangeColorOnSeekBarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.SbRed.getProgressDrawable().setColorFilter(Color.RED, PorterDuff.Mode.SRC_IN);

        binding.SbGreen.getProgressDrawable().setColorFilter(Color.GREEN, PorterDuff.Mode.SRC_IN);

        binding.SbBlue.getProgressDrawable().setColorFilter(Color.BLUE, PorterDuff.Mode.SRC_IN);

        binding.SbBlue.setOnSeekBarChangeListener(this);
        binding.SbGreen.setOnSeekBarChangeListener(this);
        binding.SbRed.setOnSeekBarChangeListener(this);


    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        int blue = binding.SbBlue.getProgress();
        int green = binding.SbGreen.getProgress();
        int red = binding.SbRed.getProgress();
        binding.ChangeOnSeek.setBackgroundColor(Color.rgb(red,green,blue));
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}