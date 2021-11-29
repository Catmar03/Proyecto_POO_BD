
package Modelo;


public class Revervas {
    private int idReserva;
    private String origen;
    private String destino;
    private int fecha;
    private String monto;
    private int idAsiento;
    private int idAvion;
    private int idPasajero;

    public Revervas() {
    }

    public Revervas(int idReserva, String origen, String destino, int fecha, String monto, int idPasajero) {
        this.idReserva = idReserva;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.monto = monto;
        this.idPasajero = idPasajero;
    }

    public int getIdPasajero() {
        return idPasajero;
    }

    public void setIdPasajero(int idPasajero) {
        this.idPasajero = idPasajero;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public int getIdAsiento() {
        return idAsiento;
    }

    public void setIdAsiento(int idAsiento) {
        this.idAsiento = idAsiento;
    }

    public int getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(int idAvion) {
        this.idAvion = idAvion;
    }
    
    
    
}
