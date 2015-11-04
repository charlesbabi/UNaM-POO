package modelo;


import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.BF7D3B20-31BA-428B-3E38-A5554B9D4D03]
// </editor-fold> 
public class Vehiculo {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0F4417CC-970F-0CF2-9880-2427B76EFD3D]
    // </editor-fold> 
    private String patente;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.EA524776-4994-DBE9-D3DB-C7800FC1D779]
    // </editor-fold> 
    private GregorianCalendar fechaDeCompra;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5D651E12-FE4F-9DE8-1C58-BF051000728D]
    // </editor-fold> 
    private Modelo mModelo;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B7CAE72E-2886-B7EB-9765-66F2B7002475]
    // </editor-fold> 
    public Vehiculo () {
    }

    public Vehiculo(String patente, GregorianCalendar fechaDeCompra, Modelo mModelo) {
        this.patente = patente;
        this.fechaDeCompra = fechaDeCompra;
        this.mModelo = mModelo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E586F7DF-EE56-3958-E580-76045BB18D74]
    // </editor-fold> 
    public GregorianCalendar getFechaDeCompra () {
        return fechaDeCompra;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.AA03F366-C980-BC9B-45D6-D2F12CF0FEAB]
    // </editor-fold> 
    public void setFechaDeCompra (GregorianCalendar val) {
        this.fechaDeCompra = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.36C1DD1F-DD0A-1F5C-D0D5-724D93F6ADCC]
    // </editor-fold> 
    public Modelo getModelo () {
        return mModelo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.453CE9B1-89F8-6BED-AE02-13E32B5E1108]
    // </editor-fold> 
    public void setModelo (Modelo val) {
        this.mModelo = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.DE51FEEB-7102-F90B-3711-6E514B2F9AAE]
    // </editor-fold> 
    public String getPatente () {
        return patente;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.AB5E61BA-EF99-D119-AF8B-C6856CE4CAD4]
    // </editor-fold> 
    public void setPatente (String val) {
        this.patente = val;
    }
    
    @Override
    public String toString(){
        SimpleDateFormat sdf = new SimpleDateFormat("MMMMM/yyyy");
        return this.patente + " " + this.mModelo.getNombre() + " " + sdf.format(this.fechaDeCompra.getTime());        
    }

}

