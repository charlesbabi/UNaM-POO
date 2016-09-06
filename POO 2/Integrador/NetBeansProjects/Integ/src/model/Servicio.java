package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Servicio {

   private int id;
   private String observacion;
   private List <RepuestoLinea> repuestoLinea;
   private int tiempo;
   //private Especialista especialista;
   private List <Problema> problemas;
   private Reserva reserva;

    public Servicio() {
        this.problemas = new ArrayList();
    }

    public Servicio(String observacion, int tiempo, Reserva reserva) {
        this();
        this.observacion = observacion;
        this.tiempo = tiempo;
        this.reserva = reserva;
        Empresa.getPersistencia().insert(this);
    }
    
    public Servicio(String observacion, int tiempo, Reserva reserva, List <Problema> problemas, List <RepuestoLinea> repuestos) {
        this();
        this.observacion = observacion;
        this.tiempo = tiempo;
        this.reserva = reserva;
        this.reserva.setServicio(this);
        Iterator<Problema> it = problemas.iterator();
        while(it.hasNext()){
            this.agregarProblema(it.next());
        }
        Iterator<RepuestoLinea> it2 = repuestos.iterator();
        while(it2.hasNext()){
            this.agregarRepuesto(it2.next());
        }
        Empresa.getPersistencia().insert(this);
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

    public List <RepuestoLinea> getRepuestoLinea() {
        return repuestoLinea;
    }

    public void setRepuestoLinea(List <RepuestoLinea> repuestoLinea) {
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

   
   public void agregarRepuesto(RepuestoLinea unaLinea){
       this.getRepuestoLinea();
       if(!this.repuestoLinea.contains(unaLinea)){
           this.repuestoLinea.add(unaLinea);
       }
   }
   
    public void agregarRepuesto(Repuesto unRepuesto, int cantidad){
       this.getRepuestoLinea();
       RepuestoLinea aux = new RepuestoLinea(cantidad, unRepuesto);
       this.repuestoLinea.add(aux);
   }
   
   /** @param unProblema
    * @pdOid dcb079e6-202f-4f46-accf-63e0c0628d48 */
   public void agregarProblema(Problema unProblema) {
       this.getProblemas();
       if (!this.problemas.contains(unProblema)) {
           this.problemas.add(unProblema);
       }
   }
   
   

}