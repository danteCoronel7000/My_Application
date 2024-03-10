package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void crearCuenta(View v){
        //Toast.makeText(this, "Se preciono en boton Crear cuenta", Toast.LENGTH_SHORT).show();//muestra un evento
        Intent intento=new Intent(this,MainActivity2.class);
        startActivity(intento);

    }
    public void acceder(View v){
        //Toast.makeText(this, "Se preciono en boton Crear cuenta", Toast.LENGTH_SHORT).show();//muestra un evento
        Intent intento=new Intent(this,MainActivity3.class);
        startActivity(intento);

    }
}