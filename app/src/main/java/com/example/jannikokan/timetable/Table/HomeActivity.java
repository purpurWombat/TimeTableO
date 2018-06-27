package com.example.jannikokan.timetable.Table;

import android.app.FragmentTransaction;
import android.content.Context;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.jannikokan.timetable.Edit.SectionsPageAdapter;
import com.example.jannikokan.timetable.Helper.BottomNavVieweHerlper;
import com.example.jannikokan.timetable.R;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private Context myContext = HomeActivity.this;
    private final static String TAG = "HomeActivity";
    private final static int ACTIVITY_NUM = 0;
    ViewPager myViewPager;

//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d(TAG, " -> onCreate") ;
        setupBottomNavigationView();


        myViewPager = (ViewPager) findViewById(R.id.container);



        TimeTableFragment timeTableFragment = new TimeTableFragment();
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());

        adapter.addFragment( timeTableFragment, "Test");
        myViewPager.setAdapter(adapter);




    }


    /**
     *  Bottom Navigation View
     * */
    private void setupBottomNavigationView(){
        Log.d(TAG, "-> setupBottomNavView");

        BottomNavigationViewEx bottomNavView =  (BottomNavigationViewEx) findViewById(R.id.bottomNavViewBar);
        BottomNavVieweHerlper.setupBottomNavigationView(bottomNavView);
        BottomNavVieweHerlper.enableNavigation(myContext, bottomNavView);
        Menu menu = bottomNavView.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);
    }




}
