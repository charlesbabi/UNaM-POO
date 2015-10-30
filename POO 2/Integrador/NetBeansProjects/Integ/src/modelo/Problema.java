package modelo;

import java.util.List;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.0FB75C3D-CE8D-08F4-F0B6-D9E48A4B6415]
// </editor-fold> 
public class Problema {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5FA91773-E46B-6B52-418D-15011FF49E21]
    // </editor-fold> 
    private int id;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.7A6C3043-E3BB-5BE0-B5D5-E4618AC22E0A]
    // </editor-fold> 
    private String descripcion;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D464F5D9-181B-D5CA-5F98-C297512CA5F2]
    // </editor-fold> 
    private int tiempo;
    
    private List reservas;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2F63F81A-84F0-3E66-3950-7237B2EF7FAD]
    // </editor-fold> 
    public Problema () {
    }

    public Problema(int id, String descripcion, int tiempo) {
        this.id = id;
        this.descripcion = descripcion;
        this.tiempo = tiempo;
    }



    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.DA5F4C4A-9897-88E2-4848-141C9298FAF2]
    // </editor-fold> 
    public String getDescripcion () {
        return descripcion;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1944F446-7547-B366-7A9C-31398EC5DB0A]
    // </editor-fold> 
    public void setDescripcion (String val) {
        this.descripcion = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.9CDA9312-6711-15C3-EE88-40A5FE11557E]
    // </editor-fold> 
    public int getId () {
        return id;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.BA36467D-3BF6-7DC8-F51C-25D632D3CBB4]
    // </editor-fold> 
    public void setId (int val) {
        this.id = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.392A6B44-D891-D7D5-D64D-63AE3DCD3319]
    // </editor-fold> 
    public int getTiempo () {
        return tiempo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FF553CC4-E26D-1DA1-32D8-07E16B77C2DE]
    // </editor-fold> 
    public void setTiempo (int val) {
        this.tiempo = val;
    }

    public List getReservas() {
        return reservas;
    }

    public void setReservas(List reservas) {
        this.reservas = reservas;
    }
    
    

}

