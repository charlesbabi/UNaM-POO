
import java.util.ArrayList;
import java.util.GregorianCalendar;


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
    private Vehiculo mVehiculo;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3091E8DB-F9CF-041A-DFDD-D7B2D8B39D43]
    // </editor-fold> 
    private Horario mHorario;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4F8247DE-5AFE-A2E8-7CAF-C81AC1B40C9F]
    // </editor-fold> 
    private Especialista mEspecialista;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DE90E75F-D2A5-9C8B-0B2D-80C6A979368A]
    // </editor-fold> 
    private Cliente mCliente;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.083224B6-EE9A-8A5D-5B58-09003CEDA4EA]
    // </editor-fold> 
    private ArrayList mProblema;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.61C4CCBF-6125-BCE0-E96A-FDBF712BA46B]
    // </editor-fold> 
    public Reserva () {
    }

    public Reserva(int id, GregorianCalendar fecha, Vehiculo mVehiculo, Horario mHorario, Especialista mEspecialista, Cliente mCliente) {
        this.id = id;
        this.fecha = fecha;
        this.mVehiculo = mVehiculo;
        this.mHorario = mHorario;
        this.mEspecialista = mEspecialista;
        this.mCliente = mCliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.CAD90999-CC7F-6E69-2900-567BD750CDD0]
    // </editor-fold> 
    public GregorianCalendar getFecha () {
        return fecha;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.72163F9A-E5DC-B498-A160-2F1C57F0313A]
    // </editor-fold> 
    public void setFecha (GregorianCalendar val) {
        this.fecha = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.9E440DCB-9B27-9D78-2C68-75D002A3857C]
    // </editor-fold> 
    public Cliente getCliente () {
        return mCliente;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.898255F7-E282-7FAA-3B2B-340278E5C946]
    // </editor-fold> 
    public void setCliente (Cliente val) {
        this.mCliente = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F45D2B18-5CED-0F41-CA78-D91DC333B2FA]
    // </editor-fold> 
    public Especialista getEspecialista () {
        return mEspecialista;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D0AF43F4-D5EC-FE68-533C-D7B0A3DFC914]
    // </editor-fold> 
    public void setEspecialista (Especialista val) {
        this.mEspecialista = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.30F52ADA-5531-84E5-7C17-ECD068191186]
    // </editor-fold> 
    public Horario getHorario () {
        return mHorario;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.475AB67D-7739-FCE6-844E-8178DE746662]
    // </editor-fold> 
    public void setHorario (Horario val) {
        this.mHorario = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FA3DB1AE-A8A3-5D82-7E21-0074D6D7525D]
    // </editor-fold> 
    public ArrayList getProblema () {
        return mProblema;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A11A8CD4-F45D-85A0-C6BF-AD33C30FF525]
    // </editor-fold> 
    public void setProblema (ArrayList val) {
        this.mProblema = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.62879E4B-5501-0DDE-0406-908DBCBD783E]
    // </editor-fold> 
    public Vehiculo getVehiculo () {
        return mVehiculo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B40C4826-6D67-36EA-DAD4-36985FE9F5F7]
    // </editor-fold> 
    public void setVehiculo (Vehiculo val) {
        this.mVehiculo = val;
    }

}

