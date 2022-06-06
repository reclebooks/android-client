package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Book.Dto.Book;

import java.util.ArrayList;
import java.util.List;

// 구매내역
public class BuylistActivity extends AppCompatActivity
{
    RecyclerView recyclerView;
    BuyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.buy_list);

        recyclerView = findViewById(R.id.buy_list_recyclerView);
        LinearLayoutManager layoutManager1 = new LinearLayoutManager(recyclerView.getContext());
        recyclerView.setLayoutManager(layoutManager1);
        adapter = new BuyAdapter();

        List<Book> books = new ArrayList<>();
        for(Book book : books)
        {
            this.adapter.addItem(book);
        }


        recyclerView.setAdapter(adapter);
    }
}
