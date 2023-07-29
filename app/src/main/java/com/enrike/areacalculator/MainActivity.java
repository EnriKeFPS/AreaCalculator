package com.enrike.areacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button circulo, triangulo, rombo, cuadrado;
    EditText espacio1, espacio2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Datos();

        circulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String plaint1, plaint2;
                float numero1, numero2;

                plaint1 = espacio1.getText().toString();
                plaint2 = espacio2.getText().toString();


                if (plaint1.length()==0 || plaint2.length()==0){

                    Toast.makeText(getApplicationContext(),"Ingrese todos los valores", Toast.LENGTH_SHORT).show();
                }else{

                    numero1 = Float.parseFloat(plaint1);
                    numero2 = Float.parseFloat(plaint2);

                    if (numero1 != numero2){
                        Toast.makeText(getApplicationContext(),"Los valores deben ser los mismos", Toast.LENGTH_LONG).show();
                    } else if (numero1==0 || numero2==0) {
                        Toast.makeText(getApplicationContext(),"El radio NO puede ser cero", Toast.LENGTH_LONG).show();
                    }else{
                        Intent ventana2 = new Intent(getApplicationContext(), MainActivity2.class);
                        ventana2.putExtra("numero1",numero1);
                        ventana2.putExtra("numero2",numero2);
                        startActivity(ventana2);
                    }
                }

            }
        });

        triangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String plaint1, plaint2;
                float numero1, numero2;

                plaint1 = espacio1.getText().toString();
                plaint2 = espacio2.getText().toString();


                if (plaint1.length()==0 || plaint2.length()==0){

                    Toast.makeText(getApplicationContext(),"Ingrese todos los valores", Toast.LENGTH_SHORT).show();
                }else{

                    numero1 = Float.parseFloat(plaint1);
                    numero2 = Float.parseFloat(plaint2);

                    if (numero1==0 || numero2==0) {
                        Toast.makeText(getApplicationContext(),"La base o la altura NO pueden ser cero", Toast.LENGTH_LONG).show();
                    }else{
                        Intent ventana3 = new Intent(getApplicationContext(), MainActivity3.class);
                        ventana3.putExtra("numero1",numero1);
                        ventana3.putExtra("numero2",numero2);
                        startActivity(ventana3);
                    }
                }

            }
        });

        rombo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String plaint1, plaint2;
                float numero1, numero2;

                plaint1 = espacio1.getText().toString();
                plaint2 = espacio2.getText().toString();


                if (plaint1.length()==0 || plaint2.length()==0){

                    Toast.makeText(getApplicationContext(),"Ingrese todos los valores", Toast.LENGTH_SHORT).show();
                }else{

                    numero1 = Float.parseFloat(plaint1);
                    numero2 = Float.parseFloat(plaint2);

                    if (numero1==0 || numero2==0) {
                        Toast.makeText(getApplicationContext(),"Las diagonales NO pueden ser cero", Toast.LENGTH_LONG).show();
                    }else{
                        Intent ventana4 = new Intent(getApplicationContext(), MainActivity4.class);
                        ventana4.putExtra("numero1",numero1);
                        ventana4.putExtra("numero2",numero2);
                        startActivity(ventana4);
                    }
                }

            }
        });

        cuadrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String plaint1, plaint2;
                float numero1, numero2;

                plaint1 = espacio1.getText().toString();
                plaint2 = espacio2.getText().toString();


                if (plaint1.length()==0 || plaint2.length()==0){

                    Toast.makeText(getApplicationContext(),"Ingrese todos los valores", Toast.LENGTH_SHORT).show();
                }else{

                    numero1 = Float.parseFloat(plaint1);
                    numero2 = Float.parseFloat(plaint2);

                    if (numero1 != numero2){
                        Toast.makeText(getApplicationContext(),"Los valores deben ser los mismos", Toast.LENGTH_LONG).show();
                    } else if (numero1==0 || numero2==0) {
                        Toast.makeText(getApplicationContext(),"El Lado NO puede ser cero", Toast.LENGTH_LONG).show();
                    }else{
                        Intent ventana5 = new Intent(getApplicationContext(), MainActivity5.class);
                        ventana5.putExtra("numero1",numero1);
                        ventana5.putExtra("numero2",numero2);
                        startActivity(ventana5);
                    }
                }

            }
        });
    }

    private void Datos(){
        circulo = findViewById(R.id.circulo);
        triangulo = findViewById(R.id.triangulo);
        rombo = findViewById(R.id.rombo);
        cuadrado = findViewById(R.id.cuadrado);
        espacio1 = findViewById(R.id.dato1);
        espacio2 = findViewById(R.id.dato2);

    }

}