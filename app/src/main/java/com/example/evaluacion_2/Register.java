package com.example.evaluacion_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;


public class Register extends AppCompatActivity {

    private EditText EditTextUserName, EditTextRealName, EditTextEmail, EditTextPassword;
    private Button registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        // Catch ID XML to register
        EditTextUserName = findViewById(R.id.EditTextUserName);
        EditTextRealName = findViewById(R.id.EditTextRealName);
        EditTextPassword = findViewById(R.id.EditTextPassword);
        EditTextEmail = findViewById(R.id.EditTextEmail);
        Button BtnRegis = findViewById(R.id.registerBtn);
        Button BtnClose = findViewById(R.id.closeBtn);

        BtnRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = EditTextUserName.getText().toString();
                String realName = EditTextRealName.getText().toString();
                String password = EditTextPassword.getText().toString();
                String email = EditTextEmail.getText().toString();

                if (validateInput(userName, realName, password, email)){

                    // Ingresamos Datos para Conexion A FireBase

                    registerUser(userName, realName, password, email);
                } else {
                    Toast.makeText(Register.this, "Favor llenar todos los campos", Toast.LENGTH_SHORT).show();
                }

            }
        });

        BtnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Register.this, "Cerrar Registro", Toast.LENGTH_SHORT).show();
                finish();
            }
        });


    }

    private boolean validateInput(String userName, String realName, String password, String email) {
        if (userName.isEmpty()) {
            EditTextUserName.setError("Ingresa tu nombre de usuario");
            return false;
        }
        if (realName.isEmpty()) {
            EditTextRealName.setError("Ingresa tu nombre real");
            return false;
        }
        if (password.isEmpty()){
            EditTextPassword.setError("Ingresa tu constrana");
        }
        if (email.isEmpty()){
            EditTextEmail.setError("Ingresa un correo valido");
            return false;
        }
        return true;
    }

    private void registerUser(String userName, String realName, String password, String email) {
        // Futuro Codigo FireBase
        Toast.makeText(this, "Usuario registrado con Exito", Toast.LENGTH_SHORT).show();
    }

}