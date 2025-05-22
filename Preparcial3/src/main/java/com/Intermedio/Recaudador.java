package com.Intermedio;

import java.time.LocalDate;
import java.util.ArrayList;

public class Recaudador extends Persona implements CobroTotal {
    private float sueldo;
    public Recaudador(String nombre, String apellido, String cc, LocalDate fechaNacimiento, float sueldo) {
        super(nombre, apellido, cc, fechaNacimiento);
        this.sueldo = sueldo;
    }
    public float getSueldo() {
        return sueldo;
    }
    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    @Override
    public float calcularTotalPeajes(ArrayList<Vehiculo> vehiculos) {
        float costoTotal = 0;
        for (Vehiculo vehiculo : vehiculos) {
            costoTotal += vehiculo.calcularPeaje();
        }
        return costoTotal;
    }

}
