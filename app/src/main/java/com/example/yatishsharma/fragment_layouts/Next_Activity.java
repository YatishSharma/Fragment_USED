package com.example.yatishsharma.fragment_layouts;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;


/**
 * Created by yatishsharma on 11/10/17.
 */

public class Next_Activity extends Activity {
    FrameLayout frame_right_top;
    FrameLayout frame_right_bottom;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.next_activity);

        frame_right_top = (FrameLayout)findViewById(R.id.f2);
        frame_right_bottom = (FrameLayout)findViewById(R.id.f3);

        Fragment frag_2 = (Fragment) new Frag_2();
        Fragment frag_3 = (Fragment) new Frag_3();
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add( R.id.f2,  frag_2 ,"frame_right_top");
        transaction.add(R.id.f3,frag_3,"frame_right_bottom");
        transaction.commit();

        Button frame_merge = (Button) findViewById(R.id.Frame_Merger);
        frame_merge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frame_right_top.setVisibility(View.GONE);
            }
        });

    }
}
