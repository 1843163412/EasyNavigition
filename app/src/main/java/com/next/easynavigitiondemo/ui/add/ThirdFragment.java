package com.next.easynavigitiondemo.ui.add;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.next.easynavigitiondemo.R;

/**
 * Created by Jue on 2018/6/2.
 */

public class ThirdFragment extends android.support.v4.app.Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_third, container,false);
        return view;
    }

}