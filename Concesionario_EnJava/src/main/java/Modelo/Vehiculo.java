package Modelo;

public class Vehiculo {
    private  int matricula;
    private String marca;
    private int modelo;

    private  int cilindraje;
    private EstadoUso estadoUso;
    private Combustible combustible;

    private int velocidadMax;
    private int cambios;
    private Transmision transmision;

    public Vehiculo(int matricula,String marca, int modelo, int cilindraje, EstadoUso estadoUso,Combustible combustible, int velocidadMax, int cambios, Transmision transmision) {
        this.matricula= matricula;
        this.marca = marca;
        this.modelo= modelo;
        this.cilindraje=cilindraje;
        this.estadoUso=estadoUso;
        this.combustible=combustible;
        this.velocidadMax=velocidadMax;
        this.cambios=cambios;
        this.transmision=transmision;
    }



    public Transmision getTransmision() {
        return transmision;
    }

    public void setTransmision(Transmision transmision) {
        this.transmision = transmision;
    }

    public int getCambios() {
        return cambios;
    }

    public void setCambios(int cambios) {
        this.cambios = cambios;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public Combustible getCombustible() {
        return combustible;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    public EstadoUso getEstadoUso() {
        return estadoUso;
    }

    public void setEstadoUso(EstadoUso estadoUso) {
        this.estadoUso = estadoUso;
    }

    public float getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
