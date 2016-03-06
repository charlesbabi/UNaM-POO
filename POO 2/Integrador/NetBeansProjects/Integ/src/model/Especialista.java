package model;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

public class Especialista extends Persona {

   private List reservas;
   private Marca marca;
   private List servicios;
   private Agenda agenda;
   
   public Especialista(){
       super();
       this.reservas = new ArrayList();
       this.marca = null;
       this.servicios = new ArrayList();
       this.agenda = null;
   }

    public Especialista(String dni, String apellido, String nombre,String telefono, Marca unaMarca) {
        super(dni, apellido, nombre, telefono);
        this.reservas = new ArrayList();
        this.servicios = new ArrayList();
        this.agenda = null;
        this.marca = unaMarca;
        Empresa.getPersistencia().insert(this);
    }   
   
   private boolean estaOcupado(GregorianCalendar fecha, int hora) {       
       return false;

   }
   
   /**  <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    *  #[regen=yes,id=DCE.714F1DFB-1C84-EAE9-A14C-1C6F55B9B346]
    *  </editor-fold>
    * 
    * @pdOid cccde989-e4e9-40c9-b036-f5bdbc1731d7 */
   public void registrarRespuestos() {
   }
   
   /**  <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    *  #[regen=yes,id=DCE.EC54F152-9C7E-C762-2EF9-D9FAC85A74FD]
    *  </editor-fold>
    * 
    * @pdOid 074dbf21-0fe1-4d15-bc62-2a08e881310b */
   public void verReservas() {
   }
   
   /** @param fecha 
    * @param duracion
    * @pdOid 68673683-eaad-418c-a97f-dc62517b5b79 */
   public List buscarHorariosLibres(GregorianCalendar fecha, int duracion) {        
     return null;
   }
   
   /** @param unaReserva
    * @exception Exception
    * @pdOid 830e165a-9345-48dc-a12c-c2bf9652fe15 */
   public void agregarReserva(Reserva unaReserva) throws Exception {
       Iterator<Reserva> itReservas = this.getReservas().iterator();
       boolean act = true;
           while(itReservas.hasNext() && act == true){
               Reserva temp = itReservas.next();

           }        
       if(act){
           this.reservas.add(unaReserva);
       }else{
           throw new Exception("El horario para esa reserva esta ocupado.");
       }       
   }

    public List getReservas() {
        return reservas;
    }

    public void setReservas(List reservas) {
        this.reservas = reservas;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public List getServicios() {
        return servicios;
    }

    public void setServicios(List servicios) {
        this.servicios = servicios;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

   
   
}