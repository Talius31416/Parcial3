package com.Intermedio;

import java.time.LocalDate;
import java.util.ArrayList;

public class Conductor extends Persona {
    private ArrayList<Vehiculo> vehiculosAsignados;

    public Conductor(String nombre, String apellido, String cc,LocalDate fechaNacimiento) {
        super(nombre, apellido, cc, fechaNacimiento);
        this.vehiculosAsignados = new ArrayList<>();
    }

    public ArrayList<Vehiculo> getVehiculosAsignados() {
        return vehiculosAsignados;
    }
    public void setVehiculos(Vehiculo vehiculo) {
        this.vehiculosAsignados.add(vehiculo);
    }
}
