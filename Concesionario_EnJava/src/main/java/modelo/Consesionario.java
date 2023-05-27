package modelo;

import java.util.ArrayList;

public class Consesionario {

    //listas necessarias para guardar la información
    private  ArrayList<Administrador> listaAdministradores;
    private  ArrayList<Empleado> listaEmpleado ;
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

    //verifica que existan en las listas correspondientes
    public boolean contenerListaAdmin(String correo){
        boolean x=false;
        for(int i=0; i<listaAdministradores.size();i++){
            if(listaAdministradores.get(i).getCorreo()==correo){
                x=true;
                i=listaEmpleado.size()+1;
            }
        }
        return x;
    }

    public boolean contenerListaEmpleado(String correo){
        boolean x=false;
        for(int i=0; i<listaEmpleado.size();i++){
            if(listaEmpleado.get(i).getCorreo().contains(correo)){
                x=true;
                i=listaEmpleado.size()+1;
            }
        }
        return x;
    }

    //verifica que el correo que fue enviado sea de un administrador
    public  boolean verificarAdm(String correo,String contraseña){
        if(contenerListaAdmin(correo)==true){
            Administrador administrador= buscarAdm(correo);
            return validarContraseñaADM(contraseña,correo);
        }
        else {
            return false;
        }
    }
    public boolean verificarEmpleado(String correo, String contraseña) {
        if(contenerListaEmpleado(correo)==true){
            Empleado empleado= buscarEmpleadoCorreo(correo);
            return validaCotraseña(contraseña,correo);
        }
        else {
            return false;
        }
    }

    // metodos para buscar Personas en las listas
    public  Empleado buscarEmpleadoCorreo(String correo){
        Empleado empleado= (Empleado) listaEmpleado.stream().filter(Empleado->Empleado.getCorreo()==correo);
        return empleado;
    }
    public  Empleado buscarEmpleadoCC(String cc){
        Empleado empleado= (Empleado) listaEmpleado.stream().filter(Empleado->Empleado.getCc()==cc);
        return empleado;
    }
    public Administrador buscarAdm(String correo){
        Administrador administrador= (Administrador) listaAdministradores.stream().filter(Administrador->Administrador.getCorreo()==correo);
        return administrador;
    }


    // metodo para validar contraseñas
    public boolean validarContraseñaADM(String contraseña,String correo){
      Administrador administrador= buscarAdm(correo);
      return administrador.getClave().equals(contraseña);
    }

    public boolean validaCotraseña(String contraseña,String correo){
        Empleado empleado= buscarEmpleadoCorreo(correo);
        return empleado.getClave().equals(contraseña);
    }



    //Metodo para eliminar empleado de la lista
    public void eliminarEmpleado(String cc) {
      Empleado empleado= buscarEmpleadoCC(cc);
      listaEmpleado.remove(empleado);
    }



}
