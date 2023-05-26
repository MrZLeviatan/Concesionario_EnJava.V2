package modelo;

import java.util.ArrayList;

public class Consesionario {

    //listas necessarias para guardar la información
    private static ArrayList<Administrador> listaAdministradores;
    private static ArrayList<Empleado> listaEmpleado;
    private static ArrayList <Vehiculo> listaVehiculos;

    private ArrayList <Cliente> listaCliente;

    public Consesionario() {
        listaAdministradores = new ArrayList<>();
        listaEmpleado=new ArrayList<>();
        listaVehiculos=new ArrayList<>();
        listaCliente= new ArrayList<>();

    }

    //metodos get para las listas
    public static ArrayList<Administrador> getListaAdministradores() {
        return listaAdministradores;
    }

    public static ArrayList<Empleado> getListaEmpleado() {
        return listaEmpleado;
    }

    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }


    public ArrayList<Cliente> getListaCliente() {
        return listaCliente;
    }

    //metodos para añadir a las listas

    public void añadirCliente(Cliente cliente){
        listaCliente.add(cliente);
    }

    public static void añadirVehiculo(Vehiculo vehiculo){
        listaVehiculos.add(vehiculo);
    }

    public void añadirEmpleado(Empleado empleado){
        listaEmpleado.add(empleado);
    }


    //metodo para agregar un administrador a una lista de administradores
    public  static void añadirAdministrador(Administrador administrador){
        listaAdministradores.add(administrador);
    }

    //verifica que el correo que fue enviado sea de un administrador
    public  boolean verificarAdm(String correo){
        boolean x=false;
        for(int i=0; i<listaAdministradores.size(); i++){
            if (getListaAdministradores().get(i).getCorreo()==correo){
                x=true;
            }
        }
        return x;
    }

    //metodo para sacar un empleado de la lista de empleado
    public static Empleado buscarEmpleado(String correo){
        Empleado empleado= (Empleado) listaEmpleado.stream().filter(Empleado->Empleado.getCorreo()==correo);
        return  empleado;
    }

    //metodo que utiliza el metodo para verificar que sea administrador y compara su contraseña de serlo y
    //de no serlo valida en la lista de empleados
    public boolean validarContraseña(String contraseña,String correo){

        if(verificarAdm(correo)==true){
            Administrador adm= (Administrador) listaAdministradores
                    .stream()
                    .filter(Administrador->Administrador.getClave()==contraseña);
            return adm.getClave().contains(contraseña);
        }
        else{
            Empleado empleado= (Empleado) listaEmpleado
                    .stream()
                    .filter(Empleado->Empleado.getClave()==contraseña);
            return empleado.getClave().equals(contraseña);

        }

    }


    //Metodo para eliminar empleado de la lista
    public void eliminarEmpleado(int cc) {
        for (int i=0;i<listaEmpleado.size();i++){
            if(listaCliente.get(i).getCc()==cc){
                Persona persona= listaCliente.get(i);
                listaCliente.remove(persona);
            }
        }
    }

    //metodo para añadir empleado
    public static void addEmpleado( Empleado empleado) {
       listaEmpleado.add(empleado);
    }





}
