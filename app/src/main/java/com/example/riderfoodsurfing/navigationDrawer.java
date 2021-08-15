package com.example.riderfoodsurfing;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.navigation.NavigationView;

public class navigationDrawer extends AppCompatActivity {

    NavigationView navigationView1;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    TextView textView,MyEarning,myLocation,privacyPolicy;
    Button btnCheckNewRequest,btnCheckActiveRequest,btnCompletedOrders;


    NavigationMenu navigationMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        navigationView1 = findViewById(R.id.navmenu);
        drawerLayout = findViewById(R.id.drawer);

        textView= findViewById(R.id.payable);


        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();



//        getSupportActionBar().setHomeButtonEnabled(true);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//
//       //etSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrowback);
        toolbar.post(new Runnable() {
            @Override
            public void run() {
                Drawable d = ResourcesCompat.getDrawable(getResources(), R.drawable.ic_drawer, null);
                toolbar.setNavigationIcon(d);
            }
        });
               // Onclick listener
        btnCheckNewRequest =findViewById(R.id.btnCheckNewRequest);
        btnCheckActiveRequest= findViewById(R.id.btnCheckActiveRequest);
        btnCompletedOrders= findViewById(R.id.btnCompletedOrders);
        MyEarning= findViewById(R.id.MyEarning);
        myLocation= findViewById(R.id.myLocation);
        privacyPolicy= findViewById(R.id.privacyPolicy);

        btnCheckNewRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(navigationDrawer.this,ActivityRequest.class);
                startActivity(intent);
                finish();
            }
        });

        btnCheckActiveRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(navigationDrawer.this,ActivityActiveOrders.class);
                startActivity(intent);
                finish();
            }
        });
        btnCompletedOrders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(navigationDrawer.this,AcitivityCompletedOrders.class);
                startActivity(intent);
                finish();
            }
        });
        MyEarning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(navigationDrawer.this,ActivityRiderEarning.class);
                startActivity(intent);
                finish();
            }
        });
        myLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(navigationDrawer.this,ActivityRiderAddress.class);
                startActivity(intent);
                finish();
            }
        });
        privacyPolicy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(navigationDrawer.this,ActivityPrivacyPolicy.class);
                startActivity(intent);
                finish();
            }
        });


//        navigationView1.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//
//                navigationView1.setCheckedItem(item.getItemId());
//                switch (item.getItemId()) {
//                    case R.id.firstMenu:
//                        Toast.makeText(navigationDrawer.this, "Payable is clicked", Toast.LENGTH_SHORT).show();
//                        //  item.setChecked(true);
//                        drawerLayout.closeDrawer(GravityCompat.START);
//                        break;
//
//                    case R.id.firstMenu2:
//                        Toast.makeText(navigationDrawer.this, "Profile is clicked", Toast.LENGTH_SHORT).show();
////                        item.setChecked(true);
//                        drawerLayout.closeDrawer(GravityCompat.START);
//                        break;
//
//                    case R.id.firstMenu3:
//                        Toast.makeText(navigationDrawer.this, "My Earning is clicked", Toast.LENGTH_SHORT).show();
////                        item.setChecked(true);
//                        drawerLayout.closeDrawer(GravityCompat.START);
//                        break;
//
//                    case R.id.firstMenu4:
//                        Toast.makeText(navigationDrawer.this, "My location is clicked", Toast.LENGTH_SHORT).show();
////                        item.setChecked(true);
//                        drawerLayout.closeDrawer(GravityCompat.START);
//                        break;
//
//                    case R.id.firstMenu5:
//                        Toast.makeText(navigationDrawer.this, "Rate us is clicked", Toast.LENGTH_SHORT).show();
////                        item.setChecked(true);
//                        drawerLayout.closeDrawer(GravityCompat.START);
//                        break;
//                    case R.id.firstMenu6:
//                        Toast.makeText(navigationDrawer.this, "share App is clicked", Toast.LENGTH_SHORT).show();
////                        item.setChecked(true);
//                        drawerLayout.closeDrawer(GravityCompat.START);
//                        break;
//                    case R.id.firstMenu7:
//                        Toast.makeText(navigationDrawer.this, "Privacy policy is clicked", Toast.LENGTH_SHORT).show();
////                        item.setChecked(true);
//                        drawerLayout.closeDrawer(GravityCompat.START);
//                        break;
//
//                    case R.id.firstMenu8:
//                        Toast.makeText(navigationDrawer.this, "Support is clicked", Toast.LENGTH_SHORT).show();
////                        item.setChecked(true);
//                        drawerLayout.closeDrawer(GravityCompat.START);
//                        break;
//                }
//                return true;
//            }

//        });
    }
}