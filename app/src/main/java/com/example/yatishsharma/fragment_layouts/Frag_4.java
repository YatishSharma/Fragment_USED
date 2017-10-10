package com.example.yatishsharma.fragment_layouts;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Frag_4 extends Fragment {

    TextView txt;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_4, container, false);
        txt = (TextView)view.findViewById(R.id.downside);

        return view;
    }

    public void dataChange(String data)
    {
        txt.setText(data);
    }


}
