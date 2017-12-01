package com.example.seemc.collegeapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


public class ProfileFragment extends android.support.v4.app.Fragment {
    Profile Profile = new Profile();
    TextView tvfirst;
    TextView tvlast;
    EditText mFMEdit;
    EditText mLMEdit;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_profile, container, false);
    tvfirst =(TextView)rootView.findViewById(R.id.firstName);
    tvlast =(TextView)rootView.findViewById(R.id.lastName);

        mFMEdit = (EditText) rootView.findViewById(R.id.fName_edit);
        mLMEdit = (EditText) rootView.findViewById(R.id.lName_edit);

        tvfirst.setText(Profile.getFirstName());
        tvlast.setText(Profile.getLastName());
        return rootView;
    }
}
