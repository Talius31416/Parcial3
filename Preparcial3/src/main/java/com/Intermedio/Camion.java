package com.Intermedio;

public class Camion extends Vehiculo {
    private static int capacidadCarga;
    private static int ejes;
    public Camion(String placa, int cantidadPeajes, int capacidadCarga, int ejes) {
        super(placa, cantidadPeajes);
        this.capacidadCarga = capacidadCarga;
        this.ejes = ejes;
    }
    public int getCapacidadCarga() {
        return capacidadCarga;
    }
    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
    public int getEjes() {
        return ejes;
    }
    public void setEjes(int ejes) {
        this.ejes = ejes;
    }
    @Override
    public float calcularPeaje() {
        float peaje = 7000*ejes;
        if(capacidadCarga > 10){
            peaje += peaje*0.1;
        }
        return peaje;
    }
    @Override
    public String vehiculoToString() {
        return "Tipo vehiculo: Camion\nPlaca: "+placa+"\nCantidad de peajes: "+cantidadPeajes+"\nCapacidad de carga: "+capacidadCarga+"\nNumero de Ejes: "+ejes;
    }
}
