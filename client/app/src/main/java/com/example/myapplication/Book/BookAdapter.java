package com.example.myapplication.Book;


import com.example.myapplication.Book.Dto.BookListElementDto;
import com.example.myapplication.R;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.ViewHolder>{

    ArrayList<BookListElementDto> items = new ArrayList<>();
    @NonNull
    @Override
    public BookAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.book_list, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull BookAdapter.ViewHolder holder, int position) {
        BookListElementDto item = items.get(position);
        holder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void addItem(BookListElementDto item) {
        items.add(item);
    }

    public void setItems(ArrayList<BookListElementDto> items) {
        this.items = items;
    }

    public BookListElementDto getItem(int position) {
        return items.get(position);
    }

    public void setItem(int position, BookListElementDto item) {
        items.set(position, item);
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView book_name;
        TextView book_made;
        TextView book_money;
        TextView book_time;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            book_name=itemView.findViewById(R.id.book_name);
            book_made=itemView.findViewById(R.id.book_made);
            book_money=itemView.findViewById(R.id.book_money);
            book_time=itemView.findViewById(R.id.book_time);
        }

        public void setItem(BookListElementDto item) {
            book_name.setText(item.getName());
            book_made.setText(item.getBook());
            book_money.setText(item.getMoney());
            book_time.setText(item.getDay());
        }
    }
}

