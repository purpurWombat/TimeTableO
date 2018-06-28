package com.example.jannikokan.timetable.Helper;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;

import com.example.jannikokan.timetable.Calender.CalenderActivity;
import com.example.jannikokan.timetable.Edit.EditActivity;
import com.example.jannikokan.timetable.Table.HomeActivity;
import com.example.jannikokan.timetable.Note.NoteActivity;
import com.example.jannikokan.timetable.R;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class BottomNavVieweHerlper  {

    private static final String TAG = "BottomNavigationViewHel";

    public static void setupBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx){
        Log.d(TAG, "-> setupBottomNavigationView ") ;
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);
    }


    /*
    * Den Context auf final setzen damit man in der Override damit arbeiten kann
    * */

    public static void enableNavigation(final Context context, BottomNavigationViewEx viewEx){
        viewEx.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){



                    /*
                    * Wechseln der Activitys über die Bottom Navigation wenn die Icons gedrückt werden
                    * */
                    case R.id.ic_table:
                        Intent intent2 = new Intent(context, HomeActivity.class);
                        context.startActivity(intent2);
                        break;

                    case  R.id.ic_edit:
                        Intent intent1 = new Intent(context, EditActivity.class);
                        context.startActivity(intent1);
                        break;




                    case R.id.ic_note:
                        Intent intent3 = new Intent(context, NoteActivity.class);
                        context.startActivity(intent3);
                        break;

                    case R.id.ic_calender:
                        Intent intent4 = new Intent(context, CalenderActivity.class);
                        context.startActivity(intent4);
                        break;

                }


                return false;
            }
        });

    }


}
