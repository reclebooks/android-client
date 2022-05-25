package com.example.myapplication;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;

class ViewPagerAdapter extends PagerAdapter
{
    private final Context context;
    private final ArrayList<Integer> imageList;

    public ViewPagerAdapter(Context context, ArrayList<Integer> imageList)
    {
        this.context = context;
        this.imageList = imageList;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position)
    {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.view_pager_image, container, false);

        ImageView imageView = view.findViewById(R.id.ImageViewPager);
        imageView.setImageResource(imageList.get(position));

        container.addView(view);

        return (view);
    }

    @Override
    public int getCount()
    {
        return (this.imageList.size());
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object)
    {
        container.removeView((View)object);
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object)
    {
        return (view == object);
    }
}

public class PostActivity extends AppCompatActivity
{
    private ArrayList<Integer> imageList;

    ImageView heartLikeImage;
    ImageView backButtonFromDetailPage;
    boolean isInterested = false;

    public void initializeData()
    {
        this.imageList = new ArrayList<>();
        this.imageList.add(R.drawable.viewpagetest);
        this.imageList.add(R.drawable.viewpagetest);
        this.imageList.add(R.drawable.viewpagetest);
    }

    public void setViewPager()
    {
        ViewPager viewPager = findViewById(R.id.ViewPager);
        viewPager.setClipToPadding(false);

        viewPager.setAdapter(new ViewPagerAdapter(this, imageList));
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.post);

        this.initializeData();
        this.setViewPager();

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

        this.backButtonFromDetailPage = findViewById(R.id.backButtonFromDetailPage);
        this.backButtonFromDetailPage.setOnClickListener(view -> finish());
    }
}
