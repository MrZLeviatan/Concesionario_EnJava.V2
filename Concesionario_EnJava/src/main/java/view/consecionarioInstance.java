package view;

import Modelo.Consesionario;

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
