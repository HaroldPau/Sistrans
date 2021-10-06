
package Modelo.Bean;

public class Despacho {

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    /**
     * @return the HoraSalida
     */
    public String getHoraSalida() {
        return HoraSalida;
    }

    /**
     * @param HoraSalida the HoraSalida to set
     */
    public void setHoraSalida(String HoraSalida) {
        this.HoraSalida = HoraSalida;
    }

    /**
     * @return the HoraTurno
     */
    public String getHoraTurno() {
        return HoraTurno;
    }

    /**
     * @param HoraTurno the HoraTurno to set
     */
    public void setHoraTurno(String HoraTurno) {
        this.HoraTurno = HoraTurno;
    }

    /**
     * @return the Placa
     */
    public String getPlaca() {
        return Placa;
    }

    /**
     * @param Placa the Placa to set
     */
    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    /**
     * @return the Fecha
     */
    public String getFecha() {
        return Fecha;
    }

    /**
     * @param Fecha the Fecha to set
     */
    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    /**
     * @return the Lado
     */
    public String getLado() {
        return Lado;
    }

    /**
     * @param Lado the Lado to set
     */
    public void setLado(String Lado) {
        this.Lado = Lado;
    }

    /**
     * @return the padron
     */
    public int getPadron() {
        return padron;
    }

    /**
     * @param padron the padron to set
     */
    public void setPadron(int padron) {
        this.padron = padron;
    }

    /**
     * @return the frecuencia
     */
    public int getFrecuencia() {
        return frecuencia;
    }

    /**
     * @param frecuencia the frecuencia to set
     */
    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    /**
     * @return the exceso
     */
    public int getExceso() {
        return exceso;
    }

    /**
     * @param exceso the exceso to set
     */
    public void setExceso(int exceso) {
        this.exceso = exceso;
    }
    private String HoraSalida;
    private String HoraTurno;
    private String Placa;
    private String Fecha;
    private String Lado;
    private int padron;
    private int frecuencia;
    private int exceso;
    private int orden;

}
