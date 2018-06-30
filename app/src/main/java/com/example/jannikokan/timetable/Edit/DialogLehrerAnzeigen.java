package com.example.jannikokan.timetable.Edit;

import android.app.DialogFragment;
import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jannikokan.timetable.Helper.DatabaseHelper;
import com.example.jannikokan.timetable.R;

import java.util.ArrayList;

public class DialogLehrerAnzeigen extends DialogFragment {
    private static final String TAG = "DialogLehrerAnzeigen";

    DatabaseHelper myDb;

    TextView myLZu;


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
        View view = inflater.inflate(R.layout.dialog_lehrer_anz,container, false);



        myDb = new DatabaseHelper((EditActivity) getActivity());
        ListView listViewLehrer = (ListView) view.findViewById(R.id.listViewLehrer);
        final ArrayList<String> lehrerList = new ArrayList<>();

        myLZu = (TextView) view.findViewById(R.id.action_LZu);

        Cursor res = myDb.zeigeLehrer();




        if (res.getCount() == 0) {



            Toast.makeText((EditActivity) getActivity(), "Keine Facher da", Toast.LENGTH_LONG).show();
        }
        else {
            while (res.moveToNext()) {
                lehrerList.add(res.getString(1));
                ListAdapter fachListAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, lehrerList);
                listViewLehrer.setAdapter(fachListAdapter);
            }

            listViewLehrer.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                }
            });

            myLZu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    getDialog().dismiss();
                }
            });


        }


        return view;
    }





}
