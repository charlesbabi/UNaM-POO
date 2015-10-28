package modelo;


import java.util.ArrayList;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.6B2D17FA-8B46-89B9-98E4-B8D23DF38FD6]
// </editor-fold> 
public class Reparacion extends Servicio {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C2BBFB67-478C-4301-F0E4-ABCAB7751F25]
    // </editor-fold> 
    private float manoDeObra;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F24380AF-CDC7-248D-7917-360B2CF7BB81]
    // </editor-fold> 
    public Reparacion () {
    }

    public Reparacion(String observacion, int id, ArrayList mRepuestoLinea, Reserva mReserva, float manoDeObra) {
        super(observacion, id, mRepuestoLinea, mReserva);
        this.manoDeObra = manoDeObra;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C0E47FA8-26FB-0FE6-699F-FACE0420507E]
    // </editor-fold> 
    public float getManoDeObra () {
        return manoDeObra;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.99E2D1B4-E0A1-0475-F033-E964D083B6B4]
    // </editor-fold> 
    public void setManoDeObra (float val) {
        this.manoDeObra = val;
    }

}

