package com.example.myapplication.Chat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Chat.Dto.ChatListDto;
import com.example.myapplication.R;

import java.util.ArrayList;

public class ChatListAdapter extends RecyclerView.Adapter<ChatListAdapter.ViewHolder> implements OnChatItemClickListener{
    ArrayList<ChatListDto> items = new ArrayList<ChatListDto>();
    OnChatItemClickListener listener;

    // 뷰홀더가 새로 만들어질 때 호출된다.
    @NonNull
    @Override
    public ChatListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // 파라미터로 전달되는 뷰그룹 객체는 각 아이템을 위한 뷰그룹 객체이므로
        // XML 레이아웃을 인플레이션하여 이 뷰그룹 객체에 전달한다.
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.chatitem_list, parent, false);

        return new ViewHolder(itemView, this);
    }

    // 뷰홀더가 재사용될 때 호출된다. 이 메서드는 재활용할 수 있는 뷰홀더 객체를 파라미터로 전달한다.
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // 뷰 객체는 기존 것을 그대로 사용하고 데이터만 바꿔준다.
        ChatListDto item = items.get(position);
        holder.setItem(item);
    }

    public void setOnChatItemClickListener(OnChatItemClickListener listener)
    {
        this.listener = listener;
    }
    @Override
    public int getItemCount() {
        return items.size();
    }

    public void addItem(ChatListDto item) {
        items.add(item);
    }

    public void setItems(ArrayList<ChatListDto> items) {
        this.items = items;
    }

    public ChatListDto getItem(int position) {
        return items.get(position);
    }

    public void setItem(int position, ChatListDto item) {
        items.set(position, item);
    }

    @Override
    public void onItemClick(ViewHolder holder, View view, int position) {
        if(listener != null)
        { listener.onItemClick(holder,view,position); }
    }

    // 위에서 정의한 뷰홀더

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvPersonText;
        TextView tvPersonName;

        public ViewHolder(@NonNull View itemView, final OnChatItemClickListener listener) {
            super(itemView);

            tvPersonText = itemView.findViewById(R.id.tvPersonText);
            tvPersonName = itemView.findViewById(R.id.tvPersonName);

            itemView.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    int position = getAdapterPosition();
                    if(listener != null)
                    {
                        listener.onItemClick(ChatListAdapter.ViewHolder.this, v, position); } } });
        }


        public void setItem(ChatListDto item) {
            tvPersonText.setText(item.getContext());
            tvPersonName.setText(item.getUserName());
        }
    }
    // ...
}