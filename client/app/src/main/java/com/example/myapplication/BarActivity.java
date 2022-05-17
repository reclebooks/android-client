package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BarActivity extends AppCompatActivity
{
    LinearLayout home_ly;
    BottomNavigationView bottomNavigationView;
    @Override protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bar);
        init();
        SettingListener();
        bottomNavigationView.setSelectedItemId(R.id.Home);

    }
    private void init()
    {
        home_ly = findViewById(R.id.home_ly);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
    }
    private void SettingListener()
    {
        bottomNavigationView.setOnItemSelectedListener(new TabSelectedListener());
    }
    class TabSelectedListener implements BottomNavigationView.OnNavigationItemSelectedListener
    {
        @Override public boolean onNavigationItemSelected(@NonNull MenuItem menuItem)
        {
            switch (menuItem.getItemId())
            {
                case R.id.Home: {
                    getSupportFragmentManager().beginTransaction() .replace(R.id.home_ly, new FragmentHome()) .commit();
                    return true;
                }
                case R.id.Chat: {
                    getSupportFragmentManager().beginTransaction() .replace(R.id.home_ly, new FragmentChat()) .commit();
                    return true;
                }
                case R.id.My: {
                    getSupportFragmentManager().beginTransaction() .replace(R.id.home_ly, new Fragment_My()) .commit();
                    return true;
                }
            }
            return false;
        }
    }

}
