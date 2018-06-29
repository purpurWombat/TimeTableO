package com.example.jannikokan.timetable.Edit;

import android.content.DialogInterface;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.jannikokan.timetable.Helper.DatabaseHelper;
import com.example.jannikokan.timetable.R;

import java.util.ArrayList;


public class ZeigeRaumListe extends AppCompatActivity {



    DatabaseHelper myDb;
    Cursor res;
    ListView listViewRaum;
    private AlertDialog.Builder build;
    ArrayList<String> raumListe = new ArrayList<>();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zeige_raeume);


        myDb = new DatabaseHelper(this);
        listViewRaum = (ListView) findViewById(R.id.listViewRaum);


        zeigeListe();

        listViewRaum.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {

            public boolean onItemLongClick(AdapterView<?> adapterView, View view, final int position, long id) {
                build = new AlertDialog.Builder(ZeigeRaumListe.this);
                build.setTitle("Raum löschen");
                build.setMessage("Willst du den Raum wirklich löschen?");

                build.setNegativeButton("Abbrechen", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

                build.setPositiveButton("Löschen", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {

                        res.moveToPosition(position);
                        myDb.loescheRaum(res.getLong(0));

                        Toast.makeText(getApplicationContext(), raumListe.get(position) + " gelöscht.", Toast.LENGTH_LONG).show();
                        myDb.zeigeRaeume();
                        dialogInterface.cancel();
                        zeigeListe();
                    }
                });
                AlertDialog alert = build.create();
                alert.show();
                return true;
            }
        });
    }

    public void zeigeListe() {

        res = myDb.zeigeRaeume();
        raumListe.clear();
        if (res.getCount() == 0) {
            Toast.makeText(ZeigeRaumListe.this, "Keine Räume gefunden", Toast.LENGTH_LONG).show();
        } else {
            while (res.moveToNext()) {
                raumListe.add(res.getString(1));

            }
            ListAdapter raumListAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, raumListe);
            listViewRaum.setAdapter(raumListAdapter);
        }
    }

}

