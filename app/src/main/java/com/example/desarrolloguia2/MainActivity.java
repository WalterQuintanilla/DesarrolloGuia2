package com.example.desarrolloguia2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnLongClickListener {
    //Declaraion de variables de cada tipo de oontrol utilizado
    private EditText correo, contraseña;
    private Button inicioSesion;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inicializacion de las variables creadas anteriormente
        this.correo=findViewById(R.id.edtCorreo);
        this.contraseña=findViewById(R.id.edtContraseña);
        this.inicioSesion=findViewById(R.id.btnInicioSesion);

        inicioSesion.setOnLongClickListener(this);

    }

    @Override
    public boolean onLongClick(View view) {
        if (correo.getText().toString().isEmpty()) {
            Toast.makeText(this, "Debe Ingresar Datos", Toast.LENGTH_LONG).show();
        }
        if (contraseña.getText().toString().isEmpty()) {
            Toast.makeText(this, "Debe Ingresar Contraseña", Toast.LENGTH_LONG).show();
        } else
            Toast.makeText(this,"Datos Registrados",Toast.LENGTH_LONG).show();

            return false;
    }
}
