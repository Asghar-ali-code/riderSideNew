package com.example.riderfoodsurfing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ActivityRequest extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request);

        recyclerView = findViewById(R.id.recyclview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        String arr[]= {"50","60","70","50","60","70","60","70","50","60","70"};
        recyclerView.setAdapter(new ActiveRequestAdapter(arr));
    }
}