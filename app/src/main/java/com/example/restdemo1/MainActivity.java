package com.example.restdemo1;

import android.app.Fragment;
import android.arch.lifecycle.ReportFragment;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ActionBar toolbar;


    ImageView menus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        menus = findViewById(R.id.menus);
        toolbar=getSupportActionBar();
//        loadFragment(new HomeFragment());
        menus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, AllMenuActivity.class);
                startActivity(intent);
            }
        });
        //f19513751c28f88e2bb99b92a9a07807

        //extra code

//        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
//        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
//        toolbar.setTitle("Examples");


    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//
//        getMenuInflater().inflate( R.menu.navigation, menu);
//
//        MenuItem myActionMenuItem = menu.findItem( R.id.navigation_search);
//       MenuItem searchView = (MenuItem) myActionMenuItem.getActionView();
//
//        return true;
//    }
    //    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
//            = new BottomNavigationView.OnNavigationItemSelectedListener() {
//
//        @Override
//        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//            HomeFragment fragment;
//            switch (item.getItemId()) {
////                case R.id.navigation_home:
////                    toolbar.setTitle("Home");
////                    fragment = new HomeFragment();
////                    loadFragment(fragment);
////                    return true;
//                case R.id.navigation_notifications:
//                    toolbar.setTitle("Notifications");
//                    fragment = new HomeFragment();
//                   loadFragment(fragment);
//                    return true;
//                case R.id.navigation_search:
//                    toolbar.setTitle("Search");
//                    fragment = new HomeFragment();
//                    loadFragment(fragment);
//                    return true;
//                case R.id.navigation_favorite:
//                    toolbar.setTitle("Favorite");
//                    fragment = new HomeFragment();
//                    loadFragment(fragment);
//                    return true;
//                case R.id.navigation_cart:
//                    toolbar.setTitle("Orders");
//                    fragment = new HomeFragment();
//                    loadFragment(fragment);
//                    return true;
//            }
//            return false;
//        }
//    };

//    private void loadFragment(HomeFragment fragment) {
//        // load fragment
//        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//        transaction.replace(R.id.frame_container, fragment);
//        transaction.addToBackStack(null);
//        transaction.commit();
//    }


}
