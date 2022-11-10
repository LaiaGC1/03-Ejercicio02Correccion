package com.example.a03_ejercicio02correccion.modelos;

public class BiciModel {
    private String marca;
    private String pulgadas;

    public String getMarca() {
        return marca;
    }

    public String getPulgadas() {
        return pulgadas;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPulgadas(String pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return "BiciModel{" +
                "marca='" + marca + '\'' +
                ", pulgadas='" + pulgadas + '\'' +
                '}';
    }
}
