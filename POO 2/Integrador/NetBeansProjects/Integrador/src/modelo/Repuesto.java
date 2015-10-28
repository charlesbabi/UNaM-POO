package modelo;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.CCD3F5A3-0767-9C7C-1CAD-273D3E99F22F]
// </editor-fold> 
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    //Metodos Especificos
    public void sumarStock(int cant){
        this.stock += cant;
    }

    public void restarStock(int cant) throws Exception{
        if(this.stock - cant >= 0){
            this.stock -= cant;
        }else{
            throw new Exception("No posee stock suficiente de este respuesto");
        }
    }

    public boolean isClave(int id){
        boolean respuesta = false;
        if (this.id == id){
            respuesta = true;
        }
        return respuesta;
    }
}

