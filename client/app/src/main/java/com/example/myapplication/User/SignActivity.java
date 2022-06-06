package com.example.myapplication.User;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication.R;
import com.example.myapplication.User.Dto.UserCreateDto;

public class SignActivity extends AppCompatActivity {
    EditText inputBunho;
    String phoneValidation = "^01([0|1|6|7|8|9])-?([0-9]{3,4})-?([0-9]{4})$";

    Button certiButton;
    Button btnBunho;
    EditText inputcertnum;
    public static String phone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
        UserCreateDto userSignupDto = new UserCreateDto();
        btnBunho=(Button) findViewById(R.id.btnBunho);
        inputcertnum=(EditText)findViewById(R.id.inputcertnum);

        // 인증하기 버튼 누르면 로그인 화면으로 전환
        // **인증번호 확인 절차도 필요함**
        certiButton= (Button) findViewById(R.id.btncertificate);
        certiButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });


        inputBunho = (EditText) findViewById(R.id.inputBunho);
        inputBunho.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String email = inputBunho.getText().toString().trim();
                if(email.matches(phoneValidation) && s.length()>0){
                    btnBunho.setEnabled(true);
                    SignActivity.phone = String.valueOf(inputBunho.getText());
                    System.out.println(SignActivity.phone);
                } else {
                    btnBunho.setEnabled(false);
                }
            }
        });

    }

}