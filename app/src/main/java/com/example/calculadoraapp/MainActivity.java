package com.example.calculadoraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button moneda, masa, volumen, longitud, almacenamiento, tiempo, transfDatos;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {

            moneda = findViewById(R.id.btnMoneda);
            moneda.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent irMoneda = new Intent(MainActivity.this, monedaConvert.class);
                    startActivity(irMoneda);
                }
            });

            masa = findViewById(R.id.btnMasa);
            masa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent irMasa = new Intent(MainActivity.this, masaConvert.class);
                    startActivity(irMasa);
                }
            });

            volumen = findViewById(R.id.btnVolumen);
            volumen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent irVolumen = new Intent(MainActivity.this, volumenConvert.class);
                    startActivity(irVolumen);
                }
            });

            longitud = findViewById(R.id.btnLongitud);
            longitud.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent irLongitud = new Intent(MainActivity.this, longitudConvert.class);
                    startActivity(irLongitud);
                }
            });

        }catch (Exception e){
            Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }




    }
}