package com.example.riderfoodsurfing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPutOtp extends AppCompatActivity {

    Button btnSubmitCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_put_otp);
        btnSubmitCode= findViewById(R.id.btnSubmitCode);
        btnSubmitCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ActivityPutOtp.this,ActivityResetPassword.class);
                startActivity(intent);
            }
        });
    }
}