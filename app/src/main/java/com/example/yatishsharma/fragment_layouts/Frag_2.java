package com.example.yatishsharma.fragment_layouts;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class Frag_2 extends Fragment {
    private static final String TAG = "Frag_2";

    EditText edt;
    OnSetListener listener;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_2, container, false);

        edt = (EditText) view.findViewById(R.id.editText_frag2);
        Button upper_Button = (Button) view.findViewById(R.id.upper_button);

        upper_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = edt.getText().toString(); // Used to pass data between fragments
                listener.showText(str);               //Listener is of the interface defined in the end

            }
        });

        return view;
    }


    public interface OnSetListener
    {
        public void showText(String txt);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try{
            listener = (OnSetListener)context;
        }
        catch (Exception e){
            Log.d(TAG, "onAttach: Here WE had a problem");
        }
    }
}
