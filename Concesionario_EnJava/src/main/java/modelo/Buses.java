

package modelo;

public class Buses extends Padre{

    private Poseer abs;
    private int numeroEjes;
    private int numeroSalidaEmergencia;
    
    public Buses(final int numeroEjes, final int numeroSalidaEmergencia, final int matricula, final Poseer abs, final String marca, final int modelo, final int cilindraje, final EstadoUso estadoUso, final Combustible combustible, final int velocidadMax, final int cambios, final Transmision transmision, final int numeroPasajeros, final int numeroPuertas, final int numeroBolsaAire, final Poseer poseer, final Poseer camaraReserva, final Poseer aireAcondicionado) {
        super(matricula, marca, modelo, cilindraje, estadoUso,combustible, velocidadMax, cambios, transmision, numeroPasajeros, numeroPuertas, numeroBolsaAire, poseer, camaraReserva, aireAcondicionado);
        this.abs = abs;
        this.numeroEjes = numeroEjes;
        this.numeroSalidaEmergencia = numeroSalidaEmergencia;
    }
}
