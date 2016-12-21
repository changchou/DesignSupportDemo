package com.zhang.designsupportdemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment extends Fragment {

    String mTitle;
    View view;

    public MyFragment(){

    }

    public MyFragment(String title) {
        mTitle = title;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_my, container, false);
        TextView textView = (TextView) view.findViewById(R.id.text);
        textView.setText(mTitle);
        return view;
    }

}
