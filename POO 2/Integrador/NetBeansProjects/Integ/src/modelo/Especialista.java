package modelo;

import java.util.ArrayList;
import java.util.Map;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.E4B6BED9-3258-4B44-E031-2B6ED5A389E3]
// </editor-fold> 
public class Especialista extends Persona {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.BAEF1E2F-51D3-14BC-7430-64F63410C358]
    // </editor-fold> 
    private ArrayList reservas;
    
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1F85FF7B-420A-75AC-E13E-300C975E257F]
    // </editor-fold> 
    private ArrayList horarios;
    
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.478D4E7E-96D8-A4ED-A098-BC309E38A2C7]
    // </editor-fold> 
    private Marca marca;    

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.CEC991BA-5F43-2208-9DDC-00562144E64E]
    // </editor-fold> 
    private ArrayList servicios;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.076D2615-D693-409D-6BB7-3EB83BC9D618]
    // </editor-fold> 
    public Especialista () {
    }

    public Especialista(Marca marca, int dni, String apellido, String nombre, String telefono) {
        super(dni, apellido, nombre, telefono);
        this.marca = marca;
    }   
    
    public ArrayList getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList reservas) {
        this.reservas = reservas;
    }

    public ArrayList getHorarios() {
        return horarios;
    }

    public void setHorarios(ArrayList horarios) {
        this.horarios = horarios;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public ArrayList getServicios() {
        return servicios;
    }

    public void setServicios(ArrayList servicios) {
        this.servicios = servicios;
    }
    
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.714F1DFB-1C84-EAE9-A14C-1C6F55B9B346]
    // </editor-fold> 
    public void registrarRespuestos () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.EC54F152-9C7E-C762-2EF9-D9FAC85A74FD]
    // </editor-fold> 
    public void verReservas () {
    }

}

