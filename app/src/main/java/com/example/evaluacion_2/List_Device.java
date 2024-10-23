package com.example.evaluacion_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;


public class List_Device extends AppCompatActivity {

    private Button BackBtn, buttonOpen, buttonClose;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_device);

        BackBtn = findViewById(R.id.BackBtn);
        buttonOpen = findViewById(R.id.buttonOpen);
        buttonClose = findViewById(R.id.buttonClose);


        // Funcionalidad Button Open

        buttonOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(List_Device.this, "Abierto", Toast.LENGTH_SHORT).show();
            }
        });

        // Funcionalidad Button Close

        buttonClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(List_Device.this, "Cerrado", Toast.LENGTH_SHORT).show();
            }
        });







        BackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BackBtn = new Intent(List_Device.this, Parent_Device.class);
                    Toast.makeText(List_Device.this, "Emparejar Dispositivos", Toast.LENGTH_SHORT).show();
                finish();
            }
        });


    }
}