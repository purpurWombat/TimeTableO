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


public class ZeigeLehrerListe extends AppCompatActivity {



    DatabaseHelper myDb;
    Cursor res;
    ListView listViewLehrer;
    private AlertDialog.Builder build;
    ArrayList<String> lehrerListe = new ArrayList<>();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zeige_lehrer);


        myDb = new DatabaseHelper(this);
        listViewLehrer = (ListView) findViewById(R.id.listViewLehrer);


        zeigeListe();

        listViewLehrer.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {

            public boolean onItemLongClick(AdapterView<?> adapterView, View view, final int position, long id) {
                build = new AlertDialog.Builder(ZeigeLehrerListe.this);
                build.setTitle("Lehrer löschen");
                build.setMessage("Willst du den Lehrer wirklich löschen?");

                build.setNegativeButton("Abbrechen", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

                build.setPositiveButton("Löschen", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {

                        res.moveToPosition(position);
                        myDb.loescheLehrer(res.getLong(0));

                        Toast.makeText(getApplicationContext(), lehrerListe.get(position) + " gelöscht.", Toast.LENGTH_LONG).show();
                        myDb.zeigeLehrer();
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

        res = myDb.zeigeLehrer();
        lehrerListe.clear();
        if (res.getCount() == 0) {
            Toast.makeText(ZeigeLehrerListe.this, "Keine Lehrer gefunden", Toast.LENGTH_LONG).show();
        } else {
            while (res.moveToNext()) {
                lehrerListe.add(res.getString(1));

            }
            ListAdapter lehrerListAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, lehrerListe);
            listViewLehrer.setAdapter(lehrerListAdapter);
        }
    }

}

