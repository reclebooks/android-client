package com.example.myapplication;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PostActivity extends AppCompatActivity
{
    ImageView heartLikeImage;
    boolean isInterested = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.post);

        this.heartLikeImage = findViewById(R.id.HeartLikeImage);
        this.heartLikeImage.setOnClickListener(view ->
        {
            if(!isInterested)
            {
                this.heartLikeImage.setColorFilter(Color.parseColor("#CED8F6"), PorterDuff.Mode.SRC_IN);
                isInterested = true;
            }
            else
            {
                this.heartLikeImage.setColorFilter(null);
                isInterested = false;
            }
        });
    }
}
