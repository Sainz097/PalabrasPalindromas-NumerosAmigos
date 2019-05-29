package com.example.sainz.palabra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.StringReader;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final EditText intPalabra=(EditText) findViewById(R.id.txtPalabra);
        final TextView v1=(TextView) findViewById(R.id.txtV1);
        final Button comprobar=(Button) findViewById(R.id.btnVerificar);
        final Button anterior=(Button) findViewById(R.id.btnRegresar);
        final TextView v2=(TextView) findViewById(R.id.txtResultadoPalidroma);
        final TextView v3=(TextView) findViewById(R.id.txtResultadoReves);
        final TextView v4=(TextView) findViewById(R.id.txtResultadoLongitud);
        final TextView v5=(TextView) findViewById(R.id.txtResultadoCoincide);


        comprobar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String palabra= intPalabra.getText().toString();
                String palabra2="";
                int cantidad=palabra.length()-1;
                //Verificacion de palindroma
                for(int i=cantidad;i>=0;i--){
                    palabra2+= String.valueOf(palabra.charAt(i));
                }
                if(palabra.equals(palabra2)){
                    v2.setText("La palabra es palindroma");
                }else{
                    v2.setText("No es palindroma");
                }
                //palabra invertida
                v3.setText("" + palabra2);
                //Cantidad de letras
                cantidad=cantidad+1;
                v4.setText("" + cantidad );
                //Cantidad de leras repetidas
                /*char []array;
                char caracter;
                int contador=0;
                array=palabra.toCharArray();
                for(int i=0;i<=array.length;i++){
                    caracter=array[i];
                    for(int j=0;j<=array.length;j++){
                        if(array[j]==caracter){
                            contador++;
                            v5.setText(caracter + contador);
                        }
                    }
                }*/

            }
        });
        anterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inicio=new Intent(Main2Activity.this, MainActivity.class);
                startActivity(inicio);
            }
        });
    }
}
