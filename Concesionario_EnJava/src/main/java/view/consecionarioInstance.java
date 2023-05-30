package view;

import modelo.Administrador;
import modelo.Consesionario;
import modelo.Genero;

public enum consecionarioInstance {

    INSTANCE;
    private final Consesionario consesionario;

    consecionarioInstance() {
        consesionario= new Consesionario();
        try {
            consesionario.addAministrador( new Administrador("juan","123",12,"123", Genero.MASCULINO,"123","lolsito"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Consesionario getConsesionario() {
        return consesionario;
    }
}
