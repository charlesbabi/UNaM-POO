package modelo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Vehiculo {    

    private String patente;
    private GregorianCalendar fechaDeVenta;
    private Modelo modelo;    

    public Vehiculo () {
    }

    public Vehiculo(String patente, GregorianCalendar fechaDeVenta, Modelo mModelo) {
        this();
        this.patente = patente;
        this.fechaDeVenta = fechaDeVenta;
        this.modelo = mModelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public GregorianCalendar getFechaDeVenta() {
        return fechaDeVenta;
    }

    public void setFechaDeVenta(GregorianCalendar fechaDeVenta) {
        this.fechaDeVenta = fechaDeVenta;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
    

    private int tiempoCirculando(){
        int respuesta;
        GregorianCalendar fecha = (GregorianCalendar) GregorianCalendar.getInstance();
        respuesta = fecha.get(Calendar.YEAR) - fechaDeVenta.get(Calendar.YEAR);
        if((fechaDeVenta.get(Calendar.MONTH) < fecha.get(Calendar.MONTH))
                || ((fechaDeVenta.get(Calendar.MONTH) == fecha.get(Calendar.MONTH))
                && (fechaDeVenta.get(Calendar.DAY_OF_MONTH) <= fecha.get(Calendar.DAY_OF_MONTH)))){
            respuesta -= 1;
        }
        return respuesta;
    }

    public boolean enGarantia(int garantia){
        boolean retorno = false;
        if(garantia < tiempoCirculando()){
            retorno = true;
        }
        return retorno;
    }
}

