package com.example.myapplication.Book;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.BarActivity;
import com.example.myapplication.Book.Dto.BookCreateDto;
import com.example.myapplication.Book.Dto.LectureCreateDto;
import com.example.myapplication.Book.Dto.UsedBookCreateDto;
import com.example.myapplication.R;
import com.example.myapplication.User.Dto.UserInfoCreateDto;
import com.example.myapplication.User.SignActivity;

import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WritingActivity extends AppCompatActivity
{
    private static final int REQUEST_CODE = 0;
    private int imageNumber = 0;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST_CODE)
        {
            if(resultCode == RESULT_OK)
            {
                try
                {
                    InputStream inputStream = getContentResolver().openInputStream(data.getData());
                    Bitmap image = BitmapFactory.decodeStream(inputStream);
                    inputStream.close();

                    switch (imageNumber)
                    {
                        case 1:
                            bookStateImage1.setImageBitmap(image);
                            break;

                        case 2:
                            bookStateImage2.setImageBitmap(image);
                            break;

                        case 3:
                            bookStateImage3.setImageBitmap(image);
                            break;

                        default:
                            break;
                    }
                }
                catch (Exception exception)
                {
                    exception.printStackTrace();
                }
            }
            else if(resultCode == RESULT_CANCELED)
            {
                Toast.makeText(this, "사진 선택을 취소했습니다.", Toast.LENGTH_SHORT).show();
            }
        }
    }

    ImageView bookStateImage1;
    ImageView bookStateImage2;
    ImageView bookStateImage3;

    Button WriteButton;
    EditText BookPriceMemo, BookTitleMemo,BookAuthorMemo,BookPublishingDateMemo,ProfessorMemo,CourseMemo
            ,BookStateMemo, BookPriceInput;
    @Override
    @SuppressWarnings("deprecation")
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.writing);
        WriteButton= (Button) findViewById(R.id.WriteButton); // 작성하기 버튼
        BookPriceMemo= (EditText) findViewById(R.id.BookPublishingDateMemo); // 가격
        BookTitleMemo= (EditText) findViewById(R.id.BookTitleMemo); // 책제목
        BookAuthorMemo= (EditText) findViewById(R.id.BookAuthorMemo); // 저자
        BookPublishingDateMemo=(EditText) findViewById(R.id.BookPublisherMemo); // 출판년도
        ProfessorMemo=(EditText) findViewById(R.id.ProfessorMemo); // 교수
        CourseMemo=(EditText) findViewById(R.id.CourseMemo); // 수업명
        BookStateMemo=(EditText) findViewById(R.id.BookStateMemo); // 책 상태
        BookPriceInput = findViewById(R.id.BookPriceInput); // 판매 책 가격

        DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");

        this.bookStateImage1 = findViewById(R.id.BookStateImage1);
        this.bookStateImage2 = findViewById(R.id.BookStateImage2);
        this.bookStateImage3 = findViewById(R.id.BookStateImage3);

        this.bookStateImage1.setOnClickListener(view ->
        {
            this.imageNumber = 1;
            Intent intent = new Intent();
            intent.setType("image/*");
            intent.setAction(Intent.ACTION_GET_CONTENT);
            startActivityForResult(intent, REQUEST_CODE);
        });

        this.bookStateImage2.setOnClickListener(view ->
        {
            this.imageNumber = 2;
            Intent intent = new Intent();
            intent.setType("image/*");
            intent.setAction(Intent.ACTION_GET_CONTENT);
            startActivityForResult(intent, REQUEST_CODE);
        });

        this.bookStateImage3.setOnClickListener(view ->
        {
            this.imageNumber = 3;
            Intent intent = new Intent();
            intent.setType("image/*");
            intent.setAction(Intent.ACTION_GET_CONTENT);
            startActivityForResult(intent, REQUEST_CODE);
        });

        // 작성하기 버튼 누르면
        WriteButton.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view)
            {
                try
                {
                    // 작성하기 버튼 누르면, 정보가 DB로 넘어가면서 메인화면으로 연결
                    UsedBookCreateDto usedBookCreateDto=new UsedBookCreateDto();
                    usedBookCreateDto.getBook().setName(String.valueOf(BookTitleMemo.getText())); // 책제목
                    usedBookCreateDto.getBook().setCost(Long.valueOf((String.valueOf(BookPriceMemo.getText()))));// 가격_정가
                    usedBookCreateDto.getBook().getLecture().setName(String.valueOf(CourseMemo.getText()));// 강의명
                    usedBookCreateDto.getBook().getProfessor().setName(String.valueOf(ProfessorMemo.getText()));// 교수명
                    usedBookCreateDto.getBook().setPublishedDate(dateFormat.parse(String.valueOf(BookPublishingDateMemo.getText())));// 출판년도
                    //학교
                    //usedBookCreateDto.getBook().getLecture().getMajorCreateDto().getMajorCollegeCreateDto().getCollegeCreateDto().setName();
                    // 단과대
                    //usedBookCreateDto.getBook().getLecture().getMajorCreateDto().getMajorCollegeCreateDto().setName();
                    // 전공
                    //usedBookCreateDto.getBook().getLecture().getMajorCreateDto().setName();
                    // 판매가
                    usedBookCreateDto.setUsedBookCost(Long.valueOf((String.valueOf(BookPriceInput.getText()))));
                    // 판메자 메모
                    // 체크박스(6개)



                    Intent intent = new Intent(getApplicationContext(), BarActivity.class);
                    startActivity(intent);
                }
                catch (Exception exception)
                {
                    Toast.makeText(getApplicationContext(), "모든 항목을 입력해주세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
