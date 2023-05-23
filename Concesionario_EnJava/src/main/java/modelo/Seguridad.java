package modelo;

import java.util.ArrayList;
import java.util.List;
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

    //metodo que utiliza el metodo para verificar que sea administrador y compara su contraseña de serlo y
    //de no serlo valida en la lista de empleados
    public static boolean validarContraseña(String contraseña, String correo,List<Empleado> empleadoList, List<Administrador> administradorList){

        if(Consesionario.verificarAdm(correo,administradorList)==true){
            Administrador adm= (Administrador) administradorList.stream().filter(Administrador->Administrador.getCorreo()==correo);
            return adm.getClave().contains(contraseña);

        }
        else{
            Empleado empleado= (Empleado) empleadoList.stream().filter(Empleado->Empleado.getCorreo()==correo);
            return empleado.getClave().contains(contraseña);
        }

    }

    //metodo para verificar la palabra secreta
    public static boolean validarPalabraSecreta(String palabraSecreta ,String correo,List<Empleado> empleadoList, List<Administrador> administradorList){
        boolean x=false;
        if(Consesionario.verificarAdm(correo,administradorList)==true){
            Administrador adm= (Administrador) administradorList.stream().filter(Administrador->Administrador.getCorreo()==correo);
            return adm.getPalabraSecreta().contains(palabraSecreta);
        }
        return x;
    }


    //metodo para sacar un empleado de la lista de empleado
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


