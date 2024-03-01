package com.example.calculadoraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class masaConvert extends AppCompatActivity {

    EditText num1;

    TextView respuesta;

    Button convertir, regresar;

    Spinner spnOpciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masa_convert);

        convertir = findViewById(R.id.btnConvertir);
        convertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    num1 = findViewById(R.id.etNum1);
                    double num =0;
                    num = Double.parseDouble(num1.getText().toString());

                    double respu = 0;

                    spnOpciones = findViewById(R.id.spnOpciones);
                    switch (spnOpciones.getSelectedItemPosition()){
                        case 0:
                            respu = num * 2.2;
                            break;

                        case 1:
                            respu = num * 28.3495;
                            break;

                        case 2:
                            respu = num * 1000;
                            break;
                    }

                    respuesta = findViewById(R.id.lbRespuesta);
                    respuesta.setText("" + respu);


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