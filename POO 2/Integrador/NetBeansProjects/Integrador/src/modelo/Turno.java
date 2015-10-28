package modelo;

import java.util.GregorianCalendar;

public class Turno {

    private int id;
    private int duracion;
    private GregorianCalendar inicio;
    private String descripcion;
    private Servicio servicio;
    private Especialista especialista;
    private short estado;

    public Turno() {
    }

    public Turno(int id, int duracion, GregorianCalendar inicio, String descripcion, Servicio servicio, Especialista especialista, short estado) throws Exception {
        this.id = id;
        this.duracion = duracion;
        this.inicio = inicio;
        this.descripcion = descripcion;
        this.servicio = servicio;
        this.especialista = especialista;
        this.estado = estado;
        this.especialista.asignarTurno(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public GregorianCalendar getInicio() {
        return inicio;
    }

    public void setInicio(GregorianCalendar inicio) {
        this.inicio = inicio;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Especialista getEspecialista() {
        return especialista;
    }

    public void setEspecialista(Especialista especialista) {
        this.especialista = especialista;
    }

    public short getEstado() {
        return estado;
    }

    public void setEstado(short estado) {
        this.estado = estado;
    }

    
    

    public void asignarEspecialista(Especialista unEspe) throws Exception{
        especialista = this.getEspecialista();
        if(especialista != null){
            especialista = unEspe;
        }else{
            throw new Exception("Este turno ya tiene un especialista asignado");
        }
    }

    /*  public boolean horarioLibre(GregorianCalendar horario){
    boolean retorno = false;
    GregorianCalendar aux = this.horario;
    aux.add(GregorianCalendar.MINUTE, duracion);
    if(!(this.horario.compareTo(horario) >= 0 && aux.compareTo(horario) <= 0)){
    retorno = true;
    }
    return retorno;
    }*/
}

