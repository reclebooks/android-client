package com.example.myapplication.Book;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.BarActivity;
import com.example.myapplication.Book.Dto.BookCreateDto;
import com.example.myapplication.R;

public class WritingActivity extends AppCompatActivity
{
    Button WriteButton;
    EditText BookPriceMemo, BookTitleMemo,BookAuthorMemo,BookPublishingDateMemo,ProfessorMemo,CourseMemo
            ,BookStateMemo;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.writing);
        BookCreateDto bookCreateDto = new BookCreateDto();
        WriteButton= (Button) findViewById(R.id.WriteButton); // 작성하기 버튼
        BookPriceMemo= (EditText) findViewById(R.id.BookPriceMemo); // 가격
        BookTitleMemo= (EditText) findViewById(R.id.BookTitleMemo); // 책제목
        BookAuthorMemo= (EditText) findViewById(R.id.BookAuthorMemo); // 저자
        BookPublishingDateMemo=(EditText) findViewById(R.id.BookPublishingDateMemo); // 출판년도
        ProfessorMemo=(EditText) findViewById(R.id.ProfessorMemo); // 교수
        CourseMemo=(EditText) findViewById(R.id.CourseMemo); // 수업명
        BookStateMemo=(EditText) findViewById(R.id.BookStateMemo); // 책 상태

        WriteButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                bookCreateDto.setCost(Long.valueOf(String.valueOf(BookPriceMemo.getText())));
                bookCreateDto.setTitle(String.valueOf(BookTitleMemo.getText()));
                bookCreateDto.setAuthor(String.valueOf(BookAuthorMemo.getText()));
                bookCreateDto.setPublish_date(String.valueOf(BookPublishingDateMemo.getText()));
                bookCreateDto.setProfessor(String.valueOf(ProfessorMemo.getText()));
                bookCreateDto.setCourse(String.valueOf(CourseMemo.getText()));
                bookCreateDto.setBookstate(String.valueOf(BookStateMemo.getText()));
                Intent intent = new Intent(getApplicationContext(), BarActivity.class);
                startActivity(intent);
            }
        });
    }
}
