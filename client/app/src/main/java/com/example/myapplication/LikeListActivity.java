package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.myapplication.Book.Dto.BookListElementDto;

import java.util.ArrayList;
public class LikeListActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LikeListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.like_list);

        recyclerView = findViewById(R.id.recyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new LikeListAdapter();

        adapter.addItem(new BookListElementDto("역사와 비판적 사고", "한빛 미디어", "10000", "2022-05-24"));
        adapter.addItem(new BookListElementDto("운영체제", "한빛 미디어", "20000", "2022-05-24"));
        adapter.addItem(new BookListElementDto("객체지향 설계", "한빛 미디어", "30000", "2022-05-24"));
        adapter.addItem(new BookListElementDto("컴퓨터 구조", "한빛 미디어", "15000", "2022-05-24"));

        // 리사이클러뷰에 어댑터를 연결한다.
        recyclerView.setAdapter(adapter);
    }
}