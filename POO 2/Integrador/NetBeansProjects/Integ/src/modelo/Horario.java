package modelo;

import java.util.GregorianCalendar;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.86A57DE9-1BE3-D2A1-DE26-76B4CD6A99D6]
// </editor-fold> 
public class Horario {
    
    private int id;
    
    GregorianCalendar entrada;
    GregorianCalendar salida;
    

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.BD009B4B-BF33-ACBA-9102-421D9BCB85B1]
    // </editor-fold> 
    public Horario () {
    }

    public Horario(int id, GregorianCalendar entrada, GregorianCalendar Salida) {
        this.id = id;
        this.entrada = entrada;
        this.salida = Salida;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GregorianCalendar getEntrada() {
        return entrada;
    }

    public void setEntrada(GregorianCalendar entrada) {
        this.entrada = entrada;
    }

    public GregorianCalendar getSalida() {
        return salida;
    }

    public void setSalida(GregorianCalendar Salida) {
        this.salida = Salida;
    }
        

}

