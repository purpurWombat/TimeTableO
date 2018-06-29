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
import android.widget.TableLayout;
import android.widget.TextView;

import com.example.jannikokan.timetable.Helper.DatabaseHelper;
import com.example.jannikokan.timetable.R;

public class TimeTableFragment extends Fragment {
    private static final String TAG = "TimeTableFragment";

    TableLayout myTL;
    DatabaseHelper myDb;


    // Initialisierung der Text Views von der Ersten Stunde von jedem Tag
    ViewGroup MO1;
    ViewGroup DI1;
    ViewGroup MI1;
    ViewGroup DO1;
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

    // Initialisierung der Text Views von der zweiten Stunde von jedem Tag
    ViewGroup MO2;
    ViewGroup DI2;
    ViewGroup MI2;
    ViewGroup DO2;
    ViewGroup FR2;

    TextView FachMO2;
    TextView FachDI2;
    TextView FachMI2;
    TextView FachDO2;
    TextView FachFR2;

    TextView LehrerMO2;
    TextView LehrerDI2;
    TextView LehrerMI2;
    TextView LehrerDO2;
    TextView LehrerFR2;

    TextView RaumMO2;
    TextView RaumDI2;
    TextView RaumMI2;
    TextView RaumDO2;
    TextView RaumFR2;

    // Initialisierung der Text Views von der dritten Stunde von jedem Tag

    ViewGroup MO3;
    ViewGroup DI3;
    ViewGroup MI3;
    ViewGroup DO3;
    ViewGroup FR3;

    TextView FachMO3;
    TextView FachDI3;
    TextView FachMI3;
    TextView FachDO3;
    TextView FachFR3;

    TextView LehrerMO3;
    TextView LehrerDI3;
    TextView LehrerMI3;
    TextView LehrerDO3;
    TextView LehrerFR3;

    TextView RaumMO3;
    TextView RaumDI3;
    TextView RaumMI3;
    TextView RaumDO3;
    TextView RaumFR3;

    // Initialisierung der Text Views von der vierten Stunde von jedem Tag

    ViewGroup MO4;
    ViewGroup DI4;
    ViewGroup MI4;
    ViewGroup DO4;
    ViewGroup FR4;

    TextView FachMO4;
    TextView FachDI4;
    TextView FachMI4;
    TextView FachDO4;
    TextView FachFR4;

    TextView LehrerMO4;
    TextView LehrerDI4;
    TextView LehrerMI4;
    TextView LehrerDO4;
    TextView LehrerFR4;

    TextView RaumMO4;
    TextView RaumDI4;
    TextView RaumMI4;
    TextView RaumDO4;
    TextView RaumFR4;

    // Initialisierung der Text Views von der fünften Stunde von jedem Tag


    ViewGroup MO5;
    ViewGroup DI5;
    ViewGroup MI5;
    ViewGroup DO5;
    ViewGroup FR5;

    TextView FachMO5;
    TextView FachDI5;
    TextView FachMI5;
    TextView FachDO5;
    TextView FachFR5;

    TextView LehrerMO5;
    TextView LehrerDI5;
    TextView LehrerMI5;
    TextView LehrerDO5;
    TextView LehrerFR5;

    TextView RaumMO5;
    TextView RaumDI5;
    TextView RaumMI5;
    TextView RaumDO5;
    TextView RaumFR5;

    // Initialisierung der Text Views von der sechsten Stunde von jedem Tag

    ViewGroup MO6;
    ViewGroup DI6;
    ViewGroup MI6;
    ViewGroup DO6;
    ViewGroup FR6;

    TextView FachMO6;
    TextView FachDI6;
    TextView FachMI6;
    TextView FachDO6;
    TextView FachFR6;

    TextView LehrerMO6;
    TextView LehrerDI6;
    TextView LehrerMI6;
    TextView LehrerDO6;
    TextView LehrerFR6;

