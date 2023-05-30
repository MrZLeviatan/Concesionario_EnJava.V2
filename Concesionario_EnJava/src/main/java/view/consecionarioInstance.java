package view;

import modelo.*;

public enum consecionarioInstance {

    INSTANCE;
    private final Consesionario consesionario;

    consecionarioInstance()  {
        consesionario= new Consesionario();
        try {
            consesionario.addAministrador( new Administrador("juan","123",12,"123", Genero.MASCULINO,"123","lolsito"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            consesionario.addEmpleado(new Empleado("juan","1234",23,"1234",Genero.MASCULINO,"123","lolsito", Estado.ACTIVO,Nivel.INFERIOR));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Consesionario getConsesionario() {
        return consesionario;
    }
}
