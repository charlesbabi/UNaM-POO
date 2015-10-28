package modelo;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.9E3E7F75-3261-54ED-09DE-511014ECC1A7]
// </editor-fold>

import java.util.Collection;
import persistencia.Persistencia;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Empresa {

    private static Persistencia persistencia = new Persistencia();

    private int id;
    private String nombre;
    private String direccion;

    private Map servicios;
    private Map marcas;
    private Map personas;
    private Map modelos; 
    private Map turnos;
    private Map repuestos;
    private Map vehiculos;
    private Map problemas;    

    public Empresa(int id, String nombre, String direccion) {
        this();
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Empresa () {
        this.servicios = new HashMap();
        this.marcas = new HashMap();
        this.personas = new HashMap();
        this.modelos = new HashMap();
        this.turnos = new HashMap();
        this.repuestos = new HashMap();
        this.vehiculos = new HashMap();
        this.problemas = new HashMap();
    }

    public static Persistencia getPersistencia() {
        return persistencia;
    }

    public static void setPersistencia(Persistencia persistencia) {
        Empresa.persistencia = persistencia;
    }   
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Map getServicios() {
        return servicios;
    }

    public void setServicios(Map servicios) {
        this.servicios = servicios;
    }

    public Map getMarcas() {
        return marcas;
    }

    public void setMarcas(Map marcas) {
        this.marcas = marcas;
    }

    public Map getPersonas() {
        return personas;
    }

    public void setPersonas(Map personas) {
        this.personas = personas;
    }

    public Map getModelos() {
        return modelos;
    }

    public void setModelos(Map modelos) {
        this.modelos = modelos;
    }

    public Map getTurnos() {
        return turnos;
    }

    public void setTurnos(Map turnos) {
        this.turnos = turnos;
    }

    public Map getRepuestos() {
        return repuestos;
    }

    public void setRepuestos(Map repuestos) {
        this.repuestos = repuestos;
    }

    public Map getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Map vehiculos) {
        this.vehiculos = vehiculos;
    }

    public Map getProblemas() {
        return problemas;
    }

    public void setProblemas(Map problemas) {
        this.problemas = problemas;
    } 
    
    
    //Metodos Especificos..        
    //Metodos Marca
    public void agregarMarca (int id, String nomb, float valorPorHora) throws Exception{
        this.getMarcas();
        nomb = nomb.toUpperCase();
        if(!marcas.containsKey(nomb)){
            Marca aux = new Marca(id, valorPorHora, nomb);
            marcas.put(nomb, aux);
            persistencia.insert(aux);
            persistencia.update(this);            
        }else{
            throw new Exception("la marca " + nomb + " se encuentra en el sistema.");
        }
    }
    
    public void eliminarMarca (Marca unaMarca) throws Exception{
        this.getMarcas();
        if(marcas.containsKey(unaMarca.getNombre())){
            marcas.remove(unaMarca.getNombre());
            persistencia.delete(unaMarca);
            persistencia.update(this);            
        }else{
            throw new Exception("la marca " + unaMarca.getNombre() + " no se pudo eliminar del sistema.");
        }
    }
    
    public Marca buscarMarca (String nomb) throws Exception{
        this.getMarcas();
        Marca aux = null;
        aux = (Marca) marcas.get(nomb);
        if (aux == null){
            throw new Exception("la marca " + id + " no se encuentra en el sistema.");
        }
        return aux;
    }
    
    //Metodos Modelos    
    public void agregarModelo(String nombre, Marca mMarca) throws Exception{
        if(mMarca != null){
           Modelo aux = new Modelo(2, nombre, mMarca); //el 2 es un valor random;             
           persistencia.insert(aux);
           Modelo temp = null;           
           temp = (Modelo) persistencia.get("modelo.Modelo", nombre);
           this.modelos.put(temp.getId(), temp);
           persistencia.update(aux.getMarca()); 
           persistencia.update(this);               
        }else{
            throw new Exception("Debe seleccionar una marca para continuar");
        }  
    }
    
    public Modelo buscarModelo(String nombre) throws Exception{
        this.getModelos();
        Modelo auxBusqueda = null;
        Modelo aux = null;
        Iterator it = modelos.values().iterator();
        while(it.hasNext()){
            auxBusqueda = ((Modelo)it.next());
            if(auxBusqueda.getNombre().equals(nombre)){
                aux = (Modelo) modelos.get(auxBusqueda.getId());
                it = Iterator.class.newInstance();
            }
        }        
        if (aux == null){
            throw new Exception("el Modelo " + nombre + " no se encuentra en el sistema.");
        }
        return aux;
    }
    
    public Modelo buscarModelo(int id) throws Exception{
        this.getModelos();
        Modelo aux = null;        
        aux = (Modelo) modelos.get(id);
        if (aux == null){
            throw new Exception("el Modelo " + id + " no se encuentra en el sistema.");
        }
        return aux;
    }
    
    public void eliminarModelo(Modelo unModelo) throws Exception{
        this.getModelos();
        if(modelos.containsKey(unModelo.getId())){           
            unModelo.getMarca().eliminarModelo(unModelo);
            persistencia.delete(unModelo);
            this.modelos.remove(unModelo.getId());                              
            persistencia.update(unModelo.getMarca());
            persistencia.update(this);            
        }else{
            throw new Exception("El Modelo " + unModelo.getNombre() + " no se pudo eliminar del sistema.");
        }
    }

    
    //Metodos Cliente
    public void agregarCliente(int dni, String nombre, String apellido, String telefono) throws Exception{
        this.getPersonas();
        if(!personas.containsKey(dni)){
            Persona unCliente = new Cliente(dni, nombre, apellido, telefono);
            personas.put(dni, unCliente);
            persistencia.insert(unCliente);
            persistencia.update(this);
        }else{
            throw new Exception("La Persona con el DNI: " + dni + " ya se encuentra registrada.");
        }
    }

    
    
    public void agregarVehiculo(String patente, GregorianCalendar fechaDeVenta, Modelo mModelo) throws Exception{
        this.getVehiculos();
        if(!vehiculos.containsKey(patente)){
            Vehiculo aux = new Vehiculo(patente, fechaDeVenta, mModelo);
            vehiculos.put(patente, aux);
            persistencia.update(this);
        }else{
            throw new Exception("El vehiculo " + patente + " ya se encuentra en el sistema");
        }
    }

    

    public void agregarRepuesto(int id, String nombre, float valor, int stock) throws Exception{
        this.getRepuestos();
        if(!repuestos.containsKey(id)){
            Repuesto aux = new Repuesto(id, nombre, valor, stock);
            repuestos.put(id, aux);
            persistencia.update(this);
        }else{
            throw new Exception("Ya existe ese repuesto en el sistema.");
        }
    }

    
    public void agregarEspecialista(int dni, String nombre, GregorianCalendar horarioEntrada,GregorianCalendar horarioSalida, Marca unaMarca) throws Exception{
        if(!personas.containsKey(dni)){
            //Persona aux = new Especialista(dni, nombre, horarioEntrada, horarioSalida, unaMarca);
            //personas.put(dni, aux);
        }else{
            throw new Exception("La Persona ya se encuentra registrada.");
        }
    }

    public void agregarProblema(int id, String descripcion, int tiempo) throws Exception{
        if(!problemas.containsKey(id)){
            Problema aux = new Problema(id, descripcion, tiempo);
            problemas.put(id, aux);
        }else{
            throw new Exception("Ya se agrego este Concepto de Problema al Sistema");
        }
    }

    public void asignarTurno(int id, int duracion, GregorianCalendar inicio, String descripcion, Servicio servicio, Especialista especialista, short estado) throws Exception{
        if(!this.turnos.containsKey(id)){
            Turno aux = new Turno(id,duracion,inicio, descripcion, servicio, especialista, estado);
            turnos.put(id, aux);
        }else{
            throw new Exception("Este turno ya esta registrado");
        }
    }
}

