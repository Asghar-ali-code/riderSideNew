package com.example.riderfoodsurfing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityResetPassword extends AppCompatActivity {

    Button submitNewPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);
        submitNewPassword = findViewById(R.id.submitNewPassword);
        submitNewPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ActivityResetPassword.this,ActivityLogin.class);
                startActivity(intent);
            }
        });
    }
}