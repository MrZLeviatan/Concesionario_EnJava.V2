package modelo;

import java.util.ArrayList;
import java.util.Objects;

public class Seguridad extends Persona{
    private  String clave, palabraSecreta;
    public Seguridad(String nombre, String correo, int edad, int cc, Genero genero, String clave, String palabraSecreta) throws Exception {
        super(nombre, correo, edad, cc, genero);

        this.clave= Objects.requireNonNull(nombre,"la clave es requerida");
        if(clave.isBlank()){
            throw new RuntimeException("la clave es requerida");
        }
        this.palabraSecreta= Objects.requireNonNull(palabraSecreta,"palabra secreta requerida");
        if(palabraSecreta.isBlank()){
            throw  new RuntimeException("la palabra secreta es requerida");
        }
    }

    public static boolean validarContraseña(String contraseña, Empleado empleado){
        return contraseña.contains(empleado.getClave());
    }


    public static Empleado buscarEmpleado(String correo, ArrayList<Empleado>listaEmpleados){
        Empleado empleado= (Empleado) listaEmpleados.stream().filter(Empleado->Empleado.getCorreo()==correo);
        return  empleado;
    }


    public String getClave() {
        return clave;
    }

    public String getPalabraSecreta() {
        return palabraSecreta;
    }
}


