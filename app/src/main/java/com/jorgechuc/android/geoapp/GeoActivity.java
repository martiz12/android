package com.jorgechuc.android.geoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class GeoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo);
    }
    mBotonCierto.setOnClickListener(new ()
    {     @Override     public void onClick(View v)
        {
        Toast.makeText(GeoActivity.this, R.string.texto_correcto, Toast.LENGTH_SHORT)
                .show();
        }
    }
    )
    ; mBotonFalso.setOnClickListener(new setOnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            Toast.makeText(GeoActivity.this, R.string.texto_incorrecto, Toast.LENGTH_SHORT)
                    .show();     }
    }
    );

}
