package com.example.evaluacion_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

public class Profile extends AppCompatActivity {

    private Button btnDeleteAccount, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        // Catch ID del XML to Profile

        btnDeleteAccount = findViewById(R.id.btnDeleteAccount);
        btnBack = findViewById(R.id.btnBack);

        // Funcionalidades Boton Eliminar Cuenta

        btnDeleteAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent DeleteAccountBtn = new Intent(Profile.this, DeleteAccount.class);
                    Toast.makeText(Profile.this, "Eliminar Cuenta", Toast.LENGTH_SHORT).show();
                startActivity(DeleteAccountBtn);
            }
        });

        // Funcionalidad Boton Volver

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BtnBack = new Intent(Profile.this, Inicio.class);
                    Toast.makeText(Profile.this, "Inicio", Toast.LENGTH_SHORT).show();
                finish();
            }
        });


    }
}