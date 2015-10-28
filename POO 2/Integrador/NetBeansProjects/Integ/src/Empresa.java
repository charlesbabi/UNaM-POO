
import java.util.GregorianCalendar;
import java.util.Map;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.AE5E9171-F96A-E557-6D83-2E7D4707B2DA]
// </editor-fold> 
public class Empresa {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.73733F03-DA45-8475-E64A-6B09951A02AA]
    // </editor-fold> 
    private Map reservas;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.36D397D6-3001-2DA2-71E1-3F7EF4E3E03C]
    // </editor-fold> 
    private String nombre;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E659E3FE-57A5-57CE-CC0B-FB614FE7CBBA]
    // </editor-fold> 
    private Map mMarca;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2FA1DEB3-83BA-2C1F-DE03-AD182EF7F94E]
    // </editor-fold> 
    private Map mVehiculo;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D94FDA2B-D825-B80B-F93C-159DB0785050]
    // </editor-fold> 
    private Map mCliente;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8FDC37FF-1CB3-4303-E46B-75CD5226E645]
    // </editor-fold> 
    private Map mReserva;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.51E497F0-779B-87E0-F538-F49854B21032]
    // </editor-fold> 
    private Map mEspecialista;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5179018B-0707-4C3C-5150-A1C8E3874599]
    // </editor-fold> 
    private Map mServicio;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E8577EC0-03C1-1D34-6BEE-12870761B647]
    // </editor-fold> 
    private Map mRepuesto;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.66BBC733-C79F-024F-01D1-213500E62089]
    // </editor-fold> 
    private Map mProblema;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1816ED96-B77C-76F5-FD89-02309AB3D25E]
    // </editor-fold> 
    public Empresa () {
    }

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public Map getmCliente() {
        return mCliente;
    }

    public void setmCliente(Map mCliente) {
        this.mCliente = mCliente;
    }

    public Map getmEspecialista() {
        return mEspecialista;
    }

    public void setmEspecialista(Map mEspecialista) {
        this.mEspecialista = mEspecialista;
    }

    public Map getmMarca() {
        return mMarca;
    }

    public void setmMarca(Map mMarca) {
        this.mMarca = mMarca;
    }

    public Map getmProblema() {
        return mProblema;
    }

    public void setmProblema(Map mProblema) {
        this.mProblema = mProblema;
    }

    public Map getmRepuesto() {
        return mRepuesto;
    }

    public void setmRepuesto(Map mRepuesto) {
        this.mRepuesto = mRepuesto;
    }

    public Map getmReserva() {
        return mReserva;
    }

    public void setmReserva(Map mReserva) {
        this.mReserva = mReserva;
    }

    public Map getmServicio() {
        return mServicio;
    }

    public void setmServicio(Map mServicio) {
        this.mServicio = mServicio;
    }

    public Map getmVehiculo() {
        return mVehiculo;
    }

    public void setmVehiculo(Map mVehiculo) {
        this.mVehiculo = mVehiculo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Map getReservas() {
        return reservas;
    }

    public void setReservas(Map reservas) {
        this.reservas = reservas;
    }

}

