package modelo;

import java.util.HashMap;
import java.util.Map;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.2F2D3AC0-5485-E101-6B4A-6DCA21AF7CF8]
// </editor-fold> 
public class Cliente extends Persona {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F816D239-9E1B-E0DD-FC03-2E27D9414B03]
    // </editor-fold> 
    private Map vehiculos;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.647A70B8-8FAB-78D7-B548-A56B3A2D5EFB]
    // </editor-fold> 
    public Cliente () {
    }

    public Cliente(int dni, String apellido, String nombre, String telefono) {
        super(dni, apellido, nombre, telefono);
        this.vehiculos = new HashMap();
    }

    public Map getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Map vehiculos) {
        this.vehiculos = vehiculos;
    }

}

