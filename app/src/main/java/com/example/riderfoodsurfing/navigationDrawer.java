package com.example.riderfoodsurfing;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.navigation.NavigationView;

public class navigationDrawer extends AppCompatActivity {

    NavigationView navigationView1;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawerLayout;
    Toolbar toolbar;


    NavigationMenu navigationMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        navigationView1 = findViewById(R.id.navmenu);
        drawerLayout = findViewById(R.id.drawer);

        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView1.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                navigationView1.setCheckedItem(item.getItemId());
                switch (item.getItemId()) {
                    case R.id.firstMenu:
                        Toast.makeText(navigationDrawer.this, "Payable is clicked", Toast.LENGTH_SHORT).show();
                        //  item.setChecked(true);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.firstMenu2:
                        Toast.makeText(navigationDrawer.this, "Profile is clicked", Toast.LENGTH_SHORT).show();
//                        item.setChecked(true);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.firstMenu3:
                        Toast.makeText(navigationDrawer.this, "My Earning is clicked", Toast.LENGTH_SHORT).show();
//                        item.setChecked(true);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.firstMenu4:
                        Toast.makeText(navigationDrawer.this, "My location is clicked", Toast.LENGTH_SHORT).show();
//                        item.setChecked(true);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.firstMenu5:
                        Toast.makeText(navigationDrawer.this, "Rate us is clicked", Toast.LENGTH_SHORT).show();
//                        item.setChecked(true);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.firstMenu6:
                        Toast.makeText(navigationDrawer.this, "share App is clicked", Toast.LENGTH_SHORT).show();
//                        item.setChecked(true);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.firstMenu7:
                        Toast.makeText(navigationDrawer.this, "Privacy policy is clicked", Toast.LENGTH_SHORT).show();
//                        item.setChecked(true);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.firstMenu8:
                        Toast.makeText(navigationDrawer.this, "Support is clicked", Toast.LENGTH_SHORT).show();
//                        item.setChecked(true);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                }
                return true;
            }

        });
    }
}