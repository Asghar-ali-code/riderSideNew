package com.example.riderfoodsurfing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ActivityPrivacyPolicy extends AppCompatActivity {

    ImageButton privacyPolicyBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_policy);

        privacyPolicyBack=findViewById(R.id.privacyPolicyBack);
        privacyPolicyBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ActivityPrivacyPolicy.this,navigationDrawer.class);
                startActivity(intent);
                finish();
            }
        });
    }
}