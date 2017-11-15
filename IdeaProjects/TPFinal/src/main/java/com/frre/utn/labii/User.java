package com.frre.utn.labii;

public class User {

    private Email email;
    private int id;
    private String nombre;

    public User(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void enviarMail(Email mail, String destino){

    }

    public void listarMail(){

    }

    public void buscarMail(){

    }



}
