
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.211F76F0-8E19-6FB7-E828-E374E04F77A6]
// </editor-fold> 
public class RepuestoLinea {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.011A5CF1-29EA-7FC4-B323-FAFAD1FD04CF]
    // </editor-fold> 
    private int cantidad;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.761728D5-8BEE-381D-A285-059CFF29BF2C]
    // </editor-fold> 
    private Repuesto mRepuesto;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.19F0C40B-5A67-2623-3EDC-673947027478]
    // </editor-fold> 
    public RepuestoLinea () {
    }

    public RepuestoLinea(int cantidad, Repuesto mRepuesto) {
        this.cantidad = cantidad;
        this.mRepuesto = mRepuesto;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.71B48F65-F6A7-15C3-6624-CCBE40D25DB3]
    // </editor-fold> 
    public int getCantidad () {
        return cantidad;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.EA05144C-8EE2-902D-FD4B-348D492F8E67]
    // </editor-fold> 
    public void setCantidad (int val) {
        this.cantidad = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.CADFBFA4-7EA7-8A55-2747-A7CF19F353CB]
    // </editor-fold> 
    public Repuesto getRepuesto () {
        return mRepuesto;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4A0927C1-AC77-D1CB-C7F1-BE74E3C63A49]
    // </editor-fold> 
    public void setRepuesto (Repuesto val) {
        this.mRepuesto = val;
    }

}

