package org.example.domain;

import javax.persistence.*;

@                                                                                                                                                                                             Entity
@Table(name = "tenis")
public class Tenis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marca;
    private String modelo;
    private double talla;
    private double precio;

    // Constructor, getters y setters

    public Tenis() {}

    public Tenis(String marca, String modelo, double talla, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.talla = talla;
        this.precio = precio;
    }

    // Getters y setters...

    @Override
    public String toString() {
        return "Tenis{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", talla=" + talla +
                ", precio=" + precio +
                '}';
    }
}