package com.example.riderfoodsurfing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class AcitivityCompletedOrders extends AppCompatActivity {

    ImageButton completedOrdersBack;
    RecyclerView recyclviewcomp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acitivity_completed_orders);

        completedOrdersBack=findViewById(R.id.completedOrdersBack);
        ///Recycl view
        recyclviewcomp= findViewById(R.id.recyclviewcomp);
        recyclviewcomp.setLayoutManager(new LinearLayoutManager(this));
        String arrComp[]={"234","45","21","190","234","45","21","190"};
        recyclviewcomp.setAdapter(new CompletedOrdersAdapter(arrComp));

        //click lister
        completedOrdersBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(AcitivityCompletedOrders.this,navigationDrawer.class);
                startActivity(intent);
                finish();
            }
        });
    }
}