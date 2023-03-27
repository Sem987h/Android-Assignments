package com.example.myassignment;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;

import android.app.Activity;
import android.app.WallpaperManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.myassignment.Activity.Activity_I2_I3_LifeCycle;
import com.example.myassignment.Activity.Assignment5.Assignment_5_Input_Activity;
import com.example.myassignment.Activity.Assignment_6_Calculator;
import com.example.myassignment.Fragment.Assignment9.LoginActivity;
import com.example.myassignment.Fragment.Fragment_I1_SplashScreen;
import com.example.myassignment.Intent.Intent_Call_SMS;
import com.example.myassignment.UI_Controls.ActivityCalculatingRadionButtons;
import com.example.myassignment.UI_Controls.Activity_Hide_Show_tv;
import com.example.myassignment.UI_Controls.Activity_Ui_Input_Reverse_Num;
import com.example.myassignment.UI_Controls.Activity_tv_in_TableLayout;
import com.example.myassignment.UI_Controls.ArrayInListViewActivity;
import com.example.myassignment.UI_Controls.ChangeBackgroundActivity;
import com.example.myassignment.UI_Controls.ChangeColorOnRadioBtn;
import com.example.myassignment.UI_Controls.ChangeColorOnSeekBar;
import com.example.myassignment.UI_Controls.DisplayTextViewActivity;
import com.example.myassignment.UI_Controls.EnterEdtTxtActivity;
import com.example.myassignment.UI_Controls.GoogleUrlActivity;
import com.example.myassignment.UI_Controls.IncreaseDecreaseFont;
import com.example.myassignment.databinding.ActivityMainBinding;
import com.example.myassignment.databinding.HeaderMenuNdBinding;
import com.example.myassignment.databinding.NoInternetAssignment14Binding;
import com.example.myassignment.databinding.SumAssignment4Binding;

import org.w3c.dom.Document;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding1;
    private SumAssignment4Binding binding2;
    private NoInternetAssignment14Binding binding3;
    private HeaderMenuNdBinding binding4;
    private File url;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding1 = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding1.getRoot());
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);



        /// URI
        ActivityResultLauncher<String> get = registerForActivityResult(new ActivityResultContracts.GetContent(), new ActivityResultCallback<Uri>() {
            @Override
            public void onActivityResult(Uri result) {

            }
        });



        /// Navigation Drawer Header
