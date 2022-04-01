package com.example.mascotas;

public class Mascota {
    private int foto;
    private String nombre;
    private String madre;
    private String telefono;

    public Mascota(int foto, String nombre, String madre, String telefono) {
        this.foto = foto;
        this.nombre = nombre;
        this.madre = madre;
        this.telefono = telefono;
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

    public String getMadre() {
        return madre;
    }

    public void setMadre(String madre) {
        this.madre = madre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
