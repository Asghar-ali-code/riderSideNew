package com.example.riderfoodsurfing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivitySetting extends AppCompatActivity {

    Button btnUpdateSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        btnUpdateSetting= findViewById(R.id.btnUpdateSetting);
        btnUpdateSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ActivitySetting.this, "You information Update Succefully", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

    }
}