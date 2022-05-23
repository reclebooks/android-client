package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
public class ChatListActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ChatListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chatlist);

        recyclerView = findViewById(R.id.recyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new ChatListAdapter();

        adapter.addItem(new Person("이름1", "거래 했어요"));
        adapter.addItem(new Person("이름2", "010-2000-2000"));
        adapter.addItem(new Person("이름3", "010-3000-3000"));
        adapter.addItem(new Person("이름4", "010-4000-4000"));
        adapter.addItem(new Person("이름5", "010-5000-5000"));
        adapter.addItem(new Person("이름6", "010-6000-6000"));
        adapter.addItem(new Person("이름7", "010-7000-7000"));
        adapter.addItem(new Person("이름8", "010-8000-8000"));
        adapter.addItem(new Person("이름9", "010-9000-9000"));
        adapter.addItem(new Person("이름10", "010-1000-1000"));
        adapter.addItem(new Person("이름11", "010-1100-1100"));
        adapter.addItem(new Person("이름12", "010-1200-1200"));
        adapter.addItem(new Person("이름13", "010-1300-1300"));
        adapter.addItem(new Person("이름14", "010-1400-1400"));

        // 리사이클러뷰에 어댑터를 연결한다.
        recyclerView.setAdapter(adapter);
    }
}