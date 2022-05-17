package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment_My extends Fragment {

    ImageView purchase_history;
    ImageView SalesHistoryButton;
    ImageView InterestsListImage;
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_my, container, false);

        purchase_history = v.findViewById (R.id.PurchaseHistoryImage);
        SalesHistoryButton = v.findViewById (R.id.SalesHistoryButton);
        InterestsListImage = v.findViewById (R.id.InterestsListImage);

        purchase_history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), BuylistActivity.class);
                startActivity(intent);
            }
        });

        SalesHistoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SelllistActivity.class);
                startActivity(intent);
            }
        });

        InterestsListImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), likelistActivity.class);
                startActivity(intent);
            }
        });
        return v;
    }

}
