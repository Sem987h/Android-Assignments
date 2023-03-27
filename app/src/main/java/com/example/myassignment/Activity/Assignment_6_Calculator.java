package com.example.myassignment.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.view.View;

import com.example.myassignment.databinding.ActivityAssignment6CalculatorBinding;

import java.util.ArrayList;

public class Assignment_6_Calculator extends AppCompatActivity {

    private ActivityAssignment6CalculatorBinding binding;
    private ArrayList<Character> list;

    int number=0;
    int number2=0;

    //    boolean Add, Sub, Multiply, Divide, Remainder, deci;×÷

    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityAssignment6CalculatorBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        binding.clcBigTv.setShowSoftInputOnFocus(false);

        binding.clcBtnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = binding.clcBigTv.getText().toString();
                binding.clcBigTv.setText(data+"0");
            }
        });

        binding.clcBtnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = binding.clcBigTv.getText().toString();
                binding.clcBigTv.setText(data+".");


            }
        });

        binding.clcBtnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = binding.clcBigTv.getText().toString();

                binding.clcBigTv.setText(data+"1");

            }
        });

        binding.clcBtnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = binding.clcBigTv.getText().toString();
                binding.clcBigTv.setText(data+"2");

            }
        });

        binding.clcBtnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = binding.clcBigTv.getText().toString();
                binding.clcBigTv.setText(data+"3");

            }
        });

        binding.clcBtnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = binding.clcBigTv.getText().toString();
                binding.clcBigTv.setText(data+"4");
            }
        });

        binding.clcBtnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = binding.clcBigTv.getText().toString();
                binding.clcBigTv.setText(data+"5");
            }
        });

        binding.clcBtnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = binding.clcBigTv.getText().toString();
                binding.clcBigTv.setText(data+"6");
            }
        });

        binding.clcBtnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = binding.clcBigTv.getText().toString();
                binding.clcBigTv.setText(data+"7");
            }
        });

        binding.clcBtnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = binding.clcBigTv.getText().toString();
                binding.clcBigTv.setText(data+"8");
            }
        });

        binding.clcBtnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = binding.clcBigTv.getText().toString();
                binding.clcBigTv.setText(data+"9");
            }
        });

        binding.clcBtnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data =  binding.clcBigTv.getText().toString();
                Character ch ='+';

                if(data.contains(ch.toString())){
                    String separator ="+";
                    int sepPos = data.indexOf(separator);
                    number2 = Integer.parseInt(data.substring(sepPos+separator.length()));


                    binding.clcSmallTv.setText(data);
                    binding.clcBigTv.setText(String.valueOf(number+number2));
                }
                number = number2 + Integer.parseInt(binding.clcBigTv.getText().toString());
                binding.clcBigTv.setText(number+"+");


            }
        });

        binding.clcBtnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = binding.clcBigTv.getText().toString();
                Character ch = '-';

                if(data.contains((ch.toString()))){
                    String separator = "-";
                    int sepPos = data.indexOf(separator);
                    number2 = Integer.parseInt(data.substring(sepPos+separator.length()));

                    binding.clcSmallTv.setText(data);
                    binding.clcBigTv.setText(String.valueOf(number-number2));
                }
                number = number2 = Integer.parseInt(binding.clcBigTv.getText().toString());
                binding.clcBigTv.setText(number+"-");

            }
        });

        binding.clcBtnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data =  binding.clcBigTv.getText().toString();
                Character ch ='×';

                if(data.contains(ch.toString())){
                    String separator ="×";
                    int sepPos = data.indexOf(separator);
                    number2 = Integer.parseInt(data.substring(sepPos+separator.length()));


                    binding.clcSmallTv.setText(data);
                    binding.clcBigTv.setText(String.valueOf(number*number2));
                }
                number = number2 + Integer.parseInt(binding.clcBigTv.getText().toString());
                binding.clcBigTv.setText(number+"×");


            }
        });

        binding.clcBtnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = binding.clcBigTv.getText().toString();
                Character ch = '÷';

                if(data.contains((ch.toString()))){
                    String separator = "÷";
                    int sepPos = data.indexOf(separator);
                    number2 = Integer.parseInt(data.substring(sepPos+separator.length()));

                    binding.clcSmallTv.setText(data);
                    binding.clcBigTv.setText(String.valueOf(number/number2));
                }
                number = number2 = Integer.parseInt(binding.clcBigTv.getText().toString());
                binding.clcBigTv.setText(number+"÷");
            }
        });

        binding.clcBtnPersentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = binding.clcBigTv.getText().toString();
                binding.clcBigTv.setText(data+"%");
            }
        });

        binding.clcBtnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String data =  binding.clcBigTv.getText().toString();
                Character ch1 ='+';
                Character ch2 ='-';
                Character ch3 ='×';
                Character ch4 ='÷';

                if(data.contains(ch1.toString())){
                    String separator ="+";
                    int sepPos = data.indexOf(separator);
                    number2 = Integer.parseInt(data.substring(sepPos+separator.length()));

                    binding.clcSmallTv.setText(data);
                    binding.clcBigTv.setText(String.valueOf(number+number2));


                }
                if(data.contains((ch2.toString()))){
                    String separator ="-";
                    int sepPos = data.indexOf(separator);
                    number2 = Integer.parseInt(data.substring(sepPos+separator.length()));

                    binding.clcSmallTv.setText(data);
                    binding.clcBigTv.setText(String.valueOf(number-number2));
                }


                if(data.contains((ch3.toString()))) {
                    String separator = "×";
                    int sepPos = data.indexOf(separator);
                    number2 = Integer.parseInt(data.substring(sepPos + separator.length()));

                    binding.clcSmallTv.setText(data);
                    binding.clcBigTv.setText(String.valueOf(number*number2));
                }


                if(data.contains((ch4.toString()))) {
                    String separator = "÷";
                    int sepPos = data.indexOf(separator);
                    number2 = Integer.parseInt(data.substring(sepPos + separator.length()));

                    binding.clcSmallTv.setText(data);
                    binding.clcBigTv.setText(String.valueOf(number/number2));
                }


                number=0;
                number2=0;
            }

        });

        binding.clcBtnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

        binding.clcBtnClear.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                binding.clcBigTv.setText("0");
                binding.clcSmallTv.setText(" ");
                return false;
            }
        });


    }
}