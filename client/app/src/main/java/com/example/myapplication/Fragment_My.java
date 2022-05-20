package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment_My extends Fragment
{
    ImageView interestListImageView;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_my, container, false);
        this.interestListImageView = view.findViewById(R.id.InterestsListImage);
        this.interestListImageView.setOnClickListener(v ->
        {
            Toast.makeText(getActivity(), "Hello World!", Toast.LENGTH_SHORT).show();
        });
        return (view);
    }
}
