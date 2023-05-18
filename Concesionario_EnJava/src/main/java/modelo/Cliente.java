package modelo;

public class Cliente extends Persona{


    public Cliente(String nombre, String correo, int edad, int cc, Genero genero) throws Exception {
        super(nombre, correo, edad, cc, genero);
    }
}
