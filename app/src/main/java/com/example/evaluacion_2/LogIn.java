package com.example.evaluacion_2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;


public class LogIn extends AppCompatActivity {

    //Declaracion de Variables
    private EditText IdUser;
    private EditText IdPass;
    private Button SessionInButton;
    private Button RegisterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in);

        IdUser = findViewById(R.id.EditTextUserName);
        IdPass = findViewById(R.id.EditTextPassword);
        Button IdBtnIn = findViewById(R.id.SessionInButton);
        Button IdBtnRegis = findViewById(R.id.RegisterButton);

        //Configurar Listener para el Boton

        IdBtnIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = IdUser.getText().toString();
                String userpass = IdPass.getText().toString();


                //Mostrar Valorares Alerta

                //Toast.makeText(logInActivity.this, "Usuario: " + username, Toast.LENGTH_LONG).show();

                // Validar si el User es admin
                // Validar si la Pass es adminadmin
                // Si los valores Coinsiden redirigir al Home o Pagina Pricipal
                // Si los valores no coinsiden mostrar Alert si los valores no coinciden

                if(username.equals("admin") && userpass.equals("adminadmin")){
                    // Alert Log In
                    Toast.makeText(LogIn.this, "Log In" , Toast.LENGTH_LONG).show();

                    Intent logIn = new Intent(LogIn.this, Inicio.class);
                    startActivity(logIn);
                }
                else{
                    //
                    Toast.makeText(LogIn.this, "Usuario o Contrasena Incorrecto" , Toast.LENGTH_LONG).show();
                }

            }
        });

        // Implementacion Button Register User

        IdBtnRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent InRegister = new Intent(LogIn.this, Register.class);

                    Toast.makeText(LogIn.this, "Registrar", Toast.LENGTH_SHORT).show();

                startActivity(InRegister);
            }
        });


    }
}