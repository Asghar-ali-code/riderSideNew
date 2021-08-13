package com.example.riderfoodsurfing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivitySignup extends AppCompatActivity {

    Button SignupBtn;
    TextView loginTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        SignupBtn= findViewById(R.id.SignupBtn);
        SignupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ActivitySignup.this, navigationDrawer.class);
                startActivity(intent);
                finish();
            }
        });
        loginTxt= findViewById(R.id.loginTxt);
        loginTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ActivitySignup.this, ActivityLogin.class);
                startActivity(intent);
                finish();
            }
        });
    }
}