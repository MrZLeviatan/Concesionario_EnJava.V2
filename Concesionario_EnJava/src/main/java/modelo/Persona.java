package modelo;

import java.util.Objects;

public class Persona {
    private String nombre,correo;
    private int edad,cc;
    private Genero genero;

    public Persona(String nombre, String correo, int edad,int cc, Genero genero)throws Exception{
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
    public Genero getGenero() {
        return genero;
    }
    public int getCc() {
        return cc;
    }
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
