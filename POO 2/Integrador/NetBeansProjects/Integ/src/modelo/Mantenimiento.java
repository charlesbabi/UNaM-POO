package modelo;


import java.util.ArrayList;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.B6D0241D-1213-BA9F-BC08-EF8876D0B0EC]
// </editor-fold> 
public class Mantenimiento extends Servicio {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.89ED5165-7D06-624F-EB8B-186A9DE3BEE6]
    // </editor-fold> 
    public Mantenimiento () {
    }

    public Mantenimiento(String observacion, int id, ArrayList mRepuestoLinea, Reserva mReserva) {
        super(observacion, id, mRepuestoLinea, mReserva);
    }

}

