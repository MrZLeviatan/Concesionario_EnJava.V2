package modelo;

import java.util.ArrayList;

public class Moto extends Vehiculo{


    public Moto(int matricula, String marca, int modelo, int cilindraje, EstadoUso estadoUso, Combustible combustible, int velocidadMax, int cambios, Transmision transmision) {
        super(matricula, marca, modelo, cilindraje, estadoUso, combustible, velocidadMax, cambios, transmision);
    }


}
