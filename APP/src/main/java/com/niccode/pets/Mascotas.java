package com.niccode.pets;



public class Mascotas {
    private int foto;
    private String nombre;
    private String likes;

    public Mascotas(int foto, String nombre, String likes) {
        this.foto     = foto;
        this.nombre   = nombre;
        this.likes    = likes;
    }


    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }
}
