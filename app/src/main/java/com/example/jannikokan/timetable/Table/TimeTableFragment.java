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

    // arrays für die achte stunden

    String Montag8[] = {"-", " - ", " -", "-"};
    String Dienstag8[] = {"-", "-", "-", "-"};
    String Mittwoch8[] = {"-", "-", "-", "-"};
    String Donnerstag8[] =  {"-", "-", "-", "-"};
    String Freitag8 [] =  {"-", "-", "-", "-"};


    String montagtest8[] = {"-", "-", "-", "-"};
    String dienstagtest8[] = {"-", "-", "-", "-"};
    String mittwochtest8[] = {"-", "-", "-", "-"};
    String donnerstagtest8[] = {"-", "-", "-", "-"};
    String freittagtest8 [] =  {"-", "-", "-", "-"};


    String montag8 = "Montag8";
    String dienstag8 = "Dienstag8";
    String mittwoch8 = "Mittwoch8";
    String donnerstag8 = "Donnerstag8";
    String freitag8 = "Freitag8";


    // arrays für die neunte stunden

    String Montag9[] = {"-", " - ", " -", "-"};
    String Dienstag9[] = {"-", "-", "-", "-"};
    String Mittwoch9[] = {"-", "-", "-", "-"};
    String Donnerstag9[] =  {"-", "-", "-", "-"};
    String Freitag9 [] =  {"-", "-", "-", "-"};


    String montagtest9[] = {"-", "-", "-", "-"};
    String dienstagtest9[] = {"-", "-", "-", "-"};
    String mittwochtest9[] = {"-", "-", "-", "-"};
    String donnerstagtest9[] = {"-", "-", "-", "-"};
    String freittagtest9 [] =  {"-", "-", "-", "-"};


    String montag9 = "Montag9";
    String dienstag9 = "Dienstag9";
    String mittwoch9 = "Mittwoch9";
    String donnerstag9 = "Donnerstag9";
    String freitag9 = "Freitag9";

    // arrays für die zehnte stunden

    String Montag0[] = {"-", " - ", " -", "-"};
    String Dienstag0[] = {"-", "-", "-", "-"};
    String Mittwoch0[] = {"-", "-", "-", "-"};
    String Donnerstag0[] =  {"-", "-", "-", "-"};
    String Freitag0 [] =  {"-", "-", "-", "-"};


    String montagtest0[] = {"-", "-", "-", "-"};
    String dienstagtest0[] = {"-", "-", "-", "-"};
    String mittwochtest0[] = {"-", "-", "-", "-"};
    String donnerstagtest0[] = {"-", "-", "-", "-"};
    String freittagtest0 [] =  {"-", "-", "-", "-"};


    String montag0 = "Montag0";
    String dienstag0 = "Dienstag0";
    String mittwoch0 = "Mittwoch0";
    String donnerstag0 = "Donnerstag0";
    String freitag0 = "Freitag0";








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

        // vierte Stunden

        MO4 = view.findViewById(R.id.MO4);
        DI4 = view.findViewById(R.id.DI4);
        MI4 = view.findViewById(R.id.MI4);
        DO4 = view.findViewById(R.id.DO4);
        FR4 = view.findViewById(R.id.FR4);

        FachMO4 = (TextView) MO4.findViewById(R.id.textViewFach);
        LehrerMO4 = (TextView) MO4.findViewById(R.id.textViewLehrer);
        RaumMO4 = (TextView) MO4.findViewById(R.id.textViewRaum);

        FachDI4 = (TextView) DI4.findViewById(R.id.textViewFach);
        LehrerDI4 = (TextView) DI4.findViewById(R.id.textViewLehrer);
        RaumDI4 = (TextView) DI4.findViewById(R.id.textViewRaum);

        FachMI4 = (TextView) MI4.findViewById(R.id.textViewFach);
        LehrerMI4 = (TextView) MI4.findViewById(R.id.textViewLehrer);
        RaumMI4 = (TextView) MI4.findViewById(R.id.textViewRaum);

        FachDO4 = (TextView) DO4.findViewById(R.id.textViewFach);
        LehrerDO4 = (TextView) DO4.findViewById(R.id.textViewLehrer);
        RaumDO4 = (TextView) DO4.findViewById(R.id.textViewRaum);

        FachFR4 = (TextView) FR4.findViewById(R.id.textViewFach);
        LehrerFR4 = (TextView) FR4.findViewById(R.id.textViewLehrer);
        RaumFR4 = (TextView) FR4.findViewById(R.id.textViewRaum);


        // fünfte Stunden

        MO5 = view.findViewById(R.id.MO5);
        DI5 = view.findViewById(R.id.DI5);
        MI5 = view.findViewById(R.id.MI5);
        DO5 = view.findViewById(R.id.DO5);
        FR5 = view.findViewById(R.id.FR5);

        FachMO5 = (TextView) MO5.findViewById(R.id.textViewFach);
        LehrerMO5 = (TextView) MO5.findViewById(R.id.textViewLehrer);
        RaumMO5 = (TextView) MO5.findViewById(R.id.textViewRaum);

        FachDI5 = (TextView) DI5.findViewById(R.id.textViewFach);
        LehrerDI5 = (TextView) DI5.findViewById(R.id.textViewLehrer);
        RaumDI5 = (TextView) DI5.findViewById(R.id.textViewRaum);

        FachMI5 = (TextView) MI5.findViewById(R.id.textViewFach);
        LehrerMI5 = (TextView) MI5.findViewById(R.id.textViewLehrer);
        RaumMI5 = (TextView) MI5.findViewById(R.id.textViewRaum);

        FachDO5 = (TextView) DO5.findViewById(R.id.textViewFach);
        LehrerDO5 = (TextView) DO5.findViewById(R.id.textViewLehrer);
        RaumDO5 = (TextView) DO5.findViewById(R.id.textViewRaum);

        FachFR5 = (TextView) FR5.findViewById(R.id.textViewFach);
        LehrerFR5 = (TextView) FR5.findViewById(R.id.textViewLehrer);
        RaumFR5 = (TextView) FR5.findViewById(R.id.textViewRaum);

        // sechste Stunden

        MO6 = view.findViewById(R.id.MO6);
        DI6 = view.findViewById(R.id.DI6);
        MI6 = view.findViewById(R.id.MI6);
        DO6 = view.findViewById(R.id.DO6);
        FR6 = view.findViewById(R.id.FR6);

        FachMO6 = (TextView) MO6.findViewById(R.id.textViewFach);
        LehrerMO6 = (TextView) MO6.findViewById(R.id.textViewLehrer);
        RaumMO6 = (TextView) MO6.findViewById(R.id.textViewRaum);

        FachDI6 = (TextView) DI6.findViewById(R.id.textViewFach);
        LehrerDI6 = (TextView) DI6.findViewById(R.id.textViewLehrer);
        RaumDI6 = (TextView) DI6.findViewById(R.id.textViewRaum);

        FachMI6 = (TextView) MI6.findViewById(R.id.textViewFach);
        LehrerMI6 = (TextView) MI6.findViewById(R.id.textViewLehrer);
        RaumMI6 = (TextView) MI6.findViewById(R.id.textViewRaum);

        FachDO6 = (TextView) DO6.findViewById(R.id.textViewFach);
        LehrerDO6 = (TextView) DO6.findViewById(R.id.textViewLehrer);
        RaumDO6 = (TextView) DO6.findViewById(R.id.textViewRaum);

        FachFR6 = (TextView) FR6.findViewById(R.id.textViewFach);
        LehrerFR6 = (TextView) FR6.findViewById(R.id.textViewLehrer);
        RaumFR6 = (TextView) FR6.findViewById(R.id.textViewRaum);

        // siebte Stunden

        MO7 = view.findViewById(R.id.MO7);
        DI7 = view.findViewById(R.id.DI7);
        MI7 = view.findViewById(R.id.MI7);
        DO7 = view.findViewById(R.id.DO7);
        FR7 = view.findViewById(R.id.FR7);

        FachMO7 = (TextView) MO7.findViewById(R.id.textViewFach);
        LehrerMO7 = (TextView) MO7.findViewById(R.id.textViewLehrer);
        RaumMO7 = (TextView) MO7.findViewById(R.id.textViewRaum);

        FachDI7 = (TextView) DI7.findViewById(R.id.textViewFach);
        LehrerDI7 = (TextView) DI7.findViewById(R.id.textViewLehrer);
        RaumDI7 = (TextView) DI7.findViewById(R.id.textViewRaum);

        FachMI7 = (TextView) MI7.findViewById(R.id.textViewFach);
        LehrerMI7 = (TextView) MI7.findViewById(R.id.textViewLehrer);
        RaumMI7 = (TextView) MI7.findViewById(R.id.textViewRaum);

        FachDO7 = (TextView) DO7.findViewById(R.id.textViewFach);
        LehrerDO7 = (TextView) DO7.findViewById(R.id.textViewLehrer);
        RaumDO7 = (TextView) DO7.findViewById(R.id.textViewRaum);

        FachFR7 = (TextView) FR7.findViewById(R.id.textViewFach);
        LehrerFR7 = (TextView) FR7.findViewById(R.id.textViewLehrer);
        RaumFR7 = (TextView) FR7.findViewById(R.id.textViewRaum);


        // achte Stunden

        MO8 = view.findViewById(R.id.MO8);
        DI8 = view.findViewById(R.id.DI8);
        MI8 = view.findViewById(R.id.MI8);
        DO8 = view.findViewById(R.id.DO8);
        FR8 = view.findViewById(R.id.FR8);

        FachMO8 = (TextView) MO8.findViewById(R.id.textViewFach);
        LehrerMO8 = (TextView) MO8.findViewById(R.id.textViewLehrer);
        RaumMO8 = (TextView) MO8.findViewById(R.id.textViewRaum);

        FachDI8 = (TextView) DI8.findViewById(R.id.textViewFach);
        LehrerDI8 = (TextView) DI8.findViewById(R.id.textViewLehrer);
        RaumDI8 = (TextView) DI8.findViewById(R.id.textViewRaum);

        FachMI8 = (TextView) MI8.findViewById(R.id.textViewFach);
        LehrerMI8 = (TextView) MI8.findViewById(R.id.textViewLehrer);
        RaumMI8 = (TextView) MI8.findViewById(R.id.textViewRaum);

        FachDO8 = (TextView) DO8.findViewById(R.id.textViewFach);
        LehrerDO8 = (TextView) DO8.findViewById(R.id.textViewLehrer);
        RaumDO8 = (TextView) DO8.findViewById(R.id.textViewRaum);

        FachFR8 = (TextView) FR8.findViewById(R.id.textViewFach);
        LehrerFR8 = (TextView) FR8.findViewById(R.id.textViewLehrer);
        RaumFR8 = (TextView) FR8.findViewById(R.id.textViewRaum);

        // neunte Stunden

        MO9 = view.findViewById(R.id.MO9);
        DI9 = view.findViewById(R.id.DI9);
        MI9 = view.findViewById(R.id.MI9);
        DO9 = view.findViewById(R.id.DO9);
        FR9 = view.findViewById(R.id.FR9);

        FachMO9 = (TextView) MO9.findViewById(R.id.textViewFach);
        LehrerMO9 = (TextView) MO9.findViewById(R.id.textViewLehrer);
        RaumMO9 = (TextView) MO9.findViewById(R.id.textViewRaum);

        FachDI9 = (TextView) DI9.findViewById(R.id.textViewFach);
        LehrerDI9 = (TextView) DI9.findViewById(R.id.textViewLehrer);
        RaumDI9 = (TextView) DI9.findViewById(R.id.textViewRaum);

        FachMI9 = (TextView) MI9.findViewById(R.id.textViewFach);
        LehrerMI9 = (TextView) MI9.findViewById(R.id.textViewLehrer);
        RaumMI9 = (TextView) MI9.findViewById(R.id.textViewRaum);

        FachDO9 = (TextView) DO9.findViewById(R.id.textViewFach);
        LehrerDO9 = (TextView) DO9.findViewById(R.id.textViewLehrer);
        RaumDO9 = (TextView) DO9.findViewById(R.id.textViewRaum);

        FachFR9 = (TextView) FR9.findViewById(R.id.textViewFach);
        LehrerFR9 = (TextView) FR9.findViewById(R.id.textViewLehrer);
        RaumFR9 = (TextView) FR9.findViewById(R.id.textViewRaum);

        // zehnte Stunden

        MO0 = view.findViewById(R.id.MO0);
        DI0 = view.findViewById(R.id.DI0);
        MI0 = view.findViewById(R.id.MI0);
        DO0 = view.findViewById(R.id.DO0);
        FR0 = view.findViewById(R.id.FR0);

        FachMO0 = (TextView) MO0.findViewById(R.id.textViewFach);
        LehrerMO0 = (TextView) MO0.findViewById(R.id.textViewLehrer);
        RaumMO0 = (TextView) MO0.findViewById(R.id.textViewRaum);

        FachDI0 = (TextView) DI0.findViewById(R.id.textViewFach);
        LehrerDI0 = (TextView) DI0.findViewById(R.id.textViewLehrer);
        RaumDI0 = (TextView) DI0.findViewById(R.id.textViewRaum);

        FachMI0 = (TextView) MI0.findViewById(R.id.textViewFach);
        LehrerMI0 = (TextView) MI0.findViewById(R.id.textViewLehrer);
        RaumMI0 = (TextView) MI0.findViewById(R.id.textViewRaum);

        FachDO0 = (TextView) DO0.findViewById(R.id.textViewFach);
        LehrerDO0 = (TextView) DO0.findViewById(R.id.textViewLehrer);
        RaumDO0 = (TextView) DO0.findViewById(R.id.textViewRaum);

        FachFR0 = (TextView) FR0.findViewById(R.id.textViewFach);
        LehrerFR0 = (TextView) FR0.findViewById(R.id.textViewLehrer);
        RaumFR0 = (TextView) FR0.findViewById(R.id.textViewRaum);







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



        // on click listenere für vierte stunde jedes tages


        MO4.setOnLongClickListener(new View.OnLongClickListener() {
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



        DI4.setOnLongClickListener(new View.OnLongClickListener() {
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

        MI4.setOnLongClickListener(new View.OnLongClickListener() {
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

        DO4.setOnLongClickListener(new View.OnLongClickListener() {
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

        FR4.setOnLongClickListener(new View.OnLongClickListener() {
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


        // on click listenere für fünfte stunde jedes tages


        MO5.setOnLongClickListener(new View.OnLongClickListener() {
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



        DI5.setOnLongClickListener(new View.OnLongClickListener() {
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

        MI5.setOnLongClickListener(new View.OnLongClickListener() {
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

        DO5.setOnLongClickListener(new View.OnLongClickListener() {
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

        FR5.setOnLongClickListener(new View.OnLongClickListener() {
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


        // on click listenere für sechste stunde jedes tages


        MO6.setOnLongClickListener(new View.OnLongClickListener() {
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



        DI6.setOnLongClickListener(new View.OnLongClickListener() {
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

        MI6.setOnLongClickListener(new View.OnLongClickListener() {
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

        DO6.setOnLongClickListener(new View.OnLongClickListener() {
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

        FR6.setOnLongClickListener(new View.OnLongClickListener() {
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



        // on click listenere für siebte stunde jedes tages


        MO7.setOnLongClickListener(new View.OnLongClickListener() {
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



        DI7.setOnLongClickListener(new View.OnLongClickListener() {
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

        MI7.setOnLongClickListener(new View.OnLongClickListener() {
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

        DO7.setOnLongClickListener(new View.OnLongClickListener() {
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

        FR7.setOnLongClickListener(new View.OnLongClickListener() {
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

        // on click listenere für achte stunde jedes tages


        MO8.setOnLongClickListener(new View.OnLongClickListener() {
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



        DI8.setOnLongClickListener(new View.OnLongClickListener() {
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

        MI8.setOnLongClickListener(new View.OnLongClickListener() {
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

        DO8.setOnLongClickListener(new View.OnLongClickListener() {
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

        FR8.setOnLongClickListener(new View.OnLongClickListener() {
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




        // on click listenere für neunte stunde jedes tages


        MO9.setOnLongClickListener(new View.OnLongClickListener() {
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



        DI9.setOnLongClickListener(new View.OnLongClickListener() {
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

        MI9.setOnLongClickListener(new View.OnLongClickListener() {
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

        DO9.setOnLongClickListener(new View.OnLongClickListener() {
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

        FR9.setOnLongClickListener(new View.OnLongClickListener() {
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

        // on click listenere für zehnte stunde jedes tages


        MO0.setOnLongClickListener(new View.OnLongClickListener() {
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



        DI0.setOnLongClickListener(new View.OnLongClickListener() {
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

        MI0.setOnLongClickListener(new View.OnLongClickListener() {
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

        DO0.setOnLongClickListener(new View.OnLongClickListener() {
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

        FR0.setOnLongClickListener(new View.OnLongClickListener() {
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

        montagtest4 = loadArray(montag4, getActivity());
        dienstagtest4 = loadArray(dienstag4, getActivity());
        mittwochtest4 = loadArray(mittwoch4, getActivity());
        donnerstagtest4 = loadArray(donnerstag4,getActivity());
        freittagtest4 = loadArray(freitag4,getActivity());

        montagtest5 = loadArray(montag5, getActivity());
        dienstagtest5 = loadArray(dienstag5, getActivity());
        mittwochtest5 = loadArray(mittwoch5, getActivity());
        donnerstagtest5 = loadArray(donnerstag5,getActivity());
        freittagtest5 = loadArray(freitag5,getActivity());

        montagtest6 = loadArray(montag6, getActivity());
        dienstagtest6 = loadArray(dienstag6, getActivity());
        mittwochtest6 = loadArray(mittwoch6, getActivity());
        donnerstagtest6 = loadArray(donnerstag6,getActivity());
        freittagtest6 = loadArray(freitag6,getActivity());

        montagtest7 = loadArray(montag7, getActivity());
        dienstagtest7 = loadArray(dienstag7, getActivity());
        mittwochtest7 = loadArray(mittwoch7, getActivity());
        donnerstagtest7 = loadArray(donnerstag7,getActivity());
        freittagtest7 = loadArray(freitag7,getActivity());

        montagtest8 = loadArray(montag8, getActivity());
        dienstagtest8 = loadArray(dienstag8, getActivity());
        mittwochtest8 = loadArray(mittwoch8, getActivity());
        donnerstagtest8 = loadArray(donnerstag8,getActivity());
        freittagtest8 = loadArray(freitag8,getActivity());

        montagtest9 = loadArray(montag9, getActivity());
        dienstagtest9 = loadArray(dienstag9, getActivity());
        mittwochtest9 = loadArray(mittwoch9, getActivity());
        donnerstagtest9 = loadArray(donnerstag9,getActivity());
        freittagtest9 = loadArray(freitag9,getActivity());

        montagtest0 = loadArray(montag0, getActivity());
        dienstagtest0 = loadArray(dienstag0, getActivity());
        mittwochtest0 = loadArray(mittwoch0, getActivity());
        donnerstagtest0 = loadArray(donnerstag0,getActivity());
        freittagtest0 = loadArray(freitag0,getActivity());







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


        // abfragen für vierte stunde

        if (montagtest4.length > 0) {
            Montag4 = montagtest4;
        }

        if (dienstagtest4.length > 0) {
            Dienstag4 = dienstagtest4;
        }
        if (mittwochtest4.length > 0) {
            Mittwoch4 = mittwochtest4;
        }
        if (donnerstagtest4.length > 0) {
            Donnerstag4 = donnerstagtest4;
        }

        if (freittagtest4.length > 0) {
            Freitag4 = freittagtest4;
        }



        // abfragen für fünfte stunde

        if (montagtest5.length > 0) {
            Montag5 = montagtest5;
        }

        if (dienstagtest5.length > 0) {
            Dienstag5 = dienstagtest5;
        }
        if (mittwochtest5.length > 0) {
            Mittwoch5 = mittwochtest5;
        }
        if (donnerstagtest5.length > 0) {
            Donnerstag5 = donnerstagtest5;
        }

        if (freittagtest5.length > 0) {
            Freitag5 = freittagtest5;
        }


        // abfragen für sechste stunde

        if (montagtest6.length > 0) {
            Montag6 = montagtest6;
        }

        if (dienstagtest6.length > 0) {
            Dienstag6 = dienstagtest6;
        }
        if (mittwochtest6.length > 0) {
            Mittwoch6 = mittwochtest6;
        }
        if (donnerstagtest6.length > 0) {
            Donnerstag6 = donnerstagtest6;
        }

        if (freittagtest6.length > 0) {
            Freitag6 = freittagtest6;
        }



        // abfragen für siebte stunde

        if (montagtest7.length > 0) {
            Montag7 = montagtest7;
        }

        if (dienstagtest7.length > 0) {
            Dienstag7 = dienstagtest7;
        }
        if (mittwochtest7.length > 0) {
            Mittwoch7 = mittwochtest7;
        }
        if (donnerstagtest7.length > 0) {
            Donnerstag7 = donnerstagtest7;
        }

        if (freittagtest7.length > 0) {
            Freitag7 = freittagtest7;
        }


        // abfragen für achte stunde

        if (montagtest8.length > 0) {
            Montag8 = montagtest8;
        }

        if (dienstagtest8.length > 0) {
            Dienstag8 = dienstagtest8;
        }
        if (mittwochtest8.length > 0) {
            Mittwoch8 = mittwochtest8;
        }
        if (donnerstagtest8.length > 0) {
            Donnerstag8 = donnerstagtest8;
        }

        if (freittagtest8.length > 0) {
            Freitag8 = freittagtest8;
        }


        // abfragen für neunte stunde

        if (montagtest9.length > 0) {
            Montag9 = montagtest9;
        }

        if (dienstagtest9.length > 0) {
            Dienstag9 = dienstagtest9;
        }
        if (mittwochtest9.length > 0) {
            Mittwoch9 = mittwochtest9;
        }
        if (donnerstagtest9.length > 0) {
            Donnerstag9 = donnerstagtest9;
        }

        if (freittagtest9.length > 0) {
            Freitag9 = freittagtest9;
        }

        // abfragen für zehnte stunde

        if (montagtest0.length > 0) {
            Montag0 = montagtest0;
        }

        if (dienstagtest0.length > 0) {
            Dienstag0 = dienstagtest0;
        }
        if (mittwochtest0.length > 0) {
            Mittwoch0 = mittwochtest0;
        }
        if (donnerstagtest0.length > 0) {
            Donnerstag0 = donnerstagtest0;
        }

        if (freittagtest0.length > 0) {
            Freitag0 = freittagtest0;
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



        // vierte stunden

        FachMO4.setText(Montag4[0]);
        LehrerMO4.setText(Montag4[1]);
        RaumMO4.setText(Montag4[2]);


        FachDI4.setText(Dienstag4[0]);
        LehrerDI4.setText(Dienstag4[1]);
        RaumDI4.setText(Dienstag4[2]);

        FachMI4.setText(Mittwoch4[0]);
        LehrerMI4.setText(Mittwoch4[1]);
        RaumMI4.setText(Mittwoch4[2]);


        FachDO4.setText(Donnerstag4[0]);
        LehrerDO4.setText(Donnerstag4[1]);
        RaumDO4.setText(Donnerstag4[2]);


        FachFR4.setText(Freitag4[0]);
        LehrerFR4.setText(Freitag4[1]);
        RaumFR4.setText(Freitag4[2]);



        // fünfte stunden

        FachMO5.setText(Montag5[0]);
        LehrerMO5.setText(Montag5[1]);
        RaumMO5.setText(Montag5[2]);


        FachDI5.setText(Dienstag5[0]);
        LehrerDI5.setText(Dienstag5[1]);
        RaumDI5.setText(Dienstag5[2]);

        FachMI5.setText(Mittwoch5[0]);
        LehrerMI5.setText(Mittwoch5[1]);
        RaumMI5.setText(Mittwoch5[2]);


        FachDO5.setText(Donnerstag5[0]);
        LehrerDO5.setText(Donnerstag5[1]);
        RaumDO5.setText(Donnerstag5[2]);


        FachFR5.setText(Freitag5[0]);
        LehrerFR5.setText(Freitag5[1]);
        RaumFR5.setText(Freitag5[2]);


        // sechste stunden

        FachMO6.setText(Montag6[0]);
        LehrerMO6.setText(Montag6[1]);
        RaumMO6.setText(Montag6[2]);


        FachDI6.setText(Dienstag6[0]);
        LehrerDI6.setText(Dienstag6[1]);
        RaumDI6.setText(Dienstag6[2]);

        FachMI6.setText(Mittwoch6[0]);
        LehrerMI6.setText(Mittwoch6[1]);
        RaumMI6.setText(Mittwoch6[2]);


        FachDO6.setText(Donnerstag6[0]);
        LehrerDO6.setText(Donnerstag6[1]);
        RaumDO6.setText(Donnerstag6[2]);


        FachFR6.setText(Freitag6[0]);
        LehrerFR6.setText(Freitag6[1]);
        RaumFR6.setText(Freitag6[2]);



        // siebte stunden

        FachMO7.setText(Montag7[0]);
        LehrerMO7.setText(Montag7[1]);
        RaumMO7.setText(Montag7[2]);


        FachDI7.setText(Dienstag7[0]);
        LehrerDI7.setText(Dienstag7[1]);
        RaumDI7.setText(Dienstag7[2]);

        FachMI7.setText(Mittwoch7[0]);
        LehrerMI7.setText(Mittwoch7[1]);
        RaumMI7.setText(Mittwoch7[2]);


        FachDO7.setText(Donnerstag7[0]);
        LehrerDO7.setText(Donnerstag7[1]);
        RaumDO7.setText(Donnerstag7[2]);


        FachFR7.setText(Freitag7[0]);
        LehrerFR7.setText(Freitag7[1]);
        RaumFR7.setText(Freitag7[2]);


        // achte stunden

        FachMO8.setText(Montag8[0]);
        LehrerMO8.setText(Montag8[1]);
        RaumMO8.setText(Montag8[2]);


        FachDI8.setText(Dienstag8[0]);
        LehrerDI8.setText(Dienstag8[1]);
        RaumDI8.setText(Dienstag8[2]);

        FachMI8.setText(Mittwoch8[0]);
        LehrerMI8.setText(Mittwoch8[1]);
        RaumMI8.setText(Mittwoch8[2]);


        FachDO8.setText(Donnerstag8[0]);
        LehrerDO8.setText(Donnerstag8[1]);
        RaumDO8.setText(Donnerstag8[2]);


        FachFR8.setText(Freitag8[0]);
        LehrerFR8.setText(Freitag8[1]);
        RaumFR8.setText(Freitag8[2]);


        // neunte stunden

        FachMO9.setText(Montag9[0]);
        LehrerMO9.setText(Montag9[1]);
        RaumMO9.setText(Montag9[2]);


        FachDI9.setText(Dienstag9[0]);
        LehrerDI9.setText(Dienstag9[1]);
        RaumDI9.setText(Dienstag9[2]);

        FachMI9.setText(Mittwoch9[0]);
        LehrerMI9.setText(Mittwoch9[1]);
        RaumMI9.setText(Mittwoch9[2]);


        FachDO9.setText(Donnerstag9[0]);
        LehrerDO9.setText(Donnerstag9[1]);
        RaumDO9.setText(Donnerstag9[2]);


        FachFR9.setText(Freitag9[0]);
        LehrerFR9.setText(Freitag9[1]);
        RaumFR9.setText(Freitag9[2]);


        // zehnte stunden

        FachMO0.setText(Montag0[0]);
        LehrerMO0.setText(Montag0[1]);
        RaumMO0.setText(Montag0[2]);


        FachDI0.setText(Dienstag0[0]);
        LehrerDI0.setText(Dienstag0[1]);
        RaumDI0.setText(Dienstag0[2]);

        FachMI0.setText(Mittwoch0[0]);
        LehrerMI0.setText(Mittwoch0[1]);
        RaumMI0.setText(Mittwoch0[2]);


        FachDO0.setText(Donnerstag0[0]);
        LehrerDO0.setText(Donnerstag0[1]);
        RaumDO0.setText(Donnerstag0[2]);


        FachFR0.setText(Freitag0[0]);
        LehrerFR0.setText(Freitag0[1]);
        RaumFR0.setText(Freitag0[2]);






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

                case "MO4": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, montag4, getActivity());

                    break;
                }

                case "MO5": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, montag5, getActivity());

                    break;
                }

                case "MO6": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, montag6, getActivity());

                    break;
                }

                case "MO7": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, montag7, getActivity());

                    break;
                }

                case "MO8": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, montag8, getActivity());

                    break;
                }
                case "MO9": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, montag9, getActivity());

                    break;
                }

                case "MO0": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, montag0, getActivity());

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

                case "DI4": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, dienstag4, getActivity());
                    break;
                }

                case "DI5": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, dienstag5, getActivity());
                    break;
                }

                case "DI6": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, dienstag6, getActivity());
                    break;
                }

                case "DI7": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, dienstag7, getActivity());
                    break;
                }


                case "DI8": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, dienstag8, getActivity());
                    break;
                }

                case "DI9": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, dienstag9, getActivity());
                    break;
                }

                case "DI0": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, dienstag0, getActivity());
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


                case "MI4": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, mittwoch4, getActivity());
                    break;
                }

                case "MI5": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, mittwoch5, getActivity());
                    break;
                }


                case "MI6": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, mittwoch6, getActivity());
                    break;
                }

                case "MI7": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, mittwoch7, getActivity());
                    break;
                }


                case "MI8": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, mittwoch8, getActivity());
                    break;
                }

                case "MI9": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, mittwoch9, getActivity());
                    break;
                }


                case "MI0": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, mittwoch0, getActivity());
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


                case "DO4": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, donnerstag4, getActivity());
                    break;
                }

                case "DO5": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, donnerstag5, getActivity());
                    break;
                }


                case "DO6": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, donnerstag6, getActivity());
                    break;
                }

                case "DO7": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, donnerstag7, getActivity());
                    break;
                }

                case "DO8": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, donnerstag8, getActivity());
                    break;
                }

                case "DO9": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, donnerstag9, getActivity());
                    break;
                }

                case "DO0": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, donnerstag0, getActivity());
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


                case "FR4": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, freitag4, getActivity());
                    break;
                }

                case "FR5": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, freitag5, getActivity());
                    break;
                }

                case "FR6": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, freitag6, getActivity());
                    break;
                }

                case "FR7": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, freitag7, getActivity());
                    break;
                }

                case "FR8": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, freitag8, getActivity());
                    break;
                }

                case "FR9": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, freitag9, getActivity());
                    break;
                }


                case "FR0": {
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, freitag0, getActivity());
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

