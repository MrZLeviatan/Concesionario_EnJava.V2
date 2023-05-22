package modelo;

import java.util.ArrayList;

public class Consesionario {
    private static ArrayList<Administrador> administradores = new ArrayList<>();
    final Administrador adm= new Administrador("JEFE","admintucarro@gmail.com",19,25693,Genero.MASCULINO,"admin123","admintotal");

    private static ArrayList<Empleado> listaEmpleado= new ArrayList<>();
    private ArrayList <Vehiculo> ListaVehiculos= new ArrayList<>();

    private ArrayList <Cliente> ListaCliente= new ArrayList<>();

    public Consesionario() throws Exception {
    }

    public static ArrayList<Administrador> getAdministradores() {
        return administradores;
    }

    public ArrayList<Administrador> getListaAdministradores() {
        return administradores;
    }

    public static ArrayList<Empleado> getListaEmpleado() {
        return listaEmpleado;
    }

    public static void setListaEmpleado(ArrayList<Empleado> listaEmpleado) {
        Consesionario.listaEmpleado = listaEmpleado;
    }

    public ArrayList<Vehiculo> getListaVehiculos() {
        return ListaVehiculos;
    }

    public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
        ListaVehiculos = listaVehiculos;
    }

    public ArrayList<Cliente> getListaCliente() {
        return ListaCliente;
    }

    public void setListaCliente(ArrayList<Cliente> listaCliente) {
        ListaCliente = listaCliente;
    }



    public ArrayList<Cliente>añadirCliente(Cliente cliente, ArrayList<Cliente>listaCliente){
        listaCliente.add(cliente);
        return listaCliente;
    }

    public static ArrayList<Vehiculo> añadirVehiculo(Vehiculo vehiculo, ArrayList<Vehiculo> listaVehiculos){
        listaVehiculos.add(vehiculo);
        return listaVehiculos;
    }

    public ArrayList<Empleado> añadirEmpleado(Empleado empleado, ArrayList<Empleado> listaEmpleado){
        listaEmpleado.add(empleado);
        return listaEmpleado;
    }

    public ArrayList<Administrador>añadirAdministrador(){
       administradores.add(adm);
       return administradores;

    }


    public static boolean verificarAdm(String correo){
        boolean x=false;
        for(int i=0; i<administradores.size(); i++){
            if (administradores.get(i).getCorreo()==correo){
                x=true;
                return  x;
            }
        }
        return x;
    }



}
