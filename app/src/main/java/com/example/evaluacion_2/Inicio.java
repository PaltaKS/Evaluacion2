package com.example.evaluacion_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;


public class Inicio extends AppCompatActivity {

    private Button closeSesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);

        // Catch ID XML to Inicio

        closeSesion = findViewById(R.id.CloseButton);

        //Funcionalidad Button Emperejar Dispositivo






        //Funcionalidad Button Control Dispositivo





        //Funcionalidad Button Cerrar

        closeSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Close = new Intent(Inicio.this, LogIn.class);

                    Toast.makeText(Inicio.this, "Sesion Cerrado", Toast.LENGTH_SHORT).show();

                finish();
            }
        });



    }
}