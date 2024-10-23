package com.example.evaluacion_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;


public class Inicio extends AppCompatActivity {

    private Button closeSesion, BtnConfDevice, BtnProfile, btnViewActionLog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);

        // Catch ID XML to Inicio

        closeSesion = findViewById(R.id.CloseButton);
        BtnConfDevice = findViewById(R.id.BtnConfDevice);
        BtnProfile = findViewById(R.id.BtnProfile);
        btnViewActionLog = findViewById(R.id.btnViewActionLog);

        //Funcionalidad Button Emperejar Dispositivo

        BtnConfDevice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ConfIntent = new Intent(Inicio.this, Parent_Device.class );
                startActivity(ConfIntent);
            }
        });

        //Funcionalidad Actividad Dispositivos

        btnViewActionLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Inicio.this, Time_Activity.class);
                startActivity(intent);
            }
        });

        //Funcionalidad Button Ver Perfil

        BtnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ProfileIntent = new Intent(Inicio.this, Profile.class);
                startActivity(ProfileIntent);
            }
        });

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