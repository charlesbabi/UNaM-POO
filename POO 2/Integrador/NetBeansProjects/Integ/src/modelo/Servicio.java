package modelo;


import java.util.ArrayList;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.FE48412E-44DE-18ED-AEAF-89A1C9026EEE]
// </editor-fold> 
public class Servicio {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9BBA1D43-66EC-5E6F-8CE7-430CC4A76945]
    // </editor-fold> 
    private int id;
    
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.43DE8C36-67AD-B461-C78A-A6CD658AEE27]
    // </editor-fold> 
    private String observacion;   

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.644542CA-A24D-CAC4-D06C-C6AA220D233D]
    // </editor-fold> 
    private ArrayList repuestoLinea;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.61863D7D-EFD1-7564-1381-7FE2632FC91A]
    // </editor-fold> 
    private Reserva reserva;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E14FFCFA-0FAC-20CD-ED3B-C0318566ADD8]
    // </editor-fold> 
    public Servicio () {
    }

    public Servicio(String observacion, int id, ArrayList mRepuestoLinea, Reserva mReserva) {
        this.observacion = observacion;
        this.id = id;
        this.repuestoLinea = mRepuestoLinea;
        this.reserva = mReserva;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.5BE53C82-94EA-17DF-D4F9-77046BBC6536]
    // </editor-fold> 
    public int getId () {
        return id;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F929F203-CA02-E1D6-A7D5-1A44D7B55CD7]
    // </editor-fold> 
    public void setId (int val) {
        this.id = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F51991FB-E190-2347-ADAD-61B3809D743A]
    // </editor-fold> 
    public ArrayList getRepuestoLinea () {
        return repuestoLinea;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.47631D68-E2D8-6966-C2FB-A207DF2C8FC3]
    // </editor-fold> 
    public void setRepuestoLinea (ArrayList val) {
        this.repuestoLinea = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.99095B47-6ECF-E245-41DA-542DB608ABD4]
    // </editor-fold> 
    public Reserva getReserva () {
        return reserva;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.44060FBC-43E6-C257-98EB-83188C713E35]
    // </editor-fold> 
    public void setReserva (Reserva val) {
        this.reserva = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1C99001A-C0ED-B4DA-25EB-9F6901CDBCC6]
    // </editor-fold> 
    public String getObservacion () {
        return observacion;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0DC628DA-D4D7-21B4-D695-572862816CF6]
    // </editor-fold> 
    public void setObservacion (String val) {
        this.observacion = val;
    }

}

