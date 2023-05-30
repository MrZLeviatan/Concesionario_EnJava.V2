package Modelo;

import java.util.Objects;

public class Persona {

    //SE CREAN LOS ATRIBUTOS DE LAS PERSONAS
    private String nombre,correo;
    private int cc;
    private int edad;
    private Genero genero;


    //SE CREA EL CONSTRUCTOR DE LOS ATRIBUTOS DE PERSONA CON SUS RESPECTIVOS EXCEPTIONES...
    public Persona(String nombre, String correo, int edad,int cc, Genero genero)throws Exception {
        this.nombre = Objects.requireNonNull(nombre,"El nombre es requerido");

            if( nombre.isBlank() ){
                throw new RuntimeException("El nombre es requerido");
            }
            this.correo = Objects.requireNonNull(nombre,"El correo es requerido");

            if( correo.isBlank() ){
                throw new RuntimeException("El correo es requerido");
            }

        this.cc = Objects.requireNonNull(cc,"La cédula es requirida");
        this.edad=Objects.requireNonNull(edad,"la edad es requerida");
        this.genero=genero;
    }

    // SE CREAN LOS GETTERS DE LOS ATRIBUTOS PARA PODER ENVIARLOS (EN SI VOLVIMOS ESTO UN OBJETO)...

    public Genero getGenero() {
        return genero;
    }
    public int getCc() {return cc;}
    public String getNombre() {
        return nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public int getEdad(int edad) {
        return edad;
    }


}
