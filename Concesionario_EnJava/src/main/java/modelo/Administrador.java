

package modelo;

import java.util.ArrayList;
import modelo.Empleado;
import modelo.Genero;
import modelo.Nivel;
import modelo.Persona;

public class Administrador extends Persona
{
    private Nivel nivel;
    
    public void setNivel(final Nivel nivel) {
        this.nivel = nivel;
    }
    
    public Administrador(final String nombre, final String correo, final int edad, final int cc, final Genero genero) throws Exception {
        super(nombre, correo, edad, cc, genero);
        this.nivel = Nivel.SUPERIOR;
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
