package com.example.jannikokan.timetable.Table;

import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.jannikokan.timetable.Helper.DatabaseHelper;
import com.example.jannikokan.timetable.R;

import java.util.ArrayList;


public class StundeZuweisen extends AppCompatActivity {

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




        zeigeSpinnerFaecher();
        zeigeSpinnerLehrer();
        zeigeSpinnerRaum();


        fachSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                fachSpinnerText = fachSpinner.getSelectedItem().toString();
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
                boolean istGespeichert = myDb.speicherStunde(fachSpinnerText, lehrerSpinnerText, raumSpinnerText);
                if (istGespeichert == true){
                    Toast.makeText(StundeZuweisen.this, "Stunde wurde zugewiesen.", Toast.LENGTH_LONG).show();
                }
            }
        });


    }

    public void zeigeSpinnerFaecher(){

        res = myDb.zeigeFaecher();

        while(res.moveToNext()){
            faecherListe.add(res.getString(1));
        }


        faecherAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fachSpinner.setAdapter(faecherAdapter);

        }

    public void zeigeSpinnerLehrer(){

        res = myDb.zeigeLehrer();

        while(res.moveToNext()){
            lehrerListe.add(res.getString(1));
        }


        lehrerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        lehrerSpinner.setAdapter(lehrerAdapter);

    }

    public void zeigeSpinnerRaum(){

        res = myDb.zeigeRaeume();

        while(res.moveToNext()){
            raumListe.add(res.getString(1));
        }


        raumAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        raumSpinner.setAdapter(raumAdapter);

    }






    }


