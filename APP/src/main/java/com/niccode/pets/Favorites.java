package com.niccode.pets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class Favorites extends AppCompatActivity {

    private String likes;
    private RecyclerView listaMascotas;


    ArrayList<Mascotas> ArraylistMascotas = new ArrayList<Mascotas>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        Toolbar mybar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(mybar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mybar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotasFv);
        LinearLayoutManager vista = new LinearLayoutManager(this);
        vista.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(vista);
        iniciarLista();
        iniciarAdaptador();

    }


    public void iniciarLista() {
        likes = "0";

        ArraylistMascotas.add(new Mascotas(R.drawable.gatito1, "Shasha", likes));
        ArraylistMascotas.add(new Mascotas(R.drawable.gatito2, "Nugget", likes));
        ArraylistMascotas.add(new Mascotas(R.drawable.gatito3, "Michin", likes));
        ArraylistMascotas.add(new Mascotas(R.drawable.gatito4, "Pelusa", likes));
        ArraylistMascotas.add(new Mascotas(R.drawable.gatito5, "Misifu", likes));
        ArraylistMascotas.add(new Mascotas(R.drawable.gatito1, "Shasha", likes));
        ArraylistMascotas.add(new Mascotas(R.drawable.gatito2, "Nugget", likes));
        ArraylistMascotas.add(new Mascotas(R.drawable.gatito3, "Michin", likes));
        ArraylistMascotas.add(new Mascotas(R.drawable.gatito4, "Pelusa", likes));
        ArraylistMascotas.add(new Mascotas(R.drawable.gatito5, "Misifu", likes));

    }

    public void iniciarAdaptador(){
        FavoritesAdapter adaptador = new FavoritesAdapter(ArraylistMascotas);
        listaMascotas.setAdapter(adaptador);

    }

}


