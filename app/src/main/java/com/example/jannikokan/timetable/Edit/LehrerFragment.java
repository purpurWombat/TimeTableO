package com.example.jannikokan.timetable.Edit;




import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.jannikokan.timetable.R;

public class LehrerFragment extends Fragment {
    private static final String TAG = "LehrerFragment";

    EditText myLehrer;
    EditText myLehrerKz;
    EditText myLehrerMail;
    Button btSpeicherLehrer;
    Button btAnzLeher;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_lehrer,container, false);

        myLehrer = view.findViewById(R.id.inputL);
        myLehrerKz = view.findViewById(R.id.inputLKz);
        myLehrerMail = view.findViewById(R.id.inputLMail);
        btSpeicherLehrer = view.findViewById(R.id.btLehrerSp);
        btAnzLeher = view.findViewById(R.id.btLehrerAnz);


        btSpeicherLehrer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String inputL = myLehrer.getText().toString();
                String inputLKz = myLehrerKz.getText().toString();
                String inputLMail = myLehrerMail.getText().toString();

                if ((!inputL.equals("") && !inputLKz.equals("") && !inputLMail.equals("") )) {
                    ((EditActivity)getActivity()).addLehrer(inputL,inputLKz,inputLMail);

                }else {
                    Toast.makeText((EditActivity) getActivity(), "Keine Facher da", Toast.LENGTH_LONG).show();
                }


            }
        });


        btAnzLeher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),ZeigeLehrerListe.class);
                startActivity(intent);
            }
        });

        return view;

    }
}
