package com.example.riderfoodsurfing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ActivityActiveOrders extends AppCompatActivity {
  ImageButton requestProgressBack;
  RecyclerView recyclviewPro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_active_orders);
        //Recycl View
        recyclviewPro=findViewById(R.id.recyclviewPro);
        recyclviewPro.setLayoutManager(new LinearLayoutManager(this));
        String activeOrders[]={"23","122","56","90","23","122","56","90"};
        recyclviewPro.setAdapter(new ActiveOrdersAdapter(activeOrders));


        // Clickk listner
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