package com.example.riderfoodsurfing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ActivityRequest extends AppCompatActivity {

    RecyclerView recyclerView;
    ImageButton newRequestBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request);

        recyclerView = findViewById(R.id.recyclview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        String arr[]= {"50","60","70","50","60","70","60","70","50","60","70"};
        recyclerView.setAdapter(new ActiveRequestAdapter(arr));

        newRequestBack= findViewById(R.id.newRequestBack);
        newRequestBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ActivityRequest.this,navigationDrawer.class);
                startActivity(intent);
                finish();
            }
        });

    }
}