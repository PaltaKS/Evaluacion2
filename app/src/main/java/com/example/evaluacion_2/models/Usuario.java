package com.example.evaluacion_2.models;

public class Usuario {
    private String nombreReal;
    private String userName;
    private String password;
    private String email;

    // constructor vacio requerido por firebase

    public Usuario(){}

    //constructor con parametros

    public Usuario(String nombreReal, String userName,  String password, String email){
        this.nombreReal = nombreReal;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    //Getters y Setters
    public String getNombreReal(){
        return nombreReal;
    }

    public void setNombreReal(String nombreReal){
        this.nombreReal = nombreReal;
    }

    public String getUserName(){
        return userName;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }
}
