package com.example.jannikokan.timetable.Table;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TextView;

import com.example.jannikokan.timetable.R;

public class TimeTableFragment extends Fragment {
    private static final String TAG = "TimeTableFragment";

    TableLayout myTL;

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



String a = "b";

        TextView Lehrer;

        TextView Raum;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_timetable, container ,false);
        myTL = view.findViewById(R.id.tableLayoutTage);
        MO1 = view.findViewById(R.id.MO1);
       VGMO1 = view.findViewById(R.id.MO1);

        DI1 = view.findViewById(R.id.DI1);
       FachMO1 = (TextView) VGMO1.findViewById(R.id.textViewFach);
        FachDI1 = (TextView) DI1.findViewById(R.id.textViewFach);



        
        VGMO1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Intent intent = new Intent(getActivity(), StundeZuweisen.class);
                startActivity(intent);

                return true;
            }
        });
        


        return view;
    }




    public void setMontag1 (String MOF){
        FachMO1.setText(MOF);

    }



}

