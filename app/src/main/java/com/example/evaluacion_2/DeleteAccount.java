package com.example.evaluacion_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

import kotlinx.coroutines.internal.OnUndeliveredElementKt;


public class DeleteAccount extends AppCompatActivity {

    private EditText editTextPasswordDelete;
    private Button btnDeleteAccount, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.delete_account);

        editTextPasswordDelete = findViewById(R.id.EditTextPasswordDelete);
        btnDeleteAccount = findViewById(R.id.btnDeleteAccount);
        btnBack = findViewById(R.id.btnBack);


        btnDeleteAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enteredPassword = editTextPasswordDelete.getText().toString();

                if (enteredPassword.isEmpty()) {
                    Toast.makeText(DeleteAccount.this, "Por favor, ingrese la contraseña", Toast.LENGTH_SHORT).show();
                } else {
                    // Aquí agregar la lógica para verificar la contraseña (simulada)
                    if (isPasswordCorrect(enteredPassword)) {
                        deleteUserAccount();
                    } else {
                        Toast.makeText(DeleteAccount.this, "Contraseña incorrecta", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });



    }

    private boolean isPasswordCorrect(String password) {
        // Simular verificación de la contraseña
        // Aquí podrías comparar con la contraseña guardada en tu sistema
        return "adminadmin".equals(password); // Cambia "correct_password" por la contraseña real para la prueba
    }

    private void deleteUserAccount() {
        // Simular la eliminación de la cuenta
        Toast.makeText(DeleteAccount.this, "Cuenta eliminada", Toast.LENGTH_SHORT).show();

        // Simular cierre de sesión
        // Aquí podrías limpiar el estado de la sesión o los datos del usuario
        signOut();

        // Redirigir a la pantalla de inicio de sesión (simulada)
        Intent intent = new Intent(DeleteAccount.this, LogIn.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish(); // Cierra esta actividad
    }

    private void signOut() {
        // Simular cierre de sesión
        Toast.makeText(DeleteAccount.this, "Sesión cerrada (simulada)", Toast.LENGTH_SHORT).show();
    }
}