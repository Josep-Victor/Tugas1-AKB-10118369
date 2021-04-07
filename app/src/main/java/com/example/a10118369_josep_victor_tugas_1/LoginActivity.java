package com.example.a10118369_josep_victor_tugas_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {
    //07 April 2021 - Josep Victor Rajadoli - IF9
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_login);
    }

    public void registration(View view) {
        Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
        startActivity(intent);
    }

    public void login(View view) {
        Intent intent =  new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);
    }
}