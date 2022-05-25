package com.example.myapplication;

import android.view.View;

import com.example.myapplication.Book.BookAdapter;

public interface OnSellItemClickListener {
    public void onItemClick(SellAdapter.ViewHolder holder, View view, int position);
}
