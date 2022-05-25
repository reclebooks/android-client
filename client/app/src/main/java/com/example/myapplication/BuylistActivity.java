package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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


        adapter.addItem(new BuyDto("역사와 비판적 사고", "한빛 아카데미","20,000원","2022.03.23"));
        adapter.addItem(new BuyDto("역사와 비판적 사고", "한빛 아카데미","20,000원","2022.03.23"));
        adapter.addItem(new BuyDto("역사와 비판적 사고", "한빛 아카데미","20,000원","2022.03.23"));
        adapter.addItem(new BuyDto("역사와 비판적 사고", "한빛 아카데미","20,000원","2022.03.23"));
        adapter.addItem(new BuyDto("역사와 비판적 사고", "한빛 아카데미","20,000원","2022.03.23"));
        adapter.addItem(new BuyDto("역사와 비판적 사고", "한빛 아카데미","20,000원","2022.03.23"));
        recyclerView.setAdapter(adapter);
    }
}
