package com.example.sainz.palabra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        //agregar variables
        final Button volver=(Button) findViewById(R.id.btnInicio);
        final Button verifica=(Button) findViewById(R.id.btnConfirmar);
        final TextView ingresa=(TextView) findViewById(R.id.txt1);
        final TextView ingresa2=(TextView) findViewById(R.id.txt2);
        final EditText tomar=(EditText) findViewById(R.id.txtRecibir);
        final EditText tomar2=(EditText) findViewById(R.id.txtRecibir2);


        //Funcion inicio
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inicio=new Intent(Main3Activity.this, MainActivity.class);
                startActivity(inicio);
            }
        });

        //funcion verificar
        verifica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(tomar.getText().toString());
                int num2 = Integer.parseInt(tomar2.getText().toString());
                int suma=0;

                for(int i=1; i<num1;i++){
                    if(num1%i==0){
                        suma = suma + i;
                    }
                }
                if(suma == num2){
                    suma = 0;
                    for (int i=1; i<num2;i++){
                        if(num2%i == 0){
                            suma= suma + i;
                        }
                    }
                    if(suma== num1){
                        Toast.makeText(getApplicationContext(),"El número "+num1+" es amigo del número "+num2, Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(getApplicationContext(),"Los números no son amigos", Toast.LENGTH_LONG).show();
                    }
                }else{
                    Toast.makeText(getApplicationContext(),"Los números no son amigos", Toast.LENGTH_LONG).show();
                }
            }

        });
    }
}
