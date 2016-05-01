package com.example.terry.myapplication;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private BlankFragment2 blankFragment2 = new BlankFragment2();
    private BlankFragment blankFragment = new com.example.terry.myapplication.BlankFragment();
    private BlankFragment3 blankFragment3 = new BlankFragment3();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        setDefaultFragement();

    }
private void setDefaultFragement()
{
    FragmentManager fragmentManager = getFragmentManager();
    FragmentTransaction transaction = fragmentManager.beginTransaction();
  transaction.replace(R.id.id_content, blankFragment);
    transaction.commit();
}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
            FragmentTransaction transaction = getFragmentManager().beginTransaction();
            transaction.replace(R.id.id_content, blankFragment);
            transaction.commit();
        } else if (id == R.id.nav_gallery) {
            FragmentTransaction transaction = getFragmentManager().beginTransaction();
            transaction.replace(R.id.id_content, blankFragment2);
            transaction.commit();
        } else if (id == R.id.nav_slideshow) {
            FragmentTransaction transaction = getFragmentManager().beginTransaction();
            transaction.replace(R.id.id_content, blankFragment3);
            transaction.commit();
        } else if (id == R.id.nav_manage) {
            FragmentTransaction transaction = getFragmentManager().beginTransaction();
            transaction.replace(R.id.id_content, blankFragment);
            transaction.commit();
        } else if (id == R.id.nav_share) {
            FragmentTransaction transaction = getFragmentManager().beginTransaction();
            transaction.replace(R.id.id_content, blankFragment2);
            transaction.commit();
        } else if (id == R.id.nav_send) {
            FragmentTransaction transaction = getFragmentManager().beginTransaction();
            transaction.replace(R.id.id_content, blankFragment3);
            transaction.commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
