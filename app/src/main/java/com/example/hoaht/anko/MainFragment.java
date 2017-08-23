package com.example.hoaht.anko;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/**
 * MainFragment.
 *
 * @author HoaHT
 */
public class MainFragment extends Fragment {
    int a;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = null;
//        int a =1;
        textView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int b = a;
                return false;
            }
        });
    }

    public interface BB {
        void abc(int i);
    }
}
