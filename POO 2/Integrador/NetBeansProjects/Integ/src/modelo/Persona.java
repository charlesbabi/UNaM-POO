package modelo;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.317FE082-359C-FF49-C289-D1467E3A1042]
// </editor-fold> 
public class Persona {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DBFBA994-441D-FC8C-FA19-8D65376CFF34]
    // </editor-fold> 
    private int dni;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1C5B1D1A-A448-B76B-EAE3-932252D6D99C]
    // </editor-fold> 
    private String apellido;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.29BC8DBF-347F-F574-5A4B-4E7D3879F2C2]
    // </editor-fold> 
    private String nombre;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.47B12D7A-30F1-E46A-5D71-6387EF7581F0]
    // </editor-fold> 
    private String telefono;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DB66D551-8BE1-444F-9719-E627825E1624]
    // </editor-fold> 
    public Persona () {
    }

    public Persona(int dni, String apellido, String nombre, String telefono) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.telefono = telefono;
    }


    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.26A88889-C6CC-E614-0B9E-2D7BB1D17D90]
    // </editor-fold> 
    public String getApellido () {
        return apellido;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.EF12D13A-B0A5-0325-73D4-091266213D41]
    // </editor-fold> 
    public void setApellido (String val) {
        this.apellido = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.ED2F33C6-C3F2-6761-7688-19C2A53AFEF4]
    // </editor-fold> 
    public int getDni () {
        return dni;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A6981DEC-DCBF-B86A-B205-6A36D0C1F600]
    // </editor-fold> 
    public void setDni (int val) {
        this.dni = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3203D448-46E8-FB07-5AF4-031CB3B8CF9E]
    // </editor-fold> 
    public String getNombre () {
        return nombre;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D9DA9813-D905-959E-59E5-BA39B567BB91]
    // </editor-fold> 
    public void setNombre (String val) {
        this.nombre = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.37DFD789-16BB-5069-F6CC-8BEAD231CE20]
    // </editor-fold> 
    public String getTelefono () {
        return telefono;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D3D400EF-998A-B750-EF2C-C5E02040F250]
    // </editor-fold> 
    public void setTelefono (String val) {
        this.telefono = val;
    }

}

