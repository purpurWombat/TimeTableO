package com.example.jannikokan.timetable.Table;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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
    String Montag1[] = {"-", " - ", " -","-"};
    String Dienstag1[] = {"-", "-", "-","-"};
    String Holder[]= {"-", "-", "-","-"};
    String HolderD[]= {"-", "-", "-","-"};

    String a;
    String b;
    String c;
    TextView Lehrer;

    TextView Raum;
    String montag ="a";
    String dienstag = "d";

    StundeZuweisen stundeZuweisen;


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        Log.d(TAG, ""+resultCode + requestCode);
        if( resultCode == Activity.RESULT_OK && requestCode == 0){
            String arr[] = data.getStringArrayExtra("result");
            speicherArray(arr[0], arr[1], arr[2], arr[3]);
        }
    }

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_timetable, container, false);
        myTL = view.findViewById(R.id.tableLayoutTage);
        MO1 = view.findViewById(R.id.MO1);
        VGMO1 = view.findViewById(R.id.MO1);
        DI1 = view.findViewById(R.id.DI1);


        FachMO1 = (TextView) VGMO1.findViewById(R.id.textViewFach);
        LehrerMO1 = (TextView) VGMO1.findViewById(R.id.textViewLehrer);
        RaumMO1 = (TextView) VGMO1.findViewById(R.id.textViewRaum);

        FachDI1 = (TextView) DI1.findViewById(R.id.textViewFach);
        LehrerDI1 = (TextView) DI1.findViewById(R.id.textViewLehrer);
        RaumDI1 = (TextView) DI1.findViewById(R.id.textViewRaum);

        stundeZuweisen = new StundeZuweisen();

        schreibeInTV();

        DI1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                String ViewID = getResources().getResourceName(view.getId());
                IDfinal = cutID(ViewID);

                Log.d(TAG, "" + IDfinal);

                Intent intent = new Intent(getActivity(), StundeZuweisen.class);
                intent.putExtra("ViewID", IDfinal);

                startActivityForResult(intent, 0);
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

                startActivityForResult(intent, 0);
                return true;
            }
        });





        //arrayToString();



        return view;
    }




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

    public void schreibeInArray(String Stunde) {
        FachMO1.setText(Stunde);
    }

    public void schreibeInTV() {
        Montag1 = loadArray(montag, getActivity());

         Dienstag1 = loadArray(dienstag,getActivity());



        FachMO1.setText(Montag1[0]);
        LehrerMO1.setText(Montag1[1]);
        RaumMO1.setText(Montag1[2]);


        FachDI1.setText(Dienstag1[0]);
        LehrerDI1.setText(Dienstag1[1]);
        RaumDI1.setText(Dienstag1[2]);






        String FachMO1Test =  FachMO1.getText().toString();
        Log.d(TAG, "schreibeInTV: korrekt" + FachMO1Test);
    }

    public void speicherArray(  String a , String b , String c , String d) {

        if (d.contains("MO")) {
            switch (d) {
                case "MO1": {
                   Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                  Holder[3] = d;
                    schreibeInTV();
                    String FachMO1Test = FachMO1.getText().toString();
                    Log.d(TAG, "schreibeInTV: korrekt" + FachMO1Test);
                    saveArray(Holder, montag, getActivity());
                    break;
                }

                case "MO2": {
                    Montag1[4] = a;
                    Montag1[5] = b;
                    Montag1[6] = c;
                    Montag1[7] = d;
                    schreibeInTV();


                    break;
                }
            }


        } else if (d.contains("DI")) {
            switch (d) {
                case "DI1": {
                    HolderD[0] = a;
                    HolderD[1] = b;
                    HolderD[2] = c;
                    HolderD[3] = d;
                    schreibeInTV();
                    saveArray(HolderD, dienstag, getActivity());
                    break;
                }
            }


        }


    }



    public boolean saveArray(String[] array, String arrayName, Context mContext) {
        SharedPreferences prefs = mContext.getSharedPreferences("preferencename", 0);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt(arrayName +"_size", array.length);
        for(int i=0;i<array.length;i++)
            editor.putString(arrayName + "_" + i, array[i]);
        return editor.commit();
    }


    public String[] loadArray(String arrayName, Context mContext) {
        SharedPreferences prefs = mContext.getSharedPreferences("preferencename", 0);
        int size = prefs.getInt(arrayName + "_size", 0);
        String array[] = new String[size];
        for(int i=0;i<size;i++)
            array[i] = prefs.getString(arrayName + "_" + i, null);
        return array;
    }
}

