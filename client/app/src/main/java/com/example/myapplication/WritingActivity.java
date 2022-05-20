package com.example.myapplication;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.InputStream;

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

    Button button;
    EditText editText;

    ImageView bookStateImage1;
    ImageView bookStateImage2;
    ImageView bookStateImage3;

    @Override
    @SuppressWarnings("deprecation")
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.writing);

        this.bookStateImage1 = findViewById(R.id.BookStateImage1);
        this.bookStateImage2 = findViewById(R.id.BookStateImage2);
        this.bookStateImage3 = findViewById(R.id.BookStateImage3);

        this.button = findViewById(R.id.WriteButton);
        this.editText = findViewById(R.id.BookPublishingDateMemo);
        this.button.setOnClickListener(view ->
        {
            Toast.makeText(getApplicationContext(), editText.getText().toString(), Toast.LENGTH_SHORT).show();
            System.out.println(editText.getText().toString());
        });


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
    }
}
