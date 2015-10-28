
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.999D8A40-1B33-05E8-57AF-BA76C8727C24]
// </editor-fold> 
public class Modelo {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1D6F152F-D66D-F514-2AE7-7DA27CEB7A47]
    // </editor-fold> 
    private String nombre;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.CB0713F7-FB25-41F2-2B5E-76BA70C51B4F]
    // </editor-fold> 
    private Marca mMarca;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.98219E0C-4FB2-E7D6-AC76-F9F14589D231]
    // </editor-fold> 
    public Modelo () {
    }

    public Modelo(String nombre, Marca mMarca) {
        this.nombre = nombre;
        this.mMarca = mMarca;
    }


    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A81EABAD-DFF4-A657-8733-270C89547B28]
    // </editor-fold> 
    public Marca getMarca () {
        return mMarca;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.2153F403-902A-9261-A373-60DB270057B4]
    // </editor-fold> 
    public void setMarca (Marca val) {
        this.mMarca = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C9B35013-4529-2D3B-31E8-851CA23E5D5F]
    // </editor-fold> 
    public String getNombre () {
        return nombre;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C5BE8A6B-280D-E13D-CCFB-143792D024EE]
    // </editor-fold> 
    public void setNombre (String val) {
        this.nombre = val;
    }

}

