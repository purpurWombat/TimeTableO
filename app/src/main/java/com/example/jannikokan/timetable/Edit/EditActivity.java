package com.example.jannikokan.timetable.Edit;

import android.app.FragmentTransaction;
import android.content.Context;
import android.database.Cursor;
import android.support.design.widget.TabLayout;


import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.Toast;

import com.example.jannikokan.timetable.Helper.BottomNavVieweHerlper;
import com.example.jannikokan.timetable.Helper.DatabaseHelper;
import com.example.jannikokan.timetable.R;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class EditActivity extends AppCompatActivity {

    private Context myContext = EditActivity.this;
    private static final String TAG = "EditActivity";


    private static final int ACTIVITY_NUM = 1;
    private SectionsPageAdapter mySectionsPageAdapter;
    private ViewPager myViewPager;

    DatabaseHelper myDb;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        Log.d(TAG, "onCreate: -->");


        mySectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());
        myViewPager = (ViewPager) findViewById(R.id.container);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(myViewPager);

        myDb = new DatabaseHelper(this);
        myDb.fuegeNeueTabellenHinzu();

        setupViewPager(myViewPager);
        setupBottomNavigationView();




    }



    /**
     * Top Navigation mit Fragments
     * */
    private void setupViewPager (ViewPager viewPager){
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new FachFragment(), "Fach");
        adapter.addFragment(new LehrerFragment(), "Lehrer");
        adapter.addFragment(new RaumFragment(), "Raum");
        viewPager.setAdapter(adapter);
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


    public void addFach(String inputF, String inputKz){
                boolean istGespeichert = myDb.speichereFachOKan(inputF,inputKz);
                if (istGespeichert==true){
                    Toast.makeText(EditActivity.this, "Fach wurde gespeichert.", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(EditActivity.this, "Fach konnte nicht gespeichert werden.", Toast.LENGTH_LONG).show();
                }
            }



    public void addLehrer(String inputL, String inputLKz , String inputLMail){
        boolean istGespeichert = myDb.speicherLehrer(inputL,inputLKz , inputLMail);
        if (istGespeichert==true){
            Toast.makeText(EditActivity.this, "Fach wurde gespeichert.", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(EditActivity.this, "Fach konnte nicht gespeichert werden.", Toast.LENGTH_LONG).show();
        }
    }

    public void addRaum(String inputR, String inputRArt){
        boolean istGespeichert = myDb.speichereRaum(inputR,inputRArt);
        if (istGespeichert==true){
            Toast.makeText(EditActivity.this, "Fach wurde gespeichert.", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(EditActivity.this, "Fach konnte nicht gespeichert werden.", Toast.LENGTH_LONG).show();
        }
    }



}
