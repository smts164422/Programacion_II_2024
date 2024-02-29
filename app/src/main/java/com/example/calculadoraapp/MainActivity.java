package com.example.calculadoraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tempVal, tempVal2;

    Button btn;

    RadioGroup opt;

    Spinner spn, spn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btCalcular);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {

                    tempVal = findViewById(R.id.etNum1);
                    double num1 = 0;
                    num1 = Double.parseDouble(tempVal.getText().toString());

                    tempVal = findViewById(R.id.etNUm2);
                    double num2 = 0;

                    double respuesta = 0;

                    spn = findViewById(R.id.spnOpciones);
                    switch (spn.getSelectedItemPosition()){
                        case 0:
                            num2 = Double.parseDouble(tempVal.getText().toString());
                            respuesta = num1+num2;
                            break;
                        case 1:
                            num2 = Double.parseDouble(tempVal.getText().toString());
                            respuesta = num1-num2;
                            break;
                        case 2:
                            num2 = Double.parseDouble(tempVal.getText().toString());
                            respuesta = num1*num2;
                            break;
                        case 3:
                            num2 = Double.parseDouble(tempVal.getText().toString());
                            respuesta = num1/num2;
                            break;
                        case 4:
                            num2 = Double.parseDouble(tempVal.getText().toString());
                            respuesta = (num1/100)*num2;
                            break;
                        case 5:
                            tempVal = findViewById(R.id.etNum1);
                            double base = Double.parseDouble(tempVal.getText().toString());
                            tempVal = findViewById(R.id.etNUm2);
                            double exponent = Double.parseDouble(tempVal.getText().toString());
                            double result = Math.pow(base,exponent);

                            respuesta = result;
                            break;
                        case 6:
                            double raizaCuadrada;
                            raizaCuadrada = Math.sqrt(num1);
                            respuesta =raizaCuadrada;


                            break;

                        case 7:

                            long factorial =1;
                            for (int i = 1; i <= num1; i++) {
                                factorial *=i;
                            }
                            respuesta = factorial;
                            break;

                    }

                    tempVal = findViewById(R.id.txRespuesta);
                    tempVal.setText("Respuesta: " + respuesta);



                }catch (Exception e){
                    tempVal.setText(e.getMessage());
                }










            }


        });
    }
}