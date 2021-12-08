package com.example.socialmediaapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.socialmediaapp.Fragments.AddFragment;
import com.example.socialmediaapp.Fragments.HomeFragment;
import com.example.socialmediaapp.Fragments.NotificationsFragment;
import com.example.socialmediaapp.Fragments.ProfileFragment;
import com.example.socialmediaapp.Fragments.SearchFragment;

import com.example.socialmediaapp.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mainBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mainBinding=ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(mainBinding.getRoot());
        replace(new HomeFragment());
        mainBinding.toolbarMain.setVisibility(View.GONE);

        setSupportActionBar(mainBinding.toolbarMain);



        mainBinding.btmNavMain.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){

                    case R.id.nav_home:
                        mainBinding.toolbarMain.setVisibility(View.GONE);
                        replace(new HomeFragment());
                        break;

                    case R.id.nav_notification:
                        mainBinding.toolbarMain.setVisibility(View.GONE);
                        replace(new NotificationsFragment());
                        break;

                    case R.id.nav_profile:
                        mainBinding.toolbarMain.setVisibility(View.VISIBLE);
                        replace(new ProfileFragment());
                        break;

                    case R.id.nav_add:
                        mainBinding.toolbarMain.setVisibility(View.GONE);
                        replace(new AddFragment());
                        break;

                    case R.id.nav_search:
                        mainBinding.toolbarMain.setVisibility(View.GONE);
                        replace(new SearchFragment());
                        break;
                }





                return true;
            }
        });




    }

    private void replace(Fragment fragment) {

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_fram,fragment);
        fragmentTransaction.commit();


    }



}