package com.example.jannikokan.timetable.Table;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.nfc.Tag;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.jannikokan.timetable.Edit.FachFragment;
import com.example.jannikokan.timetable.Helper.DatabaseHelper;
import com.example.jannikokan.timetable.R;

import java.util.ArrayList;


public class StundeZuweisen extends AppCompatActivity {
    private static final String TAG = "StundeZuweisen";

    Spinner fachSpinner;
    Spinner lehrerSpinner;
    Spinner raumSpinner;

    DatabaseHelper myDb;

    Cursor res;

    ArrayList<String> faecherListe;
    ArrayList<String> lehrerListe;
    ArrayList<String> raumListe;

    ArrayAdapter<String> faecherAdapter;
    ArrayAdapter<String> lehrerAdapter;
    ArrayAdapter<String> raumAdapter;

    String fachSpinnerText;
    String lehrerSpinnerText;
    String raumSpinnerText;

    Button buttonStundeZuweisen;

    TimeTableFragment timeTableFragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stunde_zuweisen);


        myDb = new DatabaseHelper(this);
        fachSpinner = findViewById(R.id.spinnerFaecher);
        lehrerSpinner = findViewById(R.id.spinnerLehrer);
        raumSpinner = findViewById(R.id.spinnerRaum);
        faecherListe = new ArrayList<>();
        lehrerListe = new ArrayList<>();
        raumListe = new ArrayList<>();
        faecherAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, faecherListe);
        lehrerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, lehrerListe);
        raumAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, raumListe);
        buttonStundeZuweisen = findViewById(R.id.buttonStundeZuweisen);

        timeTableFragment = new TimeTableFragment();

        Intent intent = getIntent();
        final String ViewID = intent.getExtras().getString("ViewID");

        zeigeSpinnerFaecher();
        zeigeSpinnerLehrer();
        zeigeSpinnerRaum();
        getFachSpinnerText();

        fachSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                fachSpinnerText = fachSpinner.getSelectedItem().toString();
                Log.d(TAG, "" + fachSpinnerText);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        lehrerSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                lehrerSpinnerText = lehrerSpinner.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        raumSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                raumSpinnerText = raumSpinner.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



        buttonStundeZuweisen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String FKZ = fachSpinnerText;
                String LKZ = lehrerSpinnerText;
                String RKZ = raumSpinnerText;
                Log.d(TAG, "" + FKZ + LKZ + RKZ);

                /**
                 * startet den Intent returnIntent und übergibt ein String Array mit FKZ,LKZ und RKZ
                 */
                Intent returnIntent = new Intent();
                returnIntent.putExtra("result", (new String[]{FKZ, LKZ, RKZ, ViewID}));

                setResult(Activity.RESULT_OK, returnIntent);
                finish();


                Toast.makeText(StundeZuweisen.this, "Stunde wurde zugewiesen.", Toast.LENGTH_LONG).show();

            }
        });
    }


    /**
     * zeigeSpinnerFaecher() zeigt Fächer im fachSpinner an
     */
    public void zeigeSpinnerFaecher() {

        res = myDb.zeigeFaecher();

        while (res.moveToNext()) {
            faecherListe.add(res.getString(1));
        }


        faecherAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fachSpinner.setAdapter(faecherAdapter);

    }

    /**
     * zeigeSpinnerLehrer zeigt Lehrer im lehrerSpinner an
     */
    public void zeigeSpinnerLehrer() {

        res = myDb.zeigeLehrer();

        while (res.moveToNext()) {
            lehrerListe.add(res.getString(1));
        }
        lehrerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        lehrerSpinner.setAdapter(lehrerAdapter);
    }

    /**
     * zeigeSpinnerRaum zeigt Räume im raumSpinner an
     */
    public void zeigeSpinnerRaum() {

        res = myDb.zeigeRaeume();

        while (res.moveToNext()) {
            raumListe.add(res.getString(1));
        }


        raumAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        raumSpinner.setAdapter(raumAdapter);

    }

    public String getFachSpinnerText() {
        return fachSpinnerText;
    }
}


