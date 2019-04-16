package com.example.proy_chifa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class login extends AppCompatActivity {

    Button bingresar, bregistrar;
    TextView idreestalecer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        bingresar = (Button) findViewById(R.id.bingresar);
        bregistrar = (Button) findViewById(R.id.bregistrar);
        idreestalecer = (TextView) findViewById(R.id.idreestablecer);

        idreestalecer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login.this, restablecer_contrasena.class);
                startActivity(intent);
            }
        });
        bingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login.this, MainActivity.class);
                startActivity(intent);
            }
        });
        bregistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login.this, registro.class);
                startActivity(intent);
            }
        });

    }
}
