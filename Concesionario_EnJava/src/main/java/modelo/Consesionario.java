package modelo;

import java.util.ArrayList;

public class Consesionario {
    private static ArrayList<Empleado> listaEmpleado= new ArrayList<>();
    private ArrayList <Vehiculo> ListaVehiculos= new ArrayList<>();
    private ArrayList <Administrador> listaAdministrador = new ArrayList<>();
    private ArrayList <Cliente> ListaCliente= new ArrayList<>();

    
    
    
    public ArrayList<Administrador> getListaAdministrador() {
        return listaAdministrador;
    }

    public void setListaAdministrador(ArrayList<Administrador> listaAdministrador) {
        this.listaAdministrador = listaAdministrador;
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

     public ArrayList<Administrador>añadirAdministrador(Administrador administrador, ArrayList<Administrador>listaAdministrador){
        listaAdministrador.add(administrador);
        return listaAdministrador
                ;
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


}