    TextView RaumMO6;
    TextView RaumDI6;
    TextView RaumMI6;
    TextView RaumDO6;
    TextView RaumFR6;

    // Initialisierung der Text Views von der siebten Stunde von jedem Tag

    ViewGroup MO7;
    ViewGroup DI7;
    ViewGroup MI7;
    ViewGroup DO7;
    ViewGroup FR7;

    TextView FachMO7;
    TextView FachDI7;
    TextView FachMI7;
    TextView FachDO7;
    TextView FachFR7;

    TextView LehrerMO7;
    TextView LehrerDI7;
    TextView LehrerMI7;
    TextView LehrerDO7;
    TextView LehrerFR7;

    TextView RaumMO7;
    TextView RaumDI7;
    TextView RaumMI7;
    TextView RaumDO7;
    TextView RaumFR7;


    // Initialisierung der Text Views von der achten Stunde von jedem Tag

    ViewGroup MO8;
    ViewGroup DI8;
    ViewGroup MI8;
    ViewGroup DO8;
    ViewGroup FR8;

    TextView FachMO8;
    TextView FachDI8;
    TextView FachMI8;
    TextView FachDO8;
    TextView FachFR8;

    TextView LehrerMO8;
    TextView LehrerDI8;
    TextView LehrerMI8;
    TextView LehrerDO8;
    TextView LehrerFR8;

    TextView RaumMO8;
    TextView RaumDI8;
    TextView RaumMI8;
    TextView RaumDO8;
    TextView RaumFR8;


    // Initialisierung der Text Views von der neunten Stunde von jedem Tag

    ViewGroup MO9;
    ViewGroup DI9;
    ViewGroup MI9;
    ViewGroup DO9;
    ViewGroup FR9;

    TextView FachMO9;
    TextView FachDI9;
    TextView FachMI9;
    TextView FachDO9;
    TextView FachFR9;

    TextView LehrerMO9;
    TextView LehrerDI9;
    TextView LehrerMI9;
    TextView LehrerDO9;
    TextView LehrerFR9;

    TextView RaumMO9;
    TextView RaumDI9;
    TextView RaumMI9;
    TextView RaumDO9;
    TextView RaumFR9;

    // Initialisierung der Text Views von der zehnten Stunde von jedem Tag

    ViewGroup MO0;
    ViewGroup DI0;
    ViewGroup MI0;
    ViewGroup DO0;
    ViewGroup FR0;

    TextView FachMO0;
    TextView FachDI0;
    TextView FachMI0;
    TextView FachDO0;
    TextView FachFR0;

    TextView LehrerMO0;
    TextView LehrerDI0;
    TextView LehrerMI0;
    TextView LehrerDO0;
    TextView LehrerFR0;

    TextView RaumMO0;
    TextView RaumDI0;
    TextView RaumMI0;
    TextView RaumDO0;
    TextView RaumFR0;


    String IDfinal;
    String a;
    String b;
    String c;
    TextView Lehrer;

    TextView Raum;


    // Arrayf für erster stunden

    String Holder[] = {"-", "-", "-", "-"};
    String Montag1[] = {"-", " - ", " -", "-"};
    String Dienstag1[] = {"-", "-", "-", "-"};
    String Mittwoch1[] = {"-", "-", "-", "-"};
    String Donnerstag1[] =  {"-", "-", "-", "-"};
    String Freitag1 [] =  {"-", "-", "-", "-"};


    String montagtest1[] = {"-", "-", "-", "-"};
    String dienstagtest1[] = {"-", "-", "-", "-"};
    String mittwochtest1[] = {"-", "-", "-", "-"};
    String donnerstagtest1[] = {"-", "-", "-", "-"};
    String freittagtest1 [] =  {"-", "-", "-", "-"};

    String montag1 = "Montag1";
    String dienstag1 = "Dienstag1";
    String mittwoch1 = "Mittwoch1";
    String donnerstag1 = "Donnerstag1";
    String freitag1 = "Freitag1";



// arrays für die zweiten stunden

