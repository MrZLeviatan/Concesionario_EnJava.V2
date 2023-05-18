package modelo;

public class Padre extends Vehiculo {
    private int numeroPasajeros;
    private Poseer aireAcondicionado;
    private int numeroPuertas;
    private Poseer camaraReserva;
    private int numeroBolsaAire;


    public Padre(int matricula, String marca, int modelo, int cilindraje, EstadoUso estadoUso, Combustible combustible, int velocidadMax, int cambios, Transmision transmision,int numeroPasajeros, int numeroPuertas,int numeroBolsaAire,Poseer poseer,Poseer camaraReserva, Poseer aireAcondicionado) {
        super(matricula, marca, modelo, cilindraje, estadoUso, combustible, velocidadMax, cambios, transmision);
        this.aireAcondicionado=aireAcondicionado;
        this.numeroPasajeros=numeroPasajeros;
        this.numeroPuertas=numeroPuertas;
        this.camaraReserva=camaraReserva;
        this.numeroBolsaAire=numeroBolsaAire;
    }

}
