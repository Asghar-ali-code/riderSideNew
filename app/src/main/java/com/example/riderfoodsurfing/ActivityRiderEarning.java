package com.example.riderfoodsurfing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ActivityRiderEarning extends AppCompatActivity {

    ImageButton riderEarningBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rider_earning);
        riderEarningBack= findViewById(R.id.riderEarningBack);
        riderEarningBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ActivityRiderEarning.this,navigationDrawer.class);
                startActivity(intent);
            }
        });
    }
}