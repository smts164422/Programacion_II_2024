package com.example.calculadoraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class volumenConvert extends AppCompatActivity {

    EditText num1;

    Button convertir, regresar;

    TextView respuesta;

    Spinner spnOpciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volumen_convert);

        convertir = findViewById(R.id.btnConvertir);
        convertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    num1 = findViewById(R.id.etNum1);
                    double num = 0;

                    double respu = 0;
                    spnOpciones = findViewById(R.id.spnOpciones);
                    switch (spnOpciones.getSelectedItemPosition()){
                        case 0:
                            if (!num1.getText().toString().isEmpty()){
                                num = Double.parseDouble(num1.getText().toString());
                                respu = num * 3.78541;
                                respuesta = findViewById(R.id.lbRespuesta);
                                respuesta.setText(num + " galones equivale a " + respu + " litros");
                            }else {
                                respuesta = findViewById(R.id.lbRespuesta);
                                respuesta.setText("Error, digite una cantidad");

                            }                            break;
                        case 1:
                            if (!num1.getText().toString().isEmpty()){
                                num = Double.parseDouble(num1.getText().toString());
                                respu = num * 1000;
                                respuesta = findViewById(R.id.lbRespuesta);
                                respuesta.setText(num + " litros equivale a " + respu + " centimetros cubicos");
                            }else {
                                respuesta = findViewById(R.id.lbRespuesta);
                                respuesta.setText("Error, digite una cantidad");

                            }
                            break;

                        case 2:
                            if (!num1.getText().toString().isEmpty()){
                                num = Double.parseDouble(num1.getText().toString());
                                respu = num * 16.3871;
                                respuesta = findViewById(R.id.lbRespuesta);
                                respuesta.setText(num + " pulgadas cubicas equivalen a " + respu + " centimetros cubicos");
                            }else {
                                respuesta = findViewById(R.id.lbRespuesta);
                                respuesta.setText("Error, digite una cantidad");

                            }
                            break;

                    }

                }catch (Exception e){
                    Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
                    e.printStackTrace();
                }
            }
        });
    }
}