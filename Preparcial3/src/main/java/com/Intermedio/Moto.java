package com.Intermedio;

public class Moto extends Vehiculo {
    private int cilindraje;
    public Moto(String placa, int cantidadPeajes, int cilindraje) {
        super(placa, cantidadPeajes);
        this.cilindraje = cilindraje;
    }
    public int getCilindraje() {
        return cilindraje;
    }
    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
    @Override
    public float calcularPeaje(){
        float peaje = 5000f;
        if(cilindraje > 200){
            peaje += 2000;
        }
        return peaje;
    }
    @Override
    public String vehiculoToString() {
        return "Tipo vehiculo: Moto\nPlaca: "+placa+"\nCantidad de peajes: "+cantidadPeajes+"\nCilindraje: "+cilindraje;
    }
}
