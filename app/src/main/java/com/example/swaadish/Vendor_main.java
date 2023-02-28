package com.example.swaadish;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class Vendor_main extends AppCompatActivity {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    ActionBarDrawerToggle actionBarDrawerToggle;

    FirebaseAuth firebaseAuth;
    FirebaseFirestore firebaseFirestore;

    ProgressDialog progressDialog;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(actionBarDrawerToggle.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_vendor_main);
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigationView);
        actionBarDrawerToggle= new ActionBarDrawerToggle(this,drawerLayout,R.string.menu_open,R.string.menu_close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        firebaseAuth = FirebaseAuth.getInstance();
        progressDialog= new ProgressDialog(Vendor_main.this);
        firebaseFirestore = FirebaseFirestore.getInstance();
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override

            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.nav_profile:
                        Log.i("MENU DRAWER TAG", "Profile manager selected");
                        drawerLayout.closeDrawer(GravityCompat.START);
                        startActivity(new Intent(Vendor_main.this, profile.class));
                        break;
                    case R.id.nav_menu_edit:
                        Log.i("MENU DRAWER TAG", "Menu manager selected");
                        drawerLayout.closeDrawer(GravityCompat.START);
                        startActivity(new Intent(Vendor_main.this, manageMenu.class));
                        break;
                    case R.id.earnings:
                        Log.i("MENU DRAWER TAG", "Earnings manager selected");
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_logout:
                        Log.i("MENU DRAWER TAG", "Logging out");
                        //drawerLayout.closeDrawer(GravityCompat.START);
                        progressDialog.show();



                        firebaseAuth.signOut();
                        Intent intent = new Intent(Vendor_main.this, MainActivity.class);
                        startActivity(intent);
                        Toast.makeText(Vendor_main.this, "Logout successfully", Toast.LENGTH_SHORT).show();

                        progressDialog.cancel();
                        break;


                }
                return true;

            }
        });

    }
}