    String Montag2[] = {"-", " - ", " -", "-"};
    String Dienstag2[] = {"-", "-", "-", "-"};
    String Mittwoch2[] = {"-", "-", "-", "-"};
    String Donnerstag2[] =  {"-", "-", "-", "-"};
    String Freitag2 [] =  {"-", "-", "-", "-"};


    String montagtest2[] = {"-", "-", "-", "-"};
    String dienstagtest2[] = {"-", "-", "-", "-"};
    String mittwochtest2[] = {"-", "-", "-", "-"};
    String donnerstagtest2[] = {"-", "-", "-", "-"};
    String freittagtest2 [] =  {"-", "-", "-", "-"};


    String montag2 = "Montag2";
    String dienstag2 = "Dienstag2";
    String mittwoch2 = "Mittwoch2";
    String donnerstag2 = "Donnerstag2";
    String freitag2 = "Freitag2";

    // arrays für die dritten stunden

    String Montag3[] = {"-", " - ", " -", "-"};
    String Dienstag3[] = {"-", "-", "-", "-"};
    String Mittwoch3[] = {"-", "-", "-", "-"};
    String Donnerstag3[] =  {"-", "-", "-", "-"};
    String Freitag3 [] =  {"-", "-", "-", "-"};


    String montagtest3[] = {"-", "-", "-", "-"};
    String dienstagtest3[] = {"-", "-", "-", "-"};
    String mittwochtest3[] = {"-", "-", "-", "-"};
    String donnerstagtest3[] = {"-", "-", "-", "-"};
    String freittagtest3 [] =  {"-", "-", "-", "-"};


    String montag3 = "Montag3";
    String dienstag3 = "Dienstag3";
    String mittwoch3 = "Mittwoch3";
    String donnerstag3 = "Donnerstag3";
    String freitag3 = "Freitag3";

    // arrays für die vierten stunden

    String Montag4[] = {"-", " - ", " -", "-"};
    String Dienstag4[] = {"-", "-", "-", "-"};
    String Mittwoch4[] = {"-", "-", "-", "-"};
    String Donnerstag4[] =  {"-", "-", "-", "-"};
    String Freitag4 [] =  {"-", "-", "-", "-"};


    String montagtest4[] = {"-", "-", "-", "-"};
    String dienstagtest4[] = {"-", "-", "-", "-"};
    String mittwochtest4[] = {"-", "-", "-", "-"};
    String donnerstagtest4[] = {"-", "-", "-", "-"};
    String freittagtest4 [] =  {"-", "-", "-", "-"};


    String montag4 = "Montag4";
    String dienstag4 = "Dienstag4";
    String mittwoch4 = "Mittwoch4";
    String donnerstag4 = "Donnerstag4";
    String freitag4 = "Freitag4";

    // arrays für die fünfte stunden

    String Montag5[] = {"-", " - ", " -", "-"};
    String Dienstag5[] = {"-", "-", "-", "-"};
    String Mittwoch5[] = {"-", "-", "-", "-"};
    String Donnerstag5[] =  {"-", "-", "-", "-"};
    String Freitag5 [] =  {"-", "-", "-", "-"};


    String montagtest5[] = {"-", "-", "-", "-"};
    String dienstagtest5[] = {"-", "-", "-", "-"};
    String mittwochtest5[] = {"-", "-", "-", "-"};
    String donnerstagtest5[] = {"-", "-", "-", "-"};
    String freittagtest5 [] =  {"-", "-", "-", "-"};


    String montag5 = "Montag5";
    String dienstag5 = "Dienstag5";
    String mittwoch5 = "Mittwoch5";
    String donnerstag5 = "Donnerstag5";
    String freitag5 = "Freitag5";


    // arrays für die sechstestunden

    String Montag6[] = {"-", " - ", " -", "-"};
    String Dienstag6[] = {"-", "-", "-", "-"};
    String Mittwoch6[] = {"-", "-", "-", "-"};
    String Donnerstag6[] =  {"-", "-", "-", "-"};
    String Freitag6 [] =  {"-", "-", "-", "-"};


