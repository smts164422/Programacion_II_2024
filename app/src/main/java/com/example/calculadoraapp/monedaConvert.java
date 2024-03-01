package com.example.calculadoraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class monedaConvert extends AppCompatActivity {

    EditText num1;

    Button convertir, regresar;

    TextView respuesta;

    Spinner spnOpciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moneda_convert);

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
                                respu = num * 1.08;
                                respuesta = findViewById(R.id.lbRespuesta);
                                respuesta.setText("" + respu + " dolares estadounidenses");
                            }else {
                                respuesta = findViewById(R.id.lbRespuesta);
                                respuesta.setText("Error, digite una cantidad");

                            }                            break;
                        case 1:
                            if (!num1.getText().toString().isEmpty()){
                                num = Double.parseDouble(num1.getText().toString());
                                respu = num * 17.05;
                                respuesta = findViewById(R.id.lbRespuesta);
                                respuesta.setText("" + respu + " pesos mexicanos");
                            }else {
                                respuesta = findViewById(R.id.lbRespuesta);
                                respuesta.setText("Error, digite una cantidad");

                            }
                            break;

                        case 2:
                            if (!num1.getText().toString().isEmpty()){
                                num = Double.parseDouble(num1.getText().toString());
                                respu = num * 17.05;
                                respuesta = findViewById(R.id.lbRespuesta);
                                respuesta.setText("" + respu + " quetzales");
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

        regresar = findViewById(R.id.btnRegresar);
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}