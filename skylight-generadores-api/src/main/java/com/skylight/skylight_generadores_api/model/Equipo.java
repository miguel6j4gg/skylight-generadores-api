package com.skylight.generadores.model;

public class Equipo {

    private String codigo;
    private String nombre;
    private String marca;
    private double potencia;
    private String estado;

    public Equipo() {
    }

    public Equipo(String codigo, String nombre, String marca,
                  double potencia, String estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.potencia = potencia;
        this.estado = estado;
    }

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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}