    String montagtest6[] = {"-", "-", "-", "-"};
    String dienstagtest6[] = {"-", "-", "-", "-"};
    String mittwochtest6[] = {"-", "-", "-", "-"};
    String donnerstagtest6[] = {"-", "-", "-", "-"};
    String freittagtest6 [] =  {"-", "-", "-", "-"};


    String montag6 = "Montag6";
    String dienstag6 = "Dienstag6";
    String mittwoch6 = "Mittwoch6";
    String donnerstag6 = "Donnerstag6";
    String freitag6 = "Freitag6";

    // arrays für die siebte stunden

    String Montag7[] = {"-", " - ", " -", "-"};
    String Dienstag7[] = {"-", "-", "-", "-"};
    String Mittwoch7[] = {"-", "-", "-", "-"};
    String Donnerstag7[] =  {"-", "-", "-", "-"};
    String Freitag7 [] =  {"-", "-", "-", "-"};


    String montagtest7[] = {"-", "-", "-", "-"};
    String dienstagtest7[] = {"-", "-", "-", "-"};
    String mittwochtest7[] = {"-", "-", "-", "-"};
    String donnerstagtest7[] = {"-", "-", "-", "-"};
    String freittagtest7 [] =  {"-", "-", "-", "-"};


    String montag7 = "Montag7";
    String dienstag7 = "Dienstag7";
    String mittwoch7 = "Mittwoch7";
    String donnerstag7 = "Donnerstag7";
    String freitag7 = "Freitag7";










    StundeZuweisen stundeZuweisen;


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        Log.d(TAG, "" + resultCode + requestCode);
        if (resultCode == Activity.RESULT_OK && requestCode == 0) {
            String arr[] = data.getStringArrayExtra("result");
            speicherArray(arr[0], arr[1], arr[2], arr[3]);
        }
    }

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_timetable, container, false);
        myTL = view.findViewById(R.id.tableLayoutTage);

