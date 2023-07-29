package com.enrike.areacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private static final double PI = 3.14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle extras = getIntent().getExtras();
        float dato1 =extras.getFloat("numero1");
        float dato2 =extras.getFloat("numero2");

        double area = PI*(dato1*dato2);
        TextView resultado = findViewById(R.id.areacirculo);
        resultado.setText("El área de un círculo de radio "+dato1+" es: "+area);
    }
}