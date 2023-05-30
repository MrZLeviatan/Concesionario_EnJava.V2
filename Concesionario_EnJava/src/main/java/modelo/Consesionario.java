package modelo;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.ArrayList;
import java.util.Properties;

public class Consesionario {

    //listas necessarias para guardar la información
    private final ArrayList<Administrador> listaAdministradores;
    private final   ArrayList<Empleado> listaEmpleado ;
    private final ArrayList <Vehiculo> listaVehiculos;

    private final ArrayList <Cliente> listaCliente;

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
    public  boolean verificarAdm(String correo,String contraseña){
        boolean x= false;
        for (Administrador administrador:listaAdministradores) {
            if(administrador.getCorreo().equals(correo)&&administrador.getClave().equals(contraseña)){
                x= true;
                break ;
            }
        }
        return x;
    }
    public boolean verificarEmpleado(String correo, String contraseña) {
        boolean x= false;
        for (Empleado empleado:listaEmpleado) {
            if(empleado.getCorreo().equals(correo)&&empleado.getClave().equals(contraseña)){
                x= true;
                break ;
            }
        }
        return x;
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

    //Metodo para eliminar empleado de la lista
    public void eliminarEmpleado(String cc) {
      Empleado empleado= buscarEmpleadoCC(cc);
      listaEmpleado.remove(empleado);
    }
    //enviar correo

    public static void enviarCorreo(String correo, String contraseña) {
        // Información de autenticación
        final String username = "soportetucarrouniquindio@gmail.com";
        final String password = "123456Tucarro$";

        // Información del correo electrónico

        //destinatario llega por el metodo recuperar
        String to = correo;
        // lo que vamos a realizar
        String subject = "Recuperacion de la contraseña";
        //aca adjuntamos la contraseña que vamos a enviar
        String body = "Su contraseña es " + contraseña;

        // Configuración de la conexión SMTP
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        // Creación de la sesión SMTP
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            // Creación del mensaje
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject(subject);
            message.setText(body);

            // Envío del mensaje
            Transport.send(message);

            System.out.println("El mensaje se ha enviado exitosamente.");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }




}
