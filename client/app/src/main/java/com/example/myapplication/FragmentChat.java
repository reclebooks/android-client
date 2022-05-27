package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class FragmentChat extends Fragment {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    ChatListAdapter adapter;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = inflater.inflate(R.layout.chatlist, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        adapter = new ChatListAdapter();

        adapter.addItem(new Person("전화주세요", "이름1"));
        adapter.addItem(new Person("팔렸나요?", "이름2"));
        adapter.addItem(new Person("중문에서 만나요", "이름3"));
        adapter.addItem(new Person("얼마에요?", "이름4"));
        adapter.addItem(new Person("안녕하세요", "이름5"));
        adapter.addItem(new Person("책 상태가 어떻게 될까요", "이름6"));
        adapter.addItem(new Person("사진좀 보내주세요", "이름7"));

        // 리사이클러뷰에 어댑터를 연결한다.
        recyclerView.setAdapter(adapter);

        return view;
    }
}