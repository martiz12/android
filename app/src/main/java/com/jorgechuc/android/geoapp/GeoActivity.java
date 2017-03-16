package com.jorgechuc.android.geoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.jorgechuc.android.pregunta;


public class GeoActivity extends AppCompatActivity {
    Button mBotonCierto;
    Button mBotonFalso;
    Button mBotonsiguiente;
    TextView mTextoPregunta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo);
        mBotonCierto = (Button) findViewById(R.id.boton_cierto);
        mBotonFalso = (Button) findViewById(R.id.boton_falso);


        mBotonCierto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(GeoActivity.this, R.string.texto_correcto, Toast.LENGTH_SHORT)
                        .show();
            }

        });
        mBotonFalso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(GeoActivity.this, R.string.texto_incorrecto, Toast.LENGTH_SHORT)
                        .show();
            }
        });


    }
    private pregunta mBancoDepregunta[]= {
            new pregunta(R.string.texto_pregunta_1, false),
            new pregunta(R.string.texto_pregunta_2, true),
            new pregunta(R.string.texto_pregunta_3, true),
            new pregunta(R.string.texto_pregunta_4, true),
            new pregunta(R.string.texto_pregunta_5, false),
    };
    private int  mpreguntaActual=0;


    }
}




