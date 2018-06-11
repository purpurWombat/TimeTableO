package com.example.jannikokan.timetable.Edit;




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

import com.example.jannikokan.timetable.R;

public class RaumFragment extends Fragment {
    private static final String TAG = "RaumFragment";
    EditText myRaum;
    EditText myRaumArt;
    Button btRaumSpeichern;
    Button btRaumAnzeigen;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View  view = inflater.inflate(R.layout.fragment_raum,container, false);
        myRaum = view.findViewById(R.id.inputRNr);
        myRaumArt = view.findViewById(R.id.inputRArt);
        btRaumAnzeigen = view.findViewById(R.id.btRaumAnz);
        btRaumSpeichern = view.findViewById(R.id.btRaumSpeichern);


        btRaumSpeichern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String inputR = myRaum.getText().toString();
                String inputRArt = myRaumArt.getText().toString();

                if ((!inputR.equals("") && !inputRArt.equals(""))) {
                    ((EditActivity)getActivity()).addRaum(inputR,inputRArt);

                }else {
                    Toast.makeText((EditActivity) getActivity(), "Keine Facher da", Toast.LENGTH_LONG).show();
                }


            }
        });


        btRaumAnzeigen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "--> on click");


                DialogRaumAnz dialogRaumAnz = new DialogRaumAnz();
                dialogRaumAnz.show(getActivity().getFragmentManager(),"Y");


            }
        });


        return view;

    }
}
