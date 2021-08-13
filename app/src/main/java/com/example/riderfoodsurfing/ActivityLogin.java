package com.example.riderfoodsurfing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityLogin extends AppCompatActivity {

    Button loginBtn;
    TextView signupTxt,forgetPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginBtn= findViewById(R.id.loginBtn);
        signupTxt= findViewById(R.id.signupTxt);
        forgetPassword=findViewById(R.id.forgetPassword);


        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ActivityLogin.this, navigationDrawer.class);
                startActivity(intent);
            }
        });

        signupTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ActivityLogin.this, ActivitySignup.class);
                startActivity(intent);
            }
        });
        forgetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ActivityLogin.this,ActivityVerfiyEmail.class);
                startActivity(intent);
            }
        });
    }
}