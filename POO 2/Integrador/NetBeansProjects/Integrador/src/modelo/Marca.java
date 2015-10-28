package modelo;

import java.util.HashMap;
import java.util.Map;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.E2BEC847-3512-9A32-4DED-BEF53300A717]
// </editor-fold> 
public class Marca {

    private int id;
    private float valorPorHora;
    private String nombre;
    private Map modelos;
    private Map especialistas;

    public Marca(int id, float valorPorHora, String nombre) {
        this();
        this.id = id;
        this.valorPorHora = valorPorHora;
        this.nombre = nombre;
    }

    public Marca () {
        this.modelos = new HashMap();
        this.especialistas = new HashMap();
    }

    public int getId () {
        return id;
    }

    public void setId (int val) {
        this.id = val;
    }

    public Map getModelos() {
        return modelos;
    }

    public void setModelos(Map modelos) {
        this.modelos = modelos;
    }

    public float getValorPorHora () {
        return valorPorHora;
    }

    public void setValorPorHora (float val) {
        this.valorPorHora = val;
    }

    public String getDescripcion() {
        return nombre;
    }

    public void setDescripcion(String descripcion) {
        this.nombre = descripcion;
    }

    public Map getEspecialistas() {
        return especialistas;
    }

    public void setEspecialistas(Map especialistas) {
        this.especialistas = especialistas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Metodos Especificos.
    public void asociarModelo(Modelo unModelo) throws Exception{
        this.getModelos();
        if(!this.modelos.containsKey(unModelo.getNombre())){
            this.modelos.put(unModelo.getNombre(), unModelo);
        }else{
            throw new Exception("El modelo " + unModelo.getNombre() +  " ya se encuentra asociado a " + this.getNombre() + ".");
        }
    }
    
    public void eliminarModelo(Modelo unModelo) throws Exception{
        this.getModelos();
        if(this.modelos.containsKey(unModelo.getNombre())){
            this.modelos.remove(unModelo.getNombre());
        }else{
            throw new Exception("El modelo " + unModelo.getNombre() +  " no se encuentra asociado a " + this.getNombre() + ".");
        }
    }
    
    public void asociarEspecialista(Especialista unEspecialista){
        this.getEspecialistas();
        if(!especialistas.containsKey(unEspecialista.getDni())){
            especialistas.put(unEspecialista.getDni(), unEspecialista);
            Empresa.getPersistencia().update(this);
        }
    }

}

