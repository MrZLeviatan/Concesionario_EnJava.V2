package modelo;

import java.util.ArrayList;

public class Consesionario {
    private static ArrayList<Empleado> listaEmpleado= new ArrayList<>();
    private ArrayList <Vehiculo> ListaVehiculos= new ArrayList<>();

    private ArrayList <Cliente> ListaCliente= new ArrayList<>();


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


    //metodo para verificar la contraseña

    public static boolean verificarContraseña(String correo, String contraseña){
        boolean contraseñaValida=false;
        for(int i=0;i<getListaEmpleado().size();i++){
            if(getListaEmpleado().get(i).getCorreo()==correo){
               contraseñaValida=getListaEmpleado().get(i).getClave().contains(contraseña);
               i=getListaEmpleado().size()+1;
            }
        }
        return contraseñaValida;
    }


}
