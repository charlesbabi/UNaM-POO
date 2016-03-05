package model;


public class Repuesto {

    private int id;

    private String descripcion;

    private float valor;

    private int stock;

    public Repuesto () {
    }

    public Repuesto(int id, String descripcion, float valor, int stock) {
        this.id = id;
        this.descripcion = descripcion;
        this.valor = valor;
        this.stock = stock;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.CF3303D3-937F-C703-B255-C7F6D645D54E]
    // </editor-fold> 
    public String getDescripcion () {
        return descripcion;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.7B3D9520-FF88-AE65-84D3-0060BFF72DE4]
    // </editor-fold> 
    public void setDescripcion (String val) {
        this.descripcion = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E5CCFE42-8444-6F48-C8BC-5CF9A0496A8C]
    // </editor-fold> 
    public int getId () {
        return id;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.DDE08521-8E69-75C5-085A-E06C199A4A09]
    // </editor-fold> 
    public void setId (int val) {
        this.id = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.69D3ADDE-5B82-C59A-EC27-C67F44046C85]
    // </editor-fold> 
    public int getStock () {
        return stock;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C661BD02-1741-D30E-6985-19B8FC036C95]
    // </editor-fold> 
    public void setStock (int val) {
        this.stock = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.5CEE4D57-7D00-7377-8CA7-56C42CC5991F]
    // </editor-fold> 
    public float getValor () {
        return valor;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E9C1BBF0-FAD3-9118-2660-B677B72582B1]
    // </editor-fold> 
    public void setValor (float val) {
        this.valor = val;
    }

}

