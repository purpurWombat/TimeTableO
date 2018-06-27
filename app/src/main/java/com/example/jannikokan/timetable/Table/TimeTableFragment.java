package com.example.jannikokan.timetable.Table;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TableLayout;

import com.example.jannikokan.timetable.R;

public class TimeTableFragment extends Fragment {
    private static final String TAG = "TimeTableFragment";

        TableLayout myTL;
        RelativeLayout MO1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_timetable, container ,false);
        myTL = view.findViewById(R.id.tableLayoutTage);
        MO1 = view.findViewById(R.id.MO1);

        
        
        
        MO1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Intent intent = new Intent(getActivity(), StundeZuweisen.class);
                startActivity(intent);
                return true;
            }
        });
        


        return view;
    }
}

