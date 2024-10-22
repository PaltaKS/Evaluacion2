package com.example.evaluacion_2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;


public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        Button BtnRegis = findViewById(R.id.registerBtn);
        Button BtnClose = findViewById(R.id.closeBtn);

        BtnRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Register.this, "Registro Con Exito", Toast.LENGTH_SHORT).show();
            }
        });

        BtnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Register.this, "Cerrar Registro", Toast.LENGTH_SHORT).show();
            }
        });


    }
}