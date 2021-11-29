
package Modelo;

public class Asientos {
    private int idAsiento;
    private int planta;
    private String estado;
    private int idAvion;

    public Asientos() {
    }

    public Asientos(int idAsiento, int planta, String estado, int idAvion) {
        this.idAsiento = idAsiento;
        this.planta = planta;
        this.estado = estado;
        this.idAvion = idAvion;
    }

    public int getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(int idAvion) {
        this.idAvion = idAvion;
    }

    public int getIdAsiento() {
        return idAsiento;
    }

    public void setIdAsiento(int idAsiento) {
        this.idAsiento = idAsiento;
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
