package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class Main extends Activity implements OnClickListener {

    private Button show_pet_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Obteniendo una instancia del boton show_pet_button
        show_pet_button = (Button)findViewById(R.id.buttonPanel);

        //Registrando la escucha sobre la actividad Main
        show_pet_button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){

        //Iniciando la actividad Visor
        Intent intent = new Intent(this,Visor.class);
        startActivity(intent);

    }

}