// erste Stunden
        MO1 = view.findViewById(R.id.MO1);
        DI1 = view.findViewById(R.id.DI1);
        MI1 = view.findViewById(R.id.MI1);
        DO1 = view.findViewById(R.id.DO1);
        FR1 = view.findViewById(R.id.FR1);


        FachMO1 = (TextView) MO1.findViewById(R.id.textViewFach);
        LehrerMO1 = (TextView) MO1.findViewById(R.id.textViewLehrer);
        RaumMO1 = (TextView) MO1.findViewById(R.id.textViewRaum);

        FachDI1 = (TextView) DI1.findViewById(R.id.textViewFach);
        LehrerDI1 = (TextView) DI1.findViewById(R.id.textViewLehrer);
        RaumDI1 = (TextView) DI1.findViewById(R.id.textViewRaum);

        FachMI1 = (TextView) MI1.findViewById(R.id.textViewFach);
        LehrerMI1 = (TextView) MI1.findViewById(R.id.textViewLehrer);
        RaumMI1 = (TextView) MI1.findViewById(R.id.textViewRaum);

        FachDO1 = (TextView) DO1.findViewById(R.id.textViewFach);
        LehrerDO1 = (TextView) DO1.findViewById(R.id.textViewLehrer);
        RaumDO1 = (TextView) DO1.findViewById(R.id.textViewRaum);

        FachFR1 = (TextView) FR1.findViewById(R.id.textViewFach);
        LehrerFR1 = (TextView) FR1.findViewById(R.id.textViewLehrer);
        RaumFR1 = (TextView) FR1.findViewById(R.id.textViewRaum);


        // zweite Stunden

        MO2 = view.findViewById(R.id.MO2);
        DI2 = view.findViewById(R.id.DI2);
        MI2 = view.findViewById(R.id.MI2);
        DO2 = view.findViewById(R.id.DO2);
        FR2 = view.findViewById(R.id.FR2);

        FachMO2 = (TextView) MO2.findViewById(R.id.textViewFach);
        LehrerMO2 = (TextView) MO2.findViewById(R.id.textViewLehrer);
        RaumMO2 = (TextView) MO2.findViewById(R.id.textViewRaum);

        FachDI2 = (TextView) DI2.findViewById(R.id.textViewFach);
        LehrerDI2 = (TextView) DI2.findViewById(R.id.textViewLehrer);
        RaumDI2 = (TextView) DI2.findViewById(R.id.textViewRaum);

        FachMI2 = (TextView) MI2.findViewById(R.id.textViewFach);
        LehrerMI2 = (TextView) MI2.findViewById(R.id.textViewLehrer);
        RaumMI2 = (TextView) MI2.findViewById(R.id.textViewRaum);

        FachDO2 = (TextView) DO2.findViewById(R.id.textViewFach);
        LehrerDO2 = (TextView) DO2.findViewById(R.id.textViewLehrer);
        RaumDO2 = (TextView) DO2.findViewById(R.id.textViewRaum);

        FachFR2 = (TextView) FR2.findViewById(R.id.textViewFach);
        LehrerFR2 = (TextView) FR2.findViewById(R.id.textViewLehrer);
        RaumFR2 = (TextView) FR2.findViewById(R.id.textViewRaum);


        // dritte Stunden

        MO3 = view.findViewById(R.id.MO3);
        DI3 = view.findViewById(R.id.DI3);
        MI3 = view.findViewById(R.id.MI3);
        DO3 = view.findViewById(R.id.DO3);
        FR3 = view.findViewById(R.id.FR3);

        FachMO3 = (TextView) MO3.findViewById(R.id.textViewFach);
        LehrerMO3 = (TextView) MO3.findViewById(R.id.textViewLehrer);
        RaumMO3 = (TextView) MO3.findViewById(R.id.textViewRaum);

        FachDI3 = (TextView) DI3.findViewById(R.id.textViewFach);
        LehrerDI3 = (TextView) DI3.findViewById(R.id.textViewLehrer);
        RaumDI3 = (TextView) DI3.findViewById(R.id.textViewRaum);

        FachMI3 = (TextView) MI3.findViewById(R.id.textViewFach);
        LehrerMI3 = (TextView) MI3.findViewById(R.id.textViewLehrer);
        RaumMI3 = (TextView) MI3.findViewById(R.id.textViewRaum);

        FachDO3 = (TextView) DO3.findViewById(R.id.textViewFach);
        LehrerDO3 = (TextView) DO3.findViewById(R.id.textViewLehrer);
        RaumDO3 = (TextView) DO3.findViewById(R.id.textViewRaum);

        FachFR3 = (TextView) FR3.findViewById(R.id.textViewFach);
        LehrerFR3 = (TextView) FR3.findViewById(R.id.textViewLehrer);
        RaumFR3 = (TextView) FR3.findViewById(R.id.textViewRaum);






        stundeZuweisen = new StundeZuweisen();

        schreibeInTV();

