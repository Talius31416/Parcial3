package com.Intermedio;

import java.util.ArrayList;

public class Estacion {
    private int totalPeajesRecolectados = 0;
    private ArrayList<Vehiculo> vehiculos;
    private float totalAcummulado = 0;

    public Estacion() {
        this.vehiculos = new ArrayList<>();
    }

    public String detallesJornada(Recaudador recaudador, ArrayList<Vehiculo> vehiculos) {
        String detalles = "\n";
        for(Vehiculo vehiculo : vehiculos){
            detalles += vehiculo.vehiculoToString() + "\n";
            detalles += "Valor Pagado: " + vehiculo.calcularPeaje() + "\n";
        }
        detalles += "Total acumulado: " + recaudador.calcularTotalPeajes(vehiculos);
        return detalles;
    }

}
