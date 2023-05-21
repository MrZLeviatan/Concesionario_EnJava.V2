package modelo;

import java.util.ArrayList;

public class Empleado extends Seguridad{

    private Estado estado;
    private Nivel nivel;

    public Empleado(String nombre, String correo, int edad, int cc, Genero genero, String clave, String palabraSecreta,Estado estado, Nivel nivel) throws Exception {
        super(nombre, correo, edad, cc, genero, clave, palabraSecreta);
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
