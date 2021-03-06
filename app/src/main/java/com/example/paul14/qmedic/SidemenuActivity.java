package com.example.paul14.qmedic;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.paul14.qmedic.Appointment.AppointmentActivity;
import com.example.paul14.qmedic.GoogleMap.MainActivity;
import com.example.paul14.qmedic.Center.CenterlistvActivity;
import com.example.paul14.qmedic.Center.McenterProfile;
import com.example.paul14.qmedic.Doctor.DoctorProfile;
import com.example.paul14.qmedic.Doctor.DoctorlistvActivity;

public class SidemenuActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sidemenu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.sidemenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
            Intent intent = new Intent(SidemenuActivity.this, DoctorlistvActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_gallery) {
            //CenterlistvActivity
            Intent intent = new Intent(SidemenuActivity.this, CenterlistvActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_slideshow) {
            //Location
            Intent intent = new Intent(SidemenuActivity.this, MainActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_manage) {
//      //DoctorProfile
            Intent intent2 = new Intent(SidemenuActivity.this, McenterProfile.class);
            startActivity(intent2);
        } else if (id == R.id.nav_share) {
//      //McenterProfile
            Intent intent6 = new Intent(SidemenuActivity.this, AppointmentActivity.class);
            startActivity(intent6);
        } else if (id == R.id.nav_send) {
            Intent intent2 = new Intent(SidemenuActivity.this, McenterProfile.class);
            startActivity(intent2);
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
