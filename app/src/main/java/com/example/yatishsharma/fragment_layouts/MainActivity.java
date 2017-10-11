package com.example.yatishsharma.fragment_layouts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends FragmentActivity implements Frag_2.OnSetListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.next_activity);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this,Next_Activity.class);
                startActivity(it);
            }
        });


    }

    @Override
    public void showText(String txt) {
        Fragment fg = (Fragment) getSupportFragmentManager().findFragmentById(R.id.Frag_4);
        if (fg instanceof Frag_4){
            ((Frag_4) fg).dataChange(txt);
        }
    }
}
