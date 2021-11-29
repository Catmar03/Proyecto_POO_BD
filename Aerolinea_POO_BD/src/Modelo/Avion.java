
package Modelo;

public class Avion {
    private int idAvion;
    private String aerolinea;
    private String fabricante;
    private int capacidadPersonas;
    private String estado;

    public Avion() {
    }

    public Avion(int idAvion, String aerolinea, String fabricante, int capacidadPersonas, String estado) {
        this.idAvion = idAvion;
        this.aerolinea = aerolinea;
        this.fabricante = fabricante;
        this.capacidadPersonas = capacidadPersonas;
        this.estado = estado;
    }

    
    

    public int getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(int idAvion) {
        this.idAvion = idAvion;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getCapacidadPersonas() {
        return capacidadPersonas;
    }

    public void setCapacidadPersonas(int capacidadPersonas) {
        this.capacidadPersonas = capacidadPersonas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
