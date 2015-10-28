import java.util.ArrayList;
import java.util.Map;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.E4B6BED9-3258-4B44-E031-2B6ED5A389E3]
// </editor-fold> 
public class Especialista extends Persona {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.478D4E7E-96D8-A4ED-A098-BC309E38A2C7]
    // </editor-fold> 
    private Marca mMarca;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.BAEF1E2F-51D3-14BC-7430-64F63410C358]
    // </editor-fold> 
    private Map reservas;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1F85FF7B-420A-75AC-E13E-300C975E257F]
    // </editor-fold> 
    private ArrayList mHorario;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.CEC991BA-5F43-2208-9DDC-00562144E64E]
    // </editor-fold> 
    private Map mServicio;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.076D2615-D693-409D-6BB7-3EB83BC9D618]
    // </editor-fold> 
    public Especialista () {
    }

    public ArrayList getHorario() {
        return mHorario;
    }

    public void setHorario(ArrayList mHorario) {
        this.mHorario = mHorario;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.16EA18A7-FEB1-C685-464C-111563C98912]
    // </editor-fold> 
    public Marca getMarca () {
        return mMarca;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0EC59B56-E706-EC01-9763-6556884B6631]
    // </editor-fold> 
    public void setMarca (Marca val) {
        this.mMarca = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.9BDDBDCD-90EE-C350-DBAA-8D8042194D9F]
    // </editor-fold> 
    public Map getServicio () {
        return mServicio;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.296CC6BC-E1F1-C9B9-DC82-FD3DF629614F]
    // </editor-fold> 
    public void setServicio (Map val) {
        this.mServicio = val;
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

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.9B5C8006-EDD9-056B-3020-08E7C05FC274]
    // </editor-fold> 
    public Map getReservas () {
        return reservas;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.9A6D8ADD-2B19-3FD8-2DE9-45EB4D6BC901]
    // </editor-fold> 
    public void setReservas (Map val) {
        this.reservas = val;
    }

}

