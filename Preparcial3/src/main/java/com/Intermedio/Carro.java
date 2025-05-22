package com.Intermedio;

public class Carro extends Vehiculo {
    private static boolean electrico;
    private static boolean publico;
    public Carro(String placa, int cantidadPeajes, boolean electrico, boolean publico) {
        super(placa, cantidadPeajes);
        this.electrico = electrico;
        this.publico = publico;
    }
    public boolean isElectrico() {
        return electrico;
    }
    public void setElectrico(boolean electrico) {
        this.electrico = electrico;
    }
    public boolean isPublico() {
        return publico;
    }
    public void setPublico(boolean publico) {
        this.publico = publico;
    }
    @Override
    public float calcularPeaje(){
        float peaje = 10000;
        if(electrico){
            peaje -= peaje*0.2;
        }
        if(publico){
            peaje += peaje*0.15;
        }
        return peaje;
    }
    @Override
    public String vehiculoToString() {
        return "Tipo vehiculo: Carro\n" +"Placa: " + placa + "\n" +"Cantidad de peajes: " + cantidadPeajes + "\n" +"Publico: " + (publico ? "Sí" : "No") + "\n" +"Electrico: " + (electrico ? "Sí" : "No");
    }
}
