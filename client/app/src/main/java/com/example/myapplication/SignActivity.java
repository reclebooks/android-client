package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignActivity extends AppCompatActivity {
    private EditText inputBunho;
    private Button btnBunho;
    private String phoneValidation = "^01([0|1|6|7|8|9])-?([0-9]{3,4})-?([0-9]{4})$";

    Button certiButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        certiButton= (Button) findViewById(R.id.btncertificate);
        certiButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });


        inputBunho = findViewById(R.id.inputBunho);
        btnBunho = findViewById(R.id.btnBunho);
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
                } else {
                    btnBunho.setEnabled(false);
                }
            }
        });

    }

}