package com.example.evaluacion_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;


public class Inicio extends AppCompatActivity {

    private Button closeSesion, BtnConfDevice, BtnControlDevice, BtnProfile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);

        // Catch ID XML to Inicio

        closeSesion = findViewById(R.id.CloseButton);
        BtnConfDevice = findViewById(R.id.BtnConfDevice);
        BtnControlDevice = findViewById(R.id.BtnControlDevices);
        BtnProfile = findViewById(R.id.BtnProfile);

        //Funcionalidad Button Emperejar Dispositivo

        BtnConfDevice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ConfIntent = new Intent(Inicio.this, Config_Device.class );
                startActivity(ConfIntent);
            }
        });

        //Funcionalidad Button Control Dispositivo

        BtnControlDevice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ControlIntent = new Intent(Inicio.this, Control_Device.class);
                startActivity(ControlIntent);
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