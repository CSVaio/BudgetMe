package com.budgetme.jophyjohnson.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jophyjohnson.budgetme.R;

/**
 * Created by Jophy Johnson on 1/18/2016.
 */
public class SummaryFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_summary,container, false);

        return rootView;
    }

}
