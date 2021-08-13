package com.example.riderfoodsurfing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class ActivityRiderAddress extends AppCompatActivity {

    ImageButton riderAddressBack;
    Button submitAddress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rider_address);

        riderAddressBack=findViewById(R.id.riderAddressBack);
        submitAddress= findViewById(R.id.submitAddress);
        riderAddressBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               finish();
            }
        });
        submitAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ActivityRiderAddress.this, "Address is saved", Toast.LENGTH_SHORT).show();
//
            }
        });
    }
}