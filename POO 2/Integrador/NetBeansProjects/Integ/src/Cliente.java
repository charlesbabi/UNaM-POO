
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.2F2D3AC0-5485-E101-6B4A-6DCA21AF7CF8]
// </editor-fold> 
public class Cliente extends Persona {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F816D239-9E1B-E0DD-FC03-2E27D9414B03]
    // </editor-fold> 
    private Vehiculo mVehiculo;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.647A70B8-8FAB-78D7-B548-A56B3A2D5EFB]
    // </editor-fold> 
    public Cliente () {
    }

    public Cliente(int dni, String apellido, String nombre, String telefono, Vehiculo mVehiculo) {
        super(dni, apellido, nombre, telefono);
        this.mVehiculo = mVehiculo;
    }


    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8C204CE4-FC48-3FAB-95E7-730C9387CAFD]
    // </editor-fold> 
    public Vehiculo getVehiculo () {
        return mVehiculo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.107F7032-DA4E-2546-8D21-30BC0EA4F2DC]
    // </editor-fold> 
    public void setVehiculo (Vehiculo val) {
        this.mVehiculo = val;
    }

}

