package modelo;


import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.425E8446-D980-C013-176B-2CB41FA55C04]
// </editor-fold> 
public class Reserva {

    private int id;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2D51F4C0-B5BA-3192-29CF-0E809950D7EE]
    // </editor-fold> 
    private GregorianCalendar fecha;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.73A8514E-F0DD-9E75-65D8-00878C054416]
    // </editor-fold> 
    private Vehiculo vehiculo;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3091E8DB-F9CF-041A-DFDD-D7B2D8B39D43]
    // </editor-fold> 
    private Horario horario;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4F8247DE-5AFE-A2E8-7CAF-C81AC1B40C9F]
    // </editor-fold> 
    private Especialista especialista;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DE90E75F-D2A5-9C8B-0B2D-80C6A979368A]
    // </editor-fold> 
    private Cliente cliente;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.083224B6-EE9A-8A5D-5B58-09003CEDA4EA]
    // </editor-fold> 
    private List problemas;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.61C4CCBF-6125-BCE0-E96A-FDBF712BA46B]
    // </editor-fold> 
    public Reserva () {
    }

    public Reserva(GregorianCalendar fecha, Vehiculo vehiculo, Horario horario, Especialista especialista, Cliente cliente) {
        this.fecha = fecha;
        this.vehiculo = vehiculo;
        this.horario = horario;
        this.especialista = especialista;
        this.cliente = cliente;
    }  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public Especialista getEspecialista() {
        return especialista;
    }

    public void setEspecialista(Especialista especialista) {
        this.especialista = especialista;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List getProblemas() {
        return problemas;
    }

    public void setProblemas(List problemas) {
        this.problemas = problemas;
    }


}

