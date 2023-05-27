package view;

import modelo.Consesionario;

public enum consecionarioInstance {

    INSTANCE;
    private final Consesionario consesionario;



    consecionarioInstance() {
        consesionario= new Consesionario();
    }

    public Consesionario getConsesionario() {
        return consesionario;
    }
}
