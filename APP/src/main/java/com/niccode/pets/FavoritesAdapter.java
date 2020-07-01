package com.niccode.pets;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FavoritesAdapter extends RecyclerView.Adapter<FavoritesAdapter.FavoritesViewHolder> {
    ArrayList<Mascotas> Mascotas;
    public FavoritesAdapter (ArrayList<Mascotas> Mascotas){
        this.Mascotas = Mascotas;
    }

    @NonNull
    @Override
    public FavoritesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_layout, parent, false);
        return new FavoritesAdapter.FavoritesViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull FavoritesViewHolder holder, int position) {
        final Mascotas mascotas = Mascotas.get(position);
        holder.imgFoto.setImageResource(mascotas.getFoto());
        holder.tvNombre.setText(mascotas.getNombre());
        holder.tvLikes.setText(mascotas.getLikes());
    }

    @Override
    public int getItemCount() {
        return Mascotas.size();
    }

    public static class FavoritesViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgFoto;
        private TextView tvNombre;
        private TextView     tvLikes;
        private ImageButton btnLikes;

        public FavoritesViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFoto   = (ImageView)     itemView.findViewById(R.id.imgGatito);
            tvNombre  = (TextView)      itemView.findViewById(R.id.nombre);
            tvLikes   = (TextView)      itemView.findViewById(R.id.likes);
            btnLikes  = (ImageButton)   itemView.findViewById(R.id.btnLikes);
        }
    }
}
