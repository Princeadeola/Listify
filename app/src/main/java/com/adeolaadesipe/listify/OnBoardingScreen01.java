package com.adeolaadesipe.listify;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class OnBoardingScreen01 extends AppCompatActivity {
    TextView skipOnBoarding;
    AppCompatButton nextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding_screen01);

        skipOnBoarding = findViewById(R.id.skipOnBoarding01ID);
        skipOnBoarding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OnBoardingScreen01.this, OnBoardingScreen03.class));
                finish();
            }
        });
        nextBtn = findViewById(R.id.onBoarding01Btn);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OnBoardingScreen01.this, OnBoardingScreen02.class));
                finish();
            }
        });
    }
}