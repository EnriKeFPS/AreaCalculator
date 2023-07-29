package com.enrike.areacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Bundle extras = getIntent().getExtras();
        float dato1 =extras.getFloat("numero1");
        float dato2 =extras.getFloat("numero2");

        double area = (dato1*dato2)/2;
        TextView resultado = findViewById(R.id.arearombo);
        resultado.setText("El área de un rombo de diagonal mayor "+dato1+" y diagonal menor "+dato2+" es: "+area);
    }
}