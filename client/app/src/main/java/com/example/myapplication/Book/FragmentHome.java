package com.example.myapplication.Book;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Book.Dto.BookListElementDto;
import com.example.myapplication.R;

public class FragmentHome extends Fragment
{
    ImageButton writingButton;
    RecyclerView recyclerView;
    BookAdapter bookAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        this.writingButton = view.findViewById(R.id.WritingButton);
        recyclerView = view.findViewById(R.id.recyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        bookAdapter = new BookAdapter();

        bookAdapter.addItem(new BookListElementDto("역사와 비판적 사고", "한빛 아카데미","20,000원","2022.03.23"));
        bookAdapter.addItem(new BookListElementDto("역사와 비판적 사고", "한빛 아카데미","20,000원","2022.03.23"));
        bookAdapter.addItem(new BookListElementDto("역사와 비판적 사고", "한빛 아카데미","20,000원","2022.03.23"));
        bookAdapter.addItem(new BookListElementDto("역사와 비판적 사고", "한빛 아카데미","20,000원","2022.03.23"));
        bookAdapter.addItem(new BookListElementDto("역사와 비판적 사고", "한빛 아카데미","20,000원","2022.03.23"));
        bookAdapter.addItem(new BookListElementDto("역사와 비판적 사고", "한빛 아카데미","20,000원","2022.03.23"));
        bookAdapter.addItem(new BookListElementDto("역사와 비판적 사고", "한빛 아카데미","20,000원","2022.03.23"));
        bookAdapter.addItem(new BookListElementDto("역사와 비판적 사고", "한빛 아카데미","20,000원","2022.03.23"));
        bookAdapter.addItem(new BookListElementDto("역사와 비판적 사고", "한빛 아카데미","20,000원","2022.03.23"));

        recyclerView.setAdapter(bookAdapter);

        bookAdapter.setOnItemClicklistener(new OnPersonItemClickListener()
        {
            @Override
            public void onItemClick(BookAdapter.ViewHolder holder, View view, int position)
            {
                BookListElementDto item = bookAdapter.getItem(position);
                Intent intent = new Intent(getActivity(), PostActivity.class);
                startActivity(intent);
            }
        });
        this.writingButton.setOnClickListener(v ->
        {
            Intent intent = new Intent(getActivity(), WritingActivity.class);
            startActivity(intent);
        });
        return (view);
    }
}


