package com.example.riderfoodsurfing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
 Button btnSplash,btnSignup,btnPutOpt,btnCompletedOrders,btnCheckActiveRequest,btnLiveLocation,btnLogin,btnHome,btnSetting,btnLive,btnRiderAddres,privacyPolicay,btnRiderEarning,btnRetypePassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSplash= findViewById(R.id.btnSplash);
        btnSplash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, ActivitySplashScreen2.class);
                startActivity(intent);
            }
        });

        btnSignup=findViewById(R.id.btnSingup);

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, ActivitySignup.class);
                startActivity(intent);
            }
        });

        btnLogin=findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, ActivityLogin.class);
                startActivity(intent);
            }
        });
        btnHome=findViewById(R.id.btnHome);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, navigationDrawer.class);
                startActivity(intent);
            }
        });
        btnSetting=findViewById(R.id.btnSetting);

        btnSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, ActivitySetting.class);
                startActivity(intent);
            }
        });

        btnLive= findViewById(R.id.btnLive);
        btnLive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, ActivityLiveTrackig.class);
                startActivity(intent);
            }
        });


        privacyPolicay= findViewById(R.id.privacyPolicay);
        privacyPolicay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, ActivityPrivacyPolicy.class);
                startActivity(intent);
            }
        });

        btnRiderAddres= findViewById(R.id.btnRiderAddres);
        btnRiderAddres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, ActivityRiderAddress.class);
                startActivity(intent);
            }
        });
        btnRiderEarning= findViewById(R.id.btnRiderEarning);

        btnRiderEarning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, ActivityRiderEarning.class);
                startActivity(intent);
            }
        });
        btnRetypePassword= findViewById(R.id.btnRetypePassword);
        btnRetypePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, ActivityVerfiyEmail.class);
                startActivity(intent);
            }
        });

        btnPutOpt= findViewById(R.id.btnPutOpt);
        btnPutOpt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, ActivityPutOtp.class);
                startActivity(intent);
            }
        });

        btnLiveLocation= findViewById(R.id.btnLiveLocation);
        btnLiveLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, ActivityLiveTrackig.class);
                startActivity(intent);
            }
        });

        btnCheckActiveRequest = findViewById(R.id.btnCheckActiveRequest);
        btnCheckActiveRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,ActivityActiveOrders.class);
                startActivity(intent);
            }
        });

        btnCompletedOrders = findViewById(R.id.btnCompletedOrders);
        btnCompletedOrders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,AcitivityCompletedOrders.class);
                startActivity(intent);
            }
        });
    }
}