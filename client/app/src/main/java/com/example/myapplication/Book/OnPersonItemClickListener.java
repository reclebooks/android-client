package com.example.myapplication.Book;

import android.view.View;

import com.example.myapplication.SellAdapter;

public interface OnPersonItemClickListener {
    public void onItemClick(BookAdapter.ViewHolder holder, View view, int position);

}
