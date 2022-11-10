package com.example.a03_ejercicio02correccion.modelos;

import java.io.Serializable;

public class CocheModel implements Serializable {
    private String marca;
    private String modelo;
    private String color;

    public CocheModel(String marca, String modelo, String color){

    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "CocheModel{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
