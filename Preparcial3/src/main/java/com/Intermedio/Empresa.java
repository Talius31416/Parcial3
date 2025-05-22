package com.Intermedio;

import java.util.ArrayList;
import java.util.Optional;

public class Empresa {
    private ArrayList<Vehiculo> listaVehiculos;
    private static ArrayList<Conductor> listaConductores;
    public Empresa() {
        listaVehiculos = new ArrayList<>();
        listaConductores = new ArrayList<>();
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return listaVehiculos;
    }
    public String asignarConductor(Conductor conductor, Vehiculo vehiculoAsignar){
        String mensaje = "";
        boolean asignado = existeVehiculo(vehiculoAsignar.getPlaca());
            if(asignado == false){
                conductor.getVehiculosAsignados().add(vehiculoAsignar);
                mensaje = "vehiculo asignado exitosamente";
            }else{
                mensaje = "el vehiculo ya está asignado a un conductor";
            }
        return mensaje;
    }

    private static boolean existeVehiculo(String placa) {
        for(Conductor conductores : listaConductores){
            for(Vehiculo vehiculo : conductores.getVehiculosAsignados()){
                if(vehiculo.getPlaca().equals(placa)){
                    return true;
                }
            }
        }
        return false;
    }

}
