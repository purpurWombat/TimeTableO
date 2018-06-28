package com.example.jannikokan.timetable.Table;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TextView;

import com.example.jannikokan.timetable.Helper.DatabaseHelper;
import com.example.jannikokan.timetable.R;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TimeTableFragment extends Fragment {
    private static final String TAG = "TimeTableFragment";

    TableLayout myTL;
    DatabaseHelper myDb;


    // Initialisierung der Text Views von der Ersten Stunde von jedem Tag
    ViewGroup VGMO1;
    RelativeLayout MO1;
    ViewGroup DI1;
    ViewGroup MI1;
    ViewGroup D01;
    ViewGroup FR1;

    TextView FachMO1;
    TextView FachDI1;
    TextView FachMI1;
    TextView FachDO1;
    TextView FachFR1;

    TextView LehrerMO1;
    TextView LehrerDI1;
    TextView LehrerMI1;
    TextView LehrerDO1;
    TextView LehrerFR1;

    TextView RaumMO1;
    TextView RaumDI1;
    TextView RaumMI1;
    TextView RaumDO1;
    TextView RaumFR1;


    ViewGroup MO2;
    ViewGroup DI2;
    ViewGroup MI2;
    ViewGroup D02;
    ViewGroup FR2;


    ViewGroup MO3;
    ViewGroup DI3;
    ViewGroup MI3;
    ViewGroup D03;
    ViewGroup FR3;


    ViewGroup MO4;
    ViewGroup DI4;
    ViewGroup MI4;
    ViewGroup D04;
    ViewGroup FR4;


    ViewGroup MO5;
    ViewGroup DI5;
    ViewGroup MI5;
    ViewGroup D05;
    ViewGroup FR5;


    ViewGroup MO6;
    ViewGroup DI6;
    ViewGroup MI6;
    ViewGroup D06;
    ViewGroup FR6;


    ViewGroup MO7;
    ViewGroup DI7;
    ViewGroup MI7;
    ViewGroup D07;
    ViewGroup FR7;


    ViewGroup MO8;
    ViewGroup DI8;
    ViewGroup MI8;
    ViewGroup D08;
    ViewGroup FR8;


    ViewGroup MO9;
    ViewGroup DI9;
    ViewGroup MI9;
    ViewGroup D09;
    ViewGroup FR9;


    ViewGroup MO10;
    ViewGroup DI10;
    ViewGroup MI10;
    ViewGroup D010;
    ViewGroup FR10;

    String IDfinal;
    String Montag1[] = {"-", " - ", " -"};

    String a;
    String b;
    String c;
    TextView Lehrer;

    TextView Raum;

    StundeZuweisen stundeZuweisen;


    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_timetable, container, false);
        myTL = view.findViewById(R.id.tableLayoutTage);
        MO1 = view.findViewById(R.id.MO1);
        VGMO1 = view.findViewById(R.id.MO1);
        DI1 = view.findViewById(R.id.DI1);

        DI1 = view.findViewById(R.id.DI1);
        FachMO1 = (TextView) VGMO1.findViewById(R.id.textViewFach);
        LehrerMO1 = (TextView) VGMO1.findViewById(R.id.textViewLehrer);
        RaumMO1 = (TextView) VGMO1.findViewById(R.id.textViewRaum);
        FachDI1 = (TextView) DI1.findViewById(R.id.textViewFach);
        stundeZuweisen = new StundeZuweisen();

        DI1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                String a = Montag1[0];
                String b = Montag1[1];
                String c = Montag1[2];
                schreibeInTV(a, b, c);
                return true;
            }
        });


        VGMO1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                String ViewID = getResources().getResourceName(view.getId());
                IDfinal = cutID(ViewID);


                Log.d(TAG, "" + IDfinal);

                Intent intent = new Intent(getActivity(), StundeZuweisen.class);
                intent.putExtra("ViewID", IDfinal);
                startActivity(intent);
                return true;
            }
        });


        //arrayToString();


        return view;
    }

    /*private void arrayToString() {
        a = Montag1[1];
        b = Montag1[2];
        c = Montag1[0];
        Log.d(TAG, "" + a + b);
    }
*/

    public String cutID(String longID) {
        if (longID.length() == 3) {
            return longID;
        } else if (longID.length() > 3) {
            return longID.substring(longID.length() - 3);
        }
        return longID;
    }


    public void setzeTextViewFachMO1() {
        FachMO1.setText(stundeZuweisen.getFachSpinnerText());
    }

    public void schreibeInArray(String ID, String FKZ, String LKZ, String RKZ) {
        if (ID.equals("MO1")) {
            Montag1[0] = FKZ;
            Montag1[1] = LKZ;
            Montag1[2] = RKZ;
            Log.d(TAG, "schreibeInArray: korrekt" + Montag1[0] + Montag1[1] + Montag1[2]);
        } else {
            Log.d(TAG, "schreibeInArray: fail");
        }
    }

    public void schreibeInTV(String a, String b, String c) {
        FachMO1.setText(a);
        LehrerMO1.setText(b);
        RaumMO1.setText(c);
        String FachMO1Test =  FachMO1.getText().toString();
        Log.d(TAG, "schreibeInTV: korrekt" + FachMO1Test);
    }

}

