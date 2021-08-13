package com.example.riderfoodsurfing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

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
                Intent intent= new Intent(ActivityRiderAddress.this,navigationDrawer.class);
                startActivity(intent);
            }
        });
        submitAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ActivityRiderAddress.this,navigationDrawer.class);
                startActivity(intent);
            }
        });
    }
}