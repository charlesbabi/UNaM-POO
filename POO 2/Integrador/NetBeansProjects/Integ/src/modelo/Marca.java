package modelo;


import java.util.Map;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.06EDA6F1-996D-8A06-17D7-F594B9ABA5EE]
// </editor-fold> 
public class Marca {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.7687E182-F037-2CF7-43DF-D81565A43499]
    // </editor-fold> 
    private String nombre;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1B3B054C-46E4-C6E3-68B1-981B81689BBD]
    // </editor-fold> 
    private float valorPorHora;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.382DE849-B7D4-0032-453F-7DA19BEBDCDF]
    // </editor-fold> 
    private Map mModelo;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.358FC9FD-01DE-EF5F-54F5-C5567AE7E683]
    // </editor-fold> 
    public Marca () {
    }

    public Marca(String nombre, float valorPorHora) {
        this.nombre = nombre;
        this.valorPorHora = valorPorHora;
    }


    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F5EBB1BC-9079-596B-834D-3970A1218C85]
    // </editor-fold> 
    public Map getModelo () {
        return mModelo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.EEC70099-5353-D4AE-A932-04B8E4947425]
    // </editor-fold> 
    public void setModelo (Map val) {
        this.mModelo = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3604C9FB-7DB0-0FD9-0AAA-6CE5DCBD718D]
    // </editor-fold> 
    public String getNombre () {
        return nombre;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6162A122-3CA7-0479-3ADA-A16C23FD4AA5]
    // </editor-fold> 
    public void setNombre (String val) {
        this.nombre = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.03C2AED5-7C3F-8541-1216-3CF836BE67E2]
    // </editor-fold> 
    public float getValorPorHora () {
        return valorPorHora;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.883D64AA-CD48-B921-B1F1-4D71A2C08FE2]
    // </editor-fold> 
    public void setValorPorHora (float val) {
        this.valorPorHora = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.08F61CF9-EAD6-B29E-B7E6-77323925CCC0]
    // </editor-fold> 
    public void agregarModelo (String nombre) {
    }

}

