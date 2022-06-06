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

import com.example.myapplication.Book.Dto.Book;
import com.example.myapplication.Book.Dto.BookListElementDto;
import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

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

     /*   bookAdapter.addItem(new BookListElementDto("역사와 비판적 사고", "한빛 아카데미","20,000원","2022.03.23"));
        bookAdapter.addItem(new BookListElementDto("컴퓨터 구조", "생능 출판사","15,000원","2022.03.23"));
        bookAdapter.addItem(new BookListElementDto("역사와 비판적 사고", "한빛 아카데미","20,000원","2022.03.23"));
        bookAdapter.addItem(new BookListElementDto("컴퓨터 구조", "한빛 아카데미","20,000원","2022.03.23"));
        bookAdapter.addItem(new BookListElementDto("역사와 비판적 사고", "한빛 아카데미","20,000원","2022.03.23"));
        bookAdapter.addItem(new BookListElementDto("역사와 비판적 사고", "한빛 아카데미","20,000원","2022.03.23"));
        bookAdapter.addItem(new BookListElementDto("역사와 비판적 사고", "한빛 아카데미","20,000원","2022.03.23"));
        bookAdapter.addItem(new BookListElementDto("역사와 비판적 사고", "한빛 아카데미","20,000원","2022.03.23"));
        bookAdapter.addItem(new BookListElementDto("역사와 비판적 사고", "한빛 아카데미","20,000원","2022.03.23"));*/

        List<Book> books = new ArrayList<>();
        for(Book book : books)
        {
            this.bookAdapter.addItem(book);
        }

        recyclerView.setAdapter(bookAdapter);

        bookAdapter.setOnItemClicklistener(new OnPersonItemClickListener()
        {
            @Override
            public void onItemClick(BookAdapter.ViewHolder holder, View view, int position)
            {
                Book item = bookAdapter.getItem(position);
                //Book bookDetailDto = new Book(item.getName(), item.getPublisher(), item.getCost(), item.getPublishedDate());
                Intent intent = new Intent(getActivity(), PostActivity.class);
                PostActivity.setData(item);
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

