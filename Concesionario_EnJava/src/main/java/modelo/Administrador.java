

package modelo;

import java.util.ArrayList;

public class Administrador extends Seguridad
{
    private Nivel nivel;
    
    public void setNivel(final Nivel nivel) {
        this.nivel = nivel;
    }

    public Administrador(String nombre, String correo, int edad, int cc, Genero genero, String clave, String palabraSecreta) throws Exception {
        super(nombre, correo, edad, cc, genero, clave, palabraSecreta);
        this.nivel= Nivel.SUPERIOR;
    }
    
    public static ArrayList<Empleado> addEmpleado(final Empleado empleado, final ArrayList<Empleado> listaEmpleados) {
        listaEmpleados.add(empleado);
        return listaEmpleados;
    }
    
    public static void eliminarEmpleado(final Empleado empleado, final ArrayList<Empleado> listaEmpleados) {
        for (int i = 0; i < listaEmpleados.size(); ++i) {
            if (listaEmpleados.get(i).getCc() == empleado.getCc()) {
                listaEmpleados.remove(i);
            }
        }
    }
    
    public Nivel getNivel() {
        return this.nivel;
    }

}
