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


public class ZeigeFaecherListe extends AppCompatActivity {


    SQLiteDatabase db;
    DatabaseHelper myDb;
    Cursor res;
    ListView listViewFaecher;
    private AlertDialog.Builder build;
    ArrayList<String> faecherListe = new ArrayList<>();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zeige_faecher);


        myDb = new DatabaseHelper(this);
        listViewFaecher = (ListView) findViewById(R.id.listViewFaecher);


        zeigeListe();

        listViewFaecher.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {

            public boolean onItemLongClick(AdapterView<?> adapterView, View view, final int position, long id) {
                build = new AlertDialog.Builder(ZeigeFaecherListe.this);
                build.setTitle("Fach löschen?" + faecherListe.get(position));
                build.setMessage("Willst du das Fach wirklich löschen?");

                build.setNegativeButton("Abbrechen", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

                build.setPositiveButton("Löschen", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {

                        res.moveToPosition(position);
                        myDb.loescheFach(res.getLong(0));

                        Toast.makeText(getApplicationContext(), faecherListe.get(position) + " gelöscht.", Toast.LENGTH_LONG).show();
                        myDb.zeigeFaecher();
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

        res = myDb.zeigeFaecher();
        faecherListe.clear();
        if (res.getCount() == 0) {
            Toast.makeText(ZeigeFaecherListe.this, "Keine Fächer gefunden", Toast.LENGTH_LONG).show();
        } else {
            while (res.moveToNext()) {
                faecherListe.add(res.getString(1));

            }
            ListAdapter fachListAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, faecherListe);
            listViewFaecher.setAdapter(fachListAdapter);
        }
    }

}

