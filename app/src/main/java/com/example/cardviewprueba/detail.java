package com.example.cardviewprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.ImageView;
import android.widget.TextView;



public class detail extends AppCompatActivity {

    TextView Desc, Nombre;
    ImageView Imagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Desc=findViewById(R.id.Descripcion);
        Nombre=findViewById(R.id.Nombre);
        Imagen=findViewById(R.id.Imagen);

        Bundle bundle= getIntent().getExtras();

        if(bundle!=null){
            Desc.setText(bundle.getInt("Desc"));
            Imagen.setImageResource(bundle.getInt("Imagen"));
            Nombre.setText(bundle.getString("Nombre"));
        }
    }
}