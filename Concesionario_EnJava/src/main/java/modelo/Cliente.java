package modelo;

public class Cliente extends Persona{


    public Cliente(String nombre, String contraseña, String correo, int edad, int cc, Genero genero) throws Exception {
        super(nombre,contraseña, correo, edad, cc, genero);
    }
}
