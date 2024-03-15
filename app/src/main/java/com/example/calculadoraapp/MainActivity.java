package com.example.calculadoraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    TextView tempVal, resultado;

    String id="", accion="nuevo";

    Button btn;

    FloatingActionButton btnRegresar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btnGuardar);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tempVal = findViewById(R.id.txtNombre);
                String nombre = tempVal.getText().toString();

                tempVal = findViewById(R.id.txtDireccion);
                String direccion = tempVal.getText().toString();

                tempVal = findViewById(R.id.txtTelefono);
                String telefono = tempVal.getText().toString();

                tempVal = findViewById(R.id.txtEmail);
                String email = tempVal.getText().toString();

                tempVal = findViewById(R.id.txtDui);
                String dui = tempVal.getText().toString();

                String [] datos = new String[]{id,nombre,direccion,telefono,email,dui};
                DB db = new DB(getApplicationContext(), "", null, 1);
                String respuesta = db.administrar_amigo(accion, datos);
                if (respuesta.equals("ok")){
                    resultado.setText("Amigo guardado con exito");
                    Toast.makeText(getApplicationContext(), "Amigo registrado con exito", Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(getApplicationContext(), "Error al intentar registrar amigo", Toast.LENGTH_LONG);
                }
            }
        });


    }
}