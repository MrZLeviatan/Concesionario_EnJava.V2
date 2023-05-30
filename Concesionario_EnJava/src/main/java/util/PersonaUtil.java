package util;

import Modelo.Genero;
import Modelo.Persona;

import java.util.function.Predicate;

public class PersonaUtil {
    public static Predicate<Persona> buscarPorCc(int cc) {
        return persona -> persona.getCc()==(cc);
    }

    public static Predicate<Persona> buscarPorCorreo(String correo) {
        return persona -> persona.getCorreo().contains(correo);
    }


    public static Predicate<Persona> buscarPorNombre(String nombre) {
        return persona -> persona.getNombre().equals(nombre);
    }


    public static Predicate<Persona> buscarPorGenero(Genero genero){
        return persona -> persona.getGenero()==genero;

    }



    public static Predicate<Persona>buscarDatosPersona(int cc,String correo,String nombre,Genero genero){
        Predicate<Persona> predicado= persona -> true;
        if(cc!=0){
            predicado.and(buscarPorCc(cc));
        }
        if(correo != null && !correo.isEmpty()){
            predicado.and(buscarPorCorreo(correo));
        }
        if(nombre !=null && !nombre.isEmpty()){
            predicado.and(buscarPorNombre(nombre));
        }
        if(genero !=null){
            predicado.and(buscarPorGenero(genero));
        }
        return predicado;
    }

}





