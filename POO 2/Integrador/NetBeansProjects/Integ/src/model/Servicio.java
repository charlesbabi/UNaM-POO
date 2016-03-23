package model;

import java.util.ArrayList;
import java.util.List;

public class Servicio {

   private int id;
   private String observacion;
   private ArrayList repuestoLinea;
   private int tiempo;
   private List <Problema> problemas;
   private Reserva reserva;

    public Servicio() {
        this.problemas = new ArrayList();
    }

    public Servicio(int id, String observacion, int tiempo, Reserva reserva) {
        this();
        this.id = id;
        this.observacion = observacion;
        this.tiempo = tiempo;
        this.reserva = reserva;
    }
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public ArrayList getRepuestoLinea() {
        return repuestoLinea;
    }

    public void setRepuestoLinea(ArrayList repuestoLinea) {
        this.repuestoLinea = repuestoLinea;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public List<Problema> getProblemas() {
        return problemas;
    }

    public void setProblemas(List<Problema> problemas) {
        this.problemas = problemas;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

   
   
   
   /** @param unProblema
    * @pdOid dcb079e6-202f-4f46-accf-63e0c0628d48 */
   public void agregarProblema(Problema unProblema) {
      // TODO: implement
   }
   
   

}