package com.example.myapplication.User;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication.Book.Dto.BookCreateDto;
import com.example.myapplication.GpsActivity;
import com.example.myapplication.R;
import com.example.myapplication.User.Dto.UserLoginDto;

public class LoginActivity extends AppCompatActivity {

    Button certi_gps;
    Button shcooladd;
    EditText schoolname;
    EditText starname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in);

        schoolname=(EditText) findViewById(R.id.schoolname); // 학교명
        shcooladd=(Button) findViewById(R.id.shcooladd); // 학교 등록 버튼
        certi_gps= (Button) findViewById(R.id.nameadd); // 별명 등록 버튼
        starname=(EditText) findViewById(R.id.starname); // 별명

        UserLoginDto userLoginDtoDto = new UserLoginDto();
        // 학교 등록 버튼 누르면 dto 값 세팅
        shcooladd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userLoginDtoDto.setSchoolname(String.valueOf(schoolname.getText()));
            }
        });

        // 별명 등록 버튼 누르면 dto 세팅, Gps로 넘어감
        certi_gps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userLoginDtoDto.setStarname(String.valueOf(starname.getText()));
                Intent intent = new Intent(getApplicationContext(), GpsActivity.class);
                startActivity(intent);
            }
        });


    }
}