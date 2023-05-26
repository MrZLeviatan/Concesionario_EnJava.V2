package modelo;

import java.util.ArrayList;

public class Consesionario {

    //listas necessarias para guardar la información
    private  ArrayList<Administrador> listaAdministradores;
    private  ArrayList<Empleado> listaEmpleado;
    private  ArrayList <Vehiculo> listaVehiculos;

    private ArrayList <Cliente> listaCliente;

    //constructor del concesionario

    public Consesionario() {
        listaAdministradores = new ArrayList<>();
        listaEmpleado=new ArrayList<>();
        listaVehiculos=new ArrayList<>();
        listaCliente= new ArrayList<>();

    }

    //metodos get para las listas
    public  ArrayList<Administrador> getListaAdministradores() {
        return listaAdministradores;
    }

    public  ArrayList<Empleado> getListaEmpleado() {
        return listaEmpleado;
    }

    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }


    public ArrayList<Cliente> getListaCliente() {
        return listaCliente;
    }

    //metodos para añadir objetos a las listas
    public void addCliente(Cliente cliente){
        listaCliente.add(cliente);
    }

    public  void addVehiculo(Vehiculo vehiculo){
        listaVehiculos.add(vehiculo);
    }

    public void addEmpleado(Empleado empleado){
        listaEmpleado.add(empleado);
    }

    public void addAministrador(Administrador administrador){
        listaAdministradores.add(administrador);
    }

    //verifica que el correo que fue enviado sea de un administrador
    public  boolean verificarAdm(String correo){
        boolean x=false;
        for(int i=0; i<listaAdministradores.size(); i++){
            if (listaAdministradores.get(i).getCorreo()==correo){
                x=true;
            }
        }
        return x;
    }

    //metodo para sacar un empleado de la lista de empleado
    public  Empleado buscarEmpleado(String correo){
        return (Empleado) listaEmpleado
                .stream()
                .filter(Empleado->Empleado.getCorreo()==correo);
    }

    //metodo para retornar un administrador de la lista de administrador

    public Administrador buscarAdm(String correo){
        Administrador administrador= (Administrador) listaAdministradores.stream().filter(Administrador->Administrador.getCorreo()==correo);
        return administrador;
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
    public void eliminarEmpleado(String cc) {
        for (int i=0;i<listaEmpleado.size();i++){
            if(listaCliente.get(i).getCc()==cc){
                Persona persona= listaCliente.get(i);
                listaCliente.remove(persona);
            }
        }
    }






}
