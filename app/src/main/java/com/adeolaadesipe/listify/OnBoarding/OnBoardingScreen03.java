package com.adeolaadesipe.listify.OnBoarding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.adeolaadesipe.listify.R;
import com.adeolaadesipe.listify.Auth.RegisterActivity;

public class OnBoardingScreen03 extends AppCompatActivity {
    AppCompatButton nextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding_screen03);

        nextBtn = findViewById(R.id.onBoarding03Btn);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OnBoardingScreen03.this, RegisterActivity.class));
                finish();
            }
        });
    }
}