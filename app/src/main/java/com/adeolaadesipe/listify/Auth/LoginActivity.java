package com.adeolaadesipe.listify.Auth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.adeolaadesipe.listify.MainActivity;
import com.adeolaadesipe.listify.R;

public class LoginActivity extends AppCompatActivity {
    TextView registerTxt;
    AppCompatButton loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        registerTxt = findViewById(R.id.createAccountFromLoginTxtIDCA);
        registerTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
                finish();
            }
        });


        loginBtn = findViewById(R.id.LoginBtnIDCA);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, MainActivity.class));
                finish();
            }
        });
    }
}