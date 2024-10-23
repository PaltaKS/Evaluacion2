package com.example.evaluacion_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

public class Parent_Device extends AppCompatActivity {

    private EditText NameDeviceInput, keyInput;
    private Button RegisterDeviceBtn, ExitBtn, ListDeviceBtn;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parent_device);

        //Catch ID XML to parent_device

        NameDeviceInput = findViewById(R.id.NameDeviceInput);
        keyInput = findViewById(R.id.ClaveInput);
        RegisterDeviceBtn = findViewById(R.id.RegisterDeviceBtn);
        ExitBtn = findViewById(R.id.ExitBtn);
        ListDeviceBtn = findViewById(R.id.ListDeviceBtn);

        // Boton de Registrar Dispositivos

        RegisterDeviceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String deviceName = NameDeviceInput.getText().toString().trim();
                String deviceKey = keyInput.getText().toString().trim();

                if (!deviceName.isEmpty() && !deviceKey.isEmpty()) {
                    // Validar que la clave sea alfanumérica
                    if (deviceKey.matches("[a-zA-Z0-9]+")) {
                        registerDevice(deviceName, deviceKey);
                    } else {
                        Toast.makeText(Parent_Device.this, "La clave debe ser alfanumérica", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(Parent_Device.this, "Por favor, complete todos los campos", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Boton de Lista de Dispositivos

        ListDeviceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ListDevice = new Intent(Parent_Device.this, List_Device.class );
                    Toast.makeText(Parent_Device.this, "Lista de Dispostivos", Toast.LENGTH_SHORT).show();
                startActivity(ListDevice);
            }
        });

        // Boton de Regresa al Inicio

        ExitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }

    //

    private void registerDevice(String deviceName, String deviceKey) {


        Toast.makeText(this, "Dispositivo registrado: " + deviceName, Toast.LENGTH_SHORT).show();


    }
}