// on click listener für erste stunde jedes tages


        MO1.setOnLongClickListener(new View.OnLongClickListener() {
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

        MI1.setOnLongClickListener(new View.OnLongClickListener() {
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

        DO1.setOnLongClickListener(new View.OnLongClickListener() {
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

        FR1.setOnLongClickListener(new View.OnLongClickListener() {
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





        // on click listenere für zweite stunde jedes tages


        MO2.setOnLongClickListener(new View.OnLongClickListener() {
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



        DI2.setOnLongClickListener(new View.OnLongClickListener() {
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

        MI2.setOnLongClickListener(new View.OnLongClickListener() {
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

        DO2.setOnLongClickListener(new View.OnLongClickListener() {
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

        FR2.setOnLongClickListener(new View.OnLongClickListener() {
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



        // on click listenere für dritte stunde jedes tages


        MO3.setOnLongClickListener(new View.OnLongClickListener() {
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



        DI3.setOnLongClickListener(new View.OnLongClickListener() {
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

        MI3.setOnLongClickListener(new View.OnLongClickListener() {
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

        DO3.setOnLongClickListener(new View.OnLongClickListener() {
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

        FR3.setOnLongClickListener(new View.OnLongClickListener() {
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




    public void schreibeInTV() {
        montagtest1 = loadArray(montag1, getActivity());
        dienstagtest1 = loadArray(dienstag1, getActivity());
        mittwochtest1 = loadArray(mittwoch1, getActivity());
        donnerstagtest1 = loadArray(donnerstag1,getActivity());
        freittagtest1 = loadArray(freitag1,getActivity());

        montagtest2 = loadArray(montag2, getActivity());
        dienstagtest2 = loadArray(dienstag2, getActivity());
        mittwochtest2 = loadArray(mittwoch2, getActivity());
        donnerstagtest2 = loadArray(donnerstag2,getActivity());
        freittagtest2 = loadArray(freitag2,getActivity());


        montagtest3 = loadArray(montag3, getActivity());
        dienstagtest3 = loadArray(dienstag3, getActivity());
        mittwochtest3 = loadArray(mittwoch3, getActivity());
        donnerstagtest3 = loadArray(donnerstag3,getActivity());
        freittagtest3 = loadArray(freitag3,getActivity());


// abfragen für erste Stunde
        if (montagtest1.length > 0) {
            Montag1 = montagtest1;
        }

        if (dienstagtest1.length > 0) {
            Dienstag1 = dienstagtest1;
        }
        if (mittwochtest1.length > 0) {
            Mittwoch1 = mittwochtest1;
        }
        if (donnerstagtest1.length > 0) {
            Donnerstag1 = donnerstagtest1;
        }

        if (freittagtest1.length > 0) {
            Freitag1 = freittagtest1;
        }

// Abfragen für zweite stunde
        if (montagtest2.length > 0) {
            Montag2 = montagtest2;
        }

        if (dienstagtest2.length > 0) {
            Dienstag2 = dienstagtest2;
        }
        if (mittwochtest2.length > 0) {
            Mittwoch2 = mittwochtest2;
        }
        if (donnerstagtest2.length > 0) {
            Donnerstag2 = donnerstagtest2;
        }

        if (freittagtest2.length > 0) {
            Freitag2 = freittagtest2;
        }

        // abfragen für dritte stunde

        if (montagtest3.length > 0) {
            Montag3 = montagtest3;
        }

        if (dienstagtest3.length > 0) {
            Dienstag3 = dienstagtest3;
        }
        if (mittwochtest3.length > 0) {
            Mittwoch3 = mittwochtest3;
        }
        if (donnerstagtest3.length > 0) {
            Donnerstag3 = donnerstagtest3;
        }

        if (freittagtest3.length > 0) {
            Freitag3 = freittagtest3;
        }





        //    Montag1 = loadArray(montag, getActivity());

        //     Dienstag1 = loadArray(dienstag,getActivity());


        FachMO1.setText(Montag1[0]);
        LehrerMO1.setText(Montag1[1]);
        RaumMO1.setText(Montag1[2]);


        FachDI1.setText(Dienstag1[0]);
        LehrerDI1.setText(Dienstag1[1]);
        RaumDI1.setText(Dienstag1[2]);

        FachMI1.setText(Mittwoch1[0]);
        LehrerMI1.setText(Mittwoch1[1]);
        RaumMI1.setText(Mittwoch1[2]);


        FachDO1.setText(Donnerstag1[0]);
        LehrerDO1.setText(Donnerstag1[1]);
        RaumDO1.setText(Donnerstag1[2]);


        FachFR1.setText(Freitag1[0]);
        LehrerFR1.setText(Freitag1[1]);
        RaumFR1.setText(Freitag1[2]);


        // zweite stunden

        FachMO2.setText(Montag2[0]);
        LehrerMO2.setText(Montag2[1]);
        RaumMO2.setText(Montag2[2]);


        FachDI2.setText(Dienstag2[0]);
        LehrerDI2.setText(Dienstag2[1]);
        RaumDI2.setText(Dienstag2[2]);

        FachMI2.setText(Mittwoch2[0]);
        LehrerMI2.setText(Mittwoch2[1]);
        RaumMI2.setText(Mittwoch2[2]);


        FachDO2.setText(Donnerstag2[0]);
        LehrerDO2.setText(Donnerstag2[1]);
        RaumDO2.setText(Donnerstag2[2]);


        FachFR2.setText(Freitag2[0]);
        LehrerFR2.setText(Freitag2[1]);
        RaumFR2.setText(Freitag2[2]);

        // dritte stunden

        FachMO3.setText(Montag3[0]);
        LehrerMO3.setText(Montag3[1]);
        RaumMO3.setText(Montag3[2]);


        FachDI3.setText(Dienstag3[0]);
        LehrerDI3.setText(Dienstag3[1]);
        RaumDI3.setText(Dienstag3[2]);

        FachMI3.setText(Mittwoch3[0]);
        LehrerMI3.setText(Mittwoch3[1]);
        RaumMI3.setText(Mittwoch3[2]);


        FachDO3.setText(Donnerstag3[0]);
        LehrerDO3.setText(Donnerstag3[1]);
        RaumDO3.setText(Donnerstag3[2]);


        FachFR3.setText(Freitag3[0]);
        LehrerFR3.setText(Freitag3[1]);
        RaumFR3.setText(Freitag3[2]);



        String FachMO1Test = FachMO1.getText().toString();
        Log.d(TAG, "schreibeInTV: korrekt" + FachMO1Test);
    }


    public void speicherArray(String a, String b, String c, String d) {

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
                    saveArray(Holder, montag1, getActivity());
                    break;
                }

                case "MO2": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, montag2, getActivity());

                    break;
                }

                case "MO3": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, montag3, getActivity());

                    break;
                }
            }


        } else if (d.contains("DI")) {
            switch (d) {
                case "DI1": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, dienstag1, getActivity());
                    break;
                }


                case "DI2": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, dienstag2, getActivity());
                    break;
                }

                case "DI3": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, dienstag3, getActivity());
                    break;
                }


            }
        } else if (d.contains("MI")) {
            switch (d) {
                case "MI1": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, mittwoch1, getActivity());
                    break;
                }
                case "MI2": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, mittwoch2, getActivity());
                    break;
                }
                case "MI3": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, mittwoch3, getActivity());
                    break;
                }
            }
        }else if (d.contains("DO")) {
            switch (d) {
                case "DO1": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, donnerstag1, getActivity());
                    break;
                }

                case "DO2": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, donnerstag2, getActivity());
                    break;
                }

                case "DO3": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, donnerstag3, getActivity());
                    break;
                }
            }
        }else if (d.contains("FR")) {
            switch (d) {
                case "FR1": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, freitag1, getActivity());
                    break;
                }

                case "FR2": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, freitag2, getActivity());
                    break;
                }

                case "FR3": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, freitag3, getActivity());
                    break;
                }
            }
        }


    }

//a

    public boolean saveArray(String[] array, String arrayName, Context mContext) {
        SharedPreferences prefs = mContext.getSharedPreferences("preferencename", 0);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt(arrayName + "_size", array.length);
        for (int i = 0; i < array.length; i++)
            editor.putString(arrayName + "_" + i, array[i]);
        return editor.commit();
    }


    public String[] loadArray(String arrayName, Context mContext) {
        SharedPreferences prefs = mContext.getSharedPreferences("preferencename", 0);
        int size = prefs.getInt(arrayName + "_size", 0);
        String array[] = new String[size];
        for (int i = 0; i < size; i++)
            array[i] = prefs.getString(arrayName + "_" + i, null);
        return array;
    }
}

