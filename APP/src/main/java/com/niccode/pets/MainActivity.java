package com.niccode.pets;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.zip.Inflater;

@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
public class MainActivity extends AppCompatActivity {

    private String likes;
    private RecyclerView listaMascotas;


    ArrayList<Mascotas> ArraylistMascotas = new ArrayList<Mascotas>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar mybar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(mybar);


        listaMascotas = (RecyclerView) findViewById(R.id.recly);
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

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_favorite:
                Intent i = new Intent(MainActivity.this, Favorites.class);
                startActivity(i);
                return true;

             default:
                return super.onOptionsItemSelected(item);


        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.file, menu);
        return true;
    }

    public void iniciarAdaptador(){
        Mascotas_Adaptador adaptador = new Mascotas_Adaptador(ArraylistMascotas);
        listaMascotas.setAdapter(adaptador);

    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }
}