//        binding4.txtAPI.setOnClickListener(view -> {
//
//
//
//        });





        binding1.assignmet23.setOnClickListener(view -> {

            Intent intent=new Intent(MainActivity.this, Activity_I2_I3_LifeCycle.class);
            startActivity(intent);

        });


        binding1.assignment4.setOnClickListener(view -> {

            binding2=SumAssignment4Binding.inflate(getLayoutInflater());
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

            builder.setTitle("Addition");

            builder.setMessage("Click Equlas Button For Answer");

            builder.setView(binding2.getRoot());

            builder.setCancelable(true);

            binding2.equal.setOnClickListener(view1 -> {

                int x = Integer.parseInt(binding2.sumtxt1.getText().toString());
                int y = Integer.parseInt(binding2.sumtxt2.getText().toString());

                int z = x+y;

                binding2.textViewSum.setText(String.valueOf(z));

            });

            builder.show();

            builder.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public void onDismiss(DialogInterface dialogInterface) {
                    binding2.getRoot().removeAllViews();
                }
            });
        });


        binding1.assignment5.setOnClickListener(view -> {

            Intent intent = new Intent(MainActivity.this, Assignment_5_Input_Activity.class);
            startActivity(intent);

        });


        binding1.assignment6.setOnClickListener(view -> {

            Intent intent = new Intent(MainActivity.this, Assignment_6_Calculator.class);
            startActivity(intent);

        });


        binding1.assignment7.setOnClickListener(view -> {

            Intent intent = new Intent(MainActivity.this, Intent_Call_SMS.class);
            startActivity(intent);

        });


        binding1.assignment8.setOnClickListener(view -> {

            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.drawer_layout, new Fragment_I1_SplashScreen())
                    .commit();


            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    Intent intent=new Intent(MainActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();

                }
            },5000);

        });


        binding1.assignment910.setOnClickListener(view -> {

            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);

        });

        binding1.assignment11.setOnClickListener(view -> {

            Intent intent = new Intent(MainActivity.this, Activity_Ui_Input_Reverse_Num.class);
            startActivity(intent);

        });

        binding1.assignment12.setOnClickListener(view -> {

            Intent intent = new Intent(MainActivity.this, ActivityCalculatingRadionButtons.class);
            startActivity(intent);

        });

        binding1.assignment13.setOnClickListener(view -> {

//            Uri uri = Uri.parse("https://www.google.com");
//            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
//            startActivity(intent);

            Intent intent = new Intent(MainActivity.this, GoogleUrlActivity.class);
            startActivity(intent);

        });

        binding1.assignment14.setOnClickListener(view -> {
            if (!isConnected()){

                binding3=NoInternetAssignment14Binding.inflate(getLayoutInflater());

                AlertDialog.Builder builder = new AlertDialog.Builder(this);

                builder.setView(binding3.getRoot());
                builder.setCancelable(true);
                builder.show();


                binding3.btnTryAgain.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        if (!isConnected()){
                            Toast.makeText(MainActivity.this, "Try Again", Toast.LENGTH_SHORT).show();
                        }
                        if (isConnected()){

                            binding3.getRoot().removeAllViews();

                            Toast.makeText(MainActivity.this, "Internet is Connected", Toast.LENGTH_SHORT).show();

                        }

                    }
                });


                builder.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public void onDismiss(DialogInterface dialogInterface) {
                        binding3.getRoot().removeAllViews();
                    }
                });

                Toast.makeText(MainActivity.this, "Internet is Not Connected", Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(MainActivity.this, "Internet is Connected", Toast.LENGTH_SHORT).show();
            }

        });


        binding1.assignment15.setOnClickListener(view -> {

            Intent intent = new Intent(MainActivity.this, Activity_Hide_Show_tv.class);
            startActivity(intent);

        });

        binding1.assignment16.setOnClickListener(view -> {

            Intent intent = new Intent(MainActivity.this, Activity_tv_in_TableLayout.class);
            startActivity(intent);

        });

        binding1.assignment17.setOnClickListener(view -> {

            get.launch("application/pdf");

        });

        binding1.assignment18.setOnClickListener(view -> {

            Intent intent = new Intent(MainActivity.this, ChangeBackgroundActivity.class);
            startActivity(intent);

        });

        binding1.assignment19.setOnClickListener(view -> {

            Intent intent = new Intent(MainActivity.this, IncreaseDecreaseFont.class);
            startActivity(intent);

        });

        binding1.assignment20.setOnClickListener(view -> {

            Intent intent = new Intent(MainActivity.this, EnterEdtTxtActivity.class);
            startActivity(intent);

        });

        binding1.assignment21.setOnClickListener(view -> {

            Intent intet = new Intent(MainActivity.this, DisplayTextViewActivity.class);
            startActivity(intet);

        });

        binding1.assignment22.setOnClickListener(view -> {

            Intent intent = new Intent(MainActivity.this, ArrayInListViewActivity.class);
            startActivity(intent);

        });

        binding1.assignment23.setOnClickListener(view -> {

            Intent intent = new Intent(MainActivity.this, ChangeColorOnRadioBtn.class);
            startActivity(intent);

        });

        binding1.assignment24.setOnClickListener(view -> {

            Intent intent = new Intent(MainActivity.this, ChangeColorOnSeekBar.class);
            startActivity(intent);


        });

        binding1.assignment25.setOnClickListener(view -> {



        });

        binding1.assignment26.setOnClickListener(view -> {



        });

        binding1.assignment27.setOnClickListener(view -> {



        });

        binding1.assignment28.setOnClickListener(view -> {



        });

        binding1.assignment29.setOnClickListener(view -> {



        });

        binding1.assignment30.setOnClickListener(view -> {



        });


















        /// Floating Button
        binding1.fabUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                BottomSheetFragment bottomSheetFragment = new BottomSheetFragment();
                bottomSheetFragment.show(getSupportFragmentManager(), bottomSheetFragment.getTag());

            }
        });



        /// Bottom App Bar
        binding1.bottomAppBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if(item.getItemId()==R.id.nd_menu){
                    binding1.drawerLayout.openDrawer(Gravity.RIGHT);
                }
                return false;
            }
        });


    }

    /// Back Pressed
    @Override
    public void onBackPressed() {
        if (binding1.drawerLayout.isDrawerOpen(GravityCompat.END)) {
            binding1.drawerLayout.closeDrawer(GravityCompat.END);
        }
        else {
            super.onBackPressed();
        }
    }

    /// Network Connected or not
    private boolean isConnected(){

        ConnectivityManager connectivityManager = (ConnectivityManager) getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        return connectivityManager.getActiveNetworkInfo()!=null && connectivityManager.getActiveNetworkInfo().isConnectedOrConnecting();

    }


}