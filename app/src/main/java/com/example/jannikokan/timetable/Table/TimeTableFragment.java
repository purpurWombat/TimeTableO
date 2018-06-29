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

    String a;
    String b;
    String c;
    TextView Lehrer;

    TextView Raum;
    String montag1 = "Montag1";
    String dienstag1 = "Dienstag1";
    String mittwoch1 = "Mittwoch1";
    String donnerstag1 = "Donnerstag1";
    String freitag1 = "Freitag1";

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




        stundeZuweisen = new StundeZuweisen();

        schreibeInTV();




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

        if (mittwochtest1.length > 0) {
            Freitag1 = freittagtest1;
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
                    Holder[0] = a;
                    Holder[1] = b;
                    Holder[2] = c;
                    Holder[3] = d;
                    schreibeInTV();
                    saveArray(Holder, dienstag1, getActivity());
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

