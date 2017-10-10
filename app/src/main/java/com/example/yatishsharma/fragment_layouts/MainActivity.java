package com.example.yatishsharma.fragment_layouts;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

public class MainActivity extends FragmentActivity implements Frag_2.OnSetListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public void showText(String txt) {
        Fragment fg = (Fragment) getSupportFragmentManager().findFragmentById(R.id.Frag_4);
        if (fg instanceof Frag_4){
            ((Frag_4) fg).dataChange(txt);
        }
    }
}
