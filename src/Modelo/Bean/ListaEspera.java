package Modelo.Bean;


public class ListaEspera {

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getBoletos() {
        return boletos;
    }

    public void setBoletos(String boletos) {
        this.boletos = boletos;
    }

    public String getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(String cotizacion) {
        this.cotizacion = cotizacion;
    }

    /**
     * @return the Codigo
     */
    public int getCodigo() {
        return Codigo;
    }

    /**
     * @param Codigo the Codigo to set
     */
    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    /**
     * @return the Padron
     */
    public String getPadron() {
        return Padron;
    }

    /**
     * @param Padron the Padron to set
     */
    public void setPadron(String Padron) {
        this.Padron = Padron;
    }

    /**
     * @return the hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * @return the lado
     */
    public String getLado() {
        return lado;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(String lado) {
        this.lado = lado;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    private int Codigo; 
    private String Padron ; 
    private String hora; 
    private String lado;
    private String fecha;
    private int orden;
    private String boletos;
    private String cotizacion;
    private String placa;

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }
   
    
}
