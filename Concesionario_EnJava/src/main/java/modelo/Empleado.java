package modelo;

import java.util.ArrayList;

public class Empleado extends Persona{

    private Estado estado;
    private Nivel nivel;

    public Empleado(String nombre, String correo, int edad, int cc, Genero genero,Estado estado, Nivel nivel) throws Exception {
        super(nombre, correo, edad, cc, genero);
        this.estado=estado;
        this.nivel=Nivel.INFERIOR;
    }

    public static Estado getEstado(Estado estado) {
        return estado;
    }

    public Nivel getNivel() {
        return nivel;
    }


}
