package com.example.evaluacion_2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Time_Activity extends AppCompatActivity {

    private TextView textViewActionLog;
    private Button btnBackTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.time);

        textViewActionLog = findViewById(R.id.textViewActionLog);
        btnBackTime = findViewById(R.id.btnBackTime);

        // Datos de prueba (puedes reemplazarlos por datos reales en el futuro)
        String actionLogs = "2024-10-23 10:30 - Abrir dispositivo\n" +
                "2024-10-23 10:45 - Cerrar dispositivo\n" +
                "2024-10-23 11:00 - Abrir dispositivo";

        textViewActionLog.setText(actionLogs);


        btnBackTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}