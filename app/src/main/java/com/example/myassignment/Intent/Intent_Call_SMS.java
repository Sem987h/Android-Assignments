package com.example.myassignment.Intent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.TestLooperManager;

import com.example.myassignment.databinding.ActivityIntentCallSmsBinding;

public class Intent_Call_SMS extends AppCompatActivity {

    private ActivityIntentCallSmsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityIntentCallSmsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnCall.setOnClickListener(view -> {

//            Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "7202840784"));
//            startActivity(callIntent);

            Intent i = new Intent(Intent.ACTION_DIAL);
            String p = ("tel:" + "7202840784");
            i.setData(Uri.parse(p));
            startActivity(i);

        });


        String phoneNo = "7202840784";
        String sms= "Hi my name is Hemnag Goswami";
        binding.btnSms.setOnClickListener(view -> {

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", phoneNo, null));
            intent.putExtra("sms_body",sms);
            startActivity(intent);

        });

        binding.btnMail.setOnClickListener(view -> {

            Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                    "mailto","hemanggoswami987@email.com", null));
            intent.putExtra(Intent.EXTRA_SUBJECT, "Testing");
            intent.putExtra(Intent.EXTRA_TEXT, "Hii I'm Hemang");
            startActivity(Intent.createChooser(intent, "Choose an Email client :"));

        });


    }
}