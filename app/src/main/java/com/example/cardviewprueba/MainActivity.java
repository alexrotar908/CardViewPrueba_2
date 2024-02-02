package com.example.cardviewprueba;

import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    RecyclerView recycler;
    List<DataClass> Lista;
    MiAdaptador adapter;
    DataClass androidData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = findViewById(R.id.recyclerView);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this, 1);
        recycler.setLayoutManager(gridLayoutManager);
        Lista = new ArrayList<>();

        androidData = new DataClass("Ciorba de burta", R.string.Ciorba_de_burta, "Instrucciones: ", R.drawable.ciorbaburta);
        Lista.add(androidData);
        androidData = new DataClass("Ciorba de Perisoare", R.string.Ciorba_de_perisoare, "Instrucciones:", R.drawable.perisoare);
        Lista.add(androidData);
        androidData = new DataClass("Mici", R.string.mici, "Instrucciones", R.drawable.mici);
        Lista.add(androidData);
        androidData = new DataClass("Sarmale", R.string.sarmale, "Instrucciones", R.drawable.sarmale);
        Lista.add(androidData);
        androidData = new DataClass("Gratar", R.string.gratar, "Instrucciones", R.drawable.snitel);
        Lista.add(androidData);

        adapter = new MiAdaptador(MainActivity.this, Lista);
        recycler.setAdapter(adapter);
    }



}