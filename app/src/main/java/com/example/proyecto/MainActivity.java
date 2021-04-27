package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void activityLogin(View view){
        Intent login = new Intent(this, loggin.class);
        startActivity(login);
    }
    public void activityRegistro(View view){
        Intent registro = new Intent(this, registro.class);
        startActivity(registro);
    }
    public void activityPrincipal(View view){
        Intent principal = new Intent(this, MainActivity.class);
        startActivity(principal);
    }

}