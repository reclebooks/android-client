package com.example.myapplication;

import android.view.View;

public interface OnBuyItemClickListener
{
    void onItemClick(BuyAdapter.ViewHolder holder, View view, int position);
}
