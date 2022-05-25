package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

// 판매내역
public class SelllistActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sell_list);
        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager1 = new LinearLayoutManager(recyclerView.getContext());
        recyclerView.setLayoutManager(layoutManager1);
        adapter = new SellAdapter();


        adapter.addItem(new SellDto("역사와 비판적 사고", "한빛 아카데미","20,000원","2022.03.23"));
        adapter.addItem(new SellDto("역사와 비판적 사고", "한빛 아카데미","20,000원","2022.03.23"));
        adapter.addItem(new SellDto("역사와 비판적 사고", "한빛 아카데미","20,000원","2022.03.23"));
        adapter.addItem(new SellDto("역사와 비판적 사고", "한빛 아카데미","20,000원","2022.03.23"));
        adapter.addItem(new SellDto("역사와 비판적 사고", "한빛 아카데미","20,000원","2022.03.23"));
        adapter.addItem(new SellDto("역사와 비판적 사고", "한빛 아카데미","20,000원","2022.03.23"));
        adapter.addItem(new SellDto("역사와 비판적 사고", "한빛 아카데미","20,000원","2022.03.23"));
        adapter.addItem(new SellDto("역사와 비판적 사고", "한빛 아카데미","20,000원","2022.03.23"));
        adapter.addItem(new SellDto("역사와 비판적 사고", "한빛 아카데미","20,000원","2022.03.23"));



        recyclerView.setAdapter(adapter);

    }
}
