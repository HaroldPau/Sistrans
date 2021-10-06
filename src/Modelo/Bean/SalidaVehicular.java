
package Modelo.Bean;

/**
 *
 * @author Harold7v7
 */
public class SalidaVehicular {
    private String HoraSalida ;
    private String Horallegada;
    private String lado;
    private double nsalida;

    public String getHoraSalida() {
        return HoraSalida;
    }

    public void setHoraSalida(String HoraSalida) {
        this.HoraSalida = HoraSalida;
    }

    public String getHorallegada() {
        return Horallegada;
    }

    public void setHorallegada(String Horallegada) {
        this.Horallegada = Horallegada;
    }

    public String getLado() {
        return lado;
    }

    public void setLado(String lado) {
        this.lado = lado;
    }

    public double getNsalida() {
        return nsalida;
    }

    public void setNsalida(double nsalida) {
        this.nsalida = nsalida;
    }
    
}
