package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void volverPrincipal(View v){
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }
    public void irADrawerMenu(View v){
        Intent i=new Intent(this, MainActivity5.class);
        startActivity(i);
    }
}