package com.example.riderfoodsurfing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ActivityActiveOrders extends AppCompatActivity {
  ImageButton requestProgressBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_active_orders);

        requestProgressBack=  findViewById(R.id.requestProgressBack);
        requestProgressBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ActivityActiveOrders.this,navigationDrawer.class);
                startActivity(intent);
                finish();
            }
        });

    }
}