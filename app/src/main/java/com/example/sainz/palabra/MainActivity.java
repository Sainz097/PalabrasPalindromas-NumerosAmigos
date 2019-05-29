package com.example.sainz.palabra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button palabras= (Button) findViewById(R.id.btnPalabra);
        final Button amigos= (Button) findViewById(R.id.btnAmigos);

        palabras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent palabra=new Intent(MainActivity.this, Main2Activity.class);
                startActivity(palabra);
            }
        });

        amigos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numero=new Intent(MainActivity.this, Main3Activity.class);
                startActivity(numero);
            }
        });

    }
}
