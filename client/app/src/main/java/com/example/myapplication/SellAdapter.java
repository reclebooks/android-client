package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Book.BookAdapter;
import com.example.myapplication.Book.Dto.Book;
import com.example.myapplication.Book.OnPersonItemClickListener;

import java.util.ArrayList;

public class SellAdapter extends RecyclerView.Adapter<SellAdapter.ViewHolder> implements OnSellItemClickListener
{
    ArrayList<Book> items = new ArrayList<Book>();
    OnSellItemClickListener listener;

    @NonNull
    @Override
    public SellAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.sell_cycle_list, parent, false);
        return new ViewHolder(itemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull SellAdapter.ViewHolder holder, int position) {
        Book item = items.get(position);
        holder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void setOnSellItemClickListener(OnSellItemClickListener listener)
    {
        this.listener = listener;
    }

    public void onItemClick(SellAdapter.ViewHolder holder, View view, int position)
    {
        if(listener != null)
        { listener.onItemClick(holder,view,position); }
    }

    public void addItem(Book item) {
        items.add(item);
    }

    public void setItems(ArrayList<Book> items) {
        this.items = items;
    }

    public Book getItem(int position) {
        return items.get(position);
    }

    public void setItem(int position, Book item) {
        items.set(position, item);
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView book_name;
        TextView book_made;
        TextView book_money;
        TextView book_time;


        public ViewHolder(@NonNull View itemView, final OnSellItemClickListener listener) {
            super(itemView);

            book_name = itemView.findViewById(R.id.book_name);
            book_made = itemView.findViewById(R.id.book_made);
            book_money = itemView.findViewById(R.id.book_money);
            book_time = itemView.findViewById(R.id.book_time);

            itemView.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    int position = getAdapterPosition();
                    if(listener != null)
                    {
                        listener.onItemClick(ViewHolder.this, v, position); } } });

        }

        public void setItem(Book item) {
            book_name.setText(item.getUsedBookCreateDto().getBook().getName());
            book_made.setText(item.getPublisherCreateDto().getName());
            book_money.setText(item.getUsedBookCreateDto().getBook().getCost().toString());
            book_time.setText(item.getUsedBookCreateDto().getBook().getPublishedDate().toString());
        }
    }
}

