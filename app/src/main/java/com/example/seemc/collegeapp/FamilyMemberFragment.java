package com.example.seemc.collegeapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.TextViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FamilyMemberFragment extends android.support.v4.app.Fragment {
    FamilyMember familyMember = new FamilyMember();
    TextView tvfirst;
    TextView tvsecond;
    EditText mFMEdit;
    EditText mLMEdit;
    Button button;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_family_member, container, false);
    tvfirst = (TextView)rootView.findViewById(R.id.firstName);
    tvsecond =(TextView)rootView.findViewById(R.id.lastName);

        mFMEdit =(EditText) rootView.findViewById(R.id.fName_edit_FM);
        mLMEdit =(EditText) rootView.findViewById(R.id.lName_edit_FM);

        button = (Button) rootView.findViewById(R.id.updateButton);

        tvfirst.setText(familyMember.getFirstName());
        tvsecond.setText(familyMember.getLastName());
        return rootView;
    }
}
