package com.example.camilolozano.tallerinterneti023111.Models;

/**
 * Created by camilolozano on 17/04/18.
 */

public class Users {

    private String codigo;
    private String nombre;
    private String edad;
    private String correo;
    private String pass;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Codigo:" + codigo + "Nombre:" + nombre + "edad:" +  edad + "correo" + correo ;
    }
}