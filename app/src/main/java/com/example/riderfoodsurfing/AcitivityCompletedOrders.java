package com.example.riderfoodsurfing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class AcitivityCompletedOrders extends AppCompatActivity {

    ImageButton completedOrdersBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acitivity_completed_orders);

        completedOrdersBack=findViewById(R.id.completedOrdersBack);
        completedOrdersBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(AcitivityCompletedOrders.this,navigationDrawer.class);
                startActivity(intent);
            }
        });
    }
}