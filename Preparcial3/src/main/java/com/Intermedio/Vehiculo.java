package com.Intermedio;

public abstract class Vehiculo {
    protected String placa;
    protected int cantidadPeajes;

    public Vehiculo(String placa, int cantidadPeajes) {
        this.placa = placa;
        this.cantidadPeajes = cantidadPeajes;
    }
    public String getPlaca() {
        return placa;
    }
    public int getCantidadPeajes() {
        return cantidadPeajes;
    }
    public void setCantidadPeajes(int cantidadPeajes) {
        this.cantidadPeajes = cantidadPeajes;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public abstract float calcularPeaje();
    public abstract String vehiculoToString();
}
