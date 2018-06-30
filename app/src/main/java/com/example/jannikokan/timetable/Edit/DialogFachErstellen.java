package com.example.jannikokan.timetable.Edit;

import android.app.DialogFragment;
import android.content.DialogInterface;
import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.text.method.CharacterPickerDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jannikokan.timetable.Helper.DatabaseHelper;
import com.example.jannikokan.timetable.R;

import java.util.ArrayList;

public class DialogFachErstellen extends DialogFragment {

    private static final String TAG = "DialogFachErstellen";





    DatabaseHelper myDb;
    Cursor res;

    TextView myZu;
    private AlertDialog.Builder build;
    ArrayList<String> faecherListe = new ArrayList<>();


    /**
     *
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dialog_fach_erstellen,container, false);



       myDb = new DatabaseHelper((EditActivity) getActivity());
        ListView listViewFaecher = (ListView) view.findViewById(R.id.listViewFaecher);
        final ArrayList<String> faecherListe = new ArrayList<>();

        myZu = (TextView) view.findViewById(R.id.action_Zu);

       res = myDb.zeigeFaecher();

        if (res.getCount() == 0) {
            Toast.makeText((EditActivity) getActivity(), "Keine Facher da", Toast.LENGTH_LONG).show();
        }
        else {
                while (res.moveToNext()) {
                    faecherListe.add(res.getString(1));
                    ListAdapter fachListAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, faecherListe);
                    listViewFaecher.setAdapter(fachListAdapter);
                }

            }
            listViewFaecher.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, final int position, long id) {

                    build = new AlertDialog.Builder(getActivity());
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

                            Toast.makeText(getContext(), faecherListe.get(position) + " gelöscht.", Toast.LENGTH_LONG).show();
                            myDb.zeigeFaecher();
                            dialogInterface.cancel();


                        }
                    });

                    AlertDialog alert = build.create();
                    alert.show();




                }
            });

            myZu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    getDialog().dismiss();
                }
            });





        return view;
    }


}
