package com.example.jannikokan.timetable.Table;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TextView;

import com.example.jannikokan.timetable.R;

public class TimeTableFragment extends Fragment {

        TableLayout myTL;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_timetable, container ,false);
        myTL = view.findViewById(R.id.tableLayoutTage);


        return view;
    }
}

