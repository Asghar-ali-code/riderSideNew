package com.example.riderfoodsurfing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivitySplashScreen2 extends AppCompatActivity {

    Button btnGetStarted;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen2);
        btnGetStarted= findViewById(R.id.btnGetStarted);
        btnGetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ActivitySplashScreen2.this,ActivityLogin.class);
                startActivity(intent);
            }
        });
    }
}