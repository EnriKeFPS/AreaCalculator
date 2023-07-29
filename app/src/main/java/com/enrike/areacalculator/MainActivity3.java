package com.enrike.areacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Bundle extras = getIntent().getExtras();
        float dato1 =extras.getFloat("numero1");
        float dato2 =extras.getFloat("numero2");

        double area = (dato1*dato2)/2;
        TextView resultado = findViewById(R.id.areatriangulo);
        resultado.setText("El área de un triángulo de base "+dato1+" y altura "+dato2+" es: "+area);
    }
}