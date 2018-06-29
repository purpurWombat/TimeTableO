package com.example.jannikokan.timetable.Edit;



import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.jannikokan.timetable.Helper.DatabaseHelper;
import com.example.jannikokan.timetable.R;

public class FachFragment extends Fragment {
    private static final String TAG = "FachFragment";


    DatabaseHelper myDb;
    EditActivity editActivity ;
    Button btlehreradd;
    EditText myInputF;
    EditText myInputKz;
    Button btFachSpeichern;
    Button brFachAnzeigen;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fach, container, false);

        btFachSpeichern = (Button) view.findViewById(R.id.btFachSp);
        brFachAnzeigen = view.findViewById(R.id.btFachAnz);
        myInputF = (EditText) view.findViewById(R.id.inputF);
        myInputKz = (EditText) view.findViewById(R.id.inputKz);

        btFachSpeichern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
            String inputF = myInputF.getText().toString();
            String inputKz = myInputKz.getText().toString();

            if ((!inputF.equals("") && !inputKz.equals(""))) {
                ((EditActivity)getActivity()).addFach(inputF,inputKz);

            }else {
                Toast.makeText((EditActivity) getActivity(), "Keine Facher da", Toast.LENGTH_LONG).show();
            }
          }
        });

        brFachAnzeigen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ZeigeFaecherListe.class);
                startActivity(intent);
            }
        });
        return view;
    }
}



