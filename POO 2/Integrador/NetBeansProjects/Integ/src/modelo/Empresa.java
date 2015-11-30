package modelo;


import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import persistencia.Persistencia;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.AE5E9171-F96A-E557-6D83-2E7D4707B2DA]
// </editor-fold> 
public class Empresa extends Observable {

    private static Persistencia persistencia = new Persistencia();

    private int id;
    private String nombre;    
    private String direccion;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E659E3FE-57A5-57CE-CC0B-FB614FE7CBBA]
    // </editor-fold> 
    private Map <String, Marca> marcas;    
    private Map <String, Modelo> modelos;
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2FA1DEB3-83BA-2C1F-DE03-AD182EF7F94E]
    // </editor-fold> 
    private Map <String, Vehiculo> vehiculos;
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D94FDA2B-D825-B80B-F93C-159DB0785050]
    // </editor-fold> 
    private Map <Integer, Cliente> clientes;
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.51E497F0-779B-87E0-F538-F49854B21032]
    // </editor-fold> 
    private Map especialistas;
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5179018B-0707-4C3C-5150-A1C8E3874599]
    // </editor-fold> 
    private Map servicios;
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E8577EC0-03C1-1D34-6BEE-12870761B647]
    // </editor-fold> 
    private Map repuestos;
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.66BBC733-C79F-024F-01D1-213500E62089]
    // </editor-fold> 
    private Map problemas;    
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.73733F03-DA45-8475-E64A-6B09951A02AA]
    // </editor-fold> 
    private List <Reserva> reservas;
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1816ED96-B77C-76F5-FD89-02309AB3D25E]
    // </editor-fold> 
    public Empresa () {
        this.marcas = new HashMap();
        this.modelos = new HashMap();
        this.vehiculos = new HashMap();
        this.clientes = new HashMap();
        this.especialistas = new HashMap();
        this.servicios = new HashMap();
        this.repuestos = new HashMap();
        this.problemas = new HashMap();
        this.reservas = new ArrayList();
    }

    public Empresa(String nombre, String direccion) {
        this();
        this.nombre = nombre;
        this.direccion = direccion;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Map getMarcas() {
        return marcas;
    }

    public void setMarcas(Map marcas) {
        this.marcas = marcas;
    }

    public Map getModelos() {
        return modelos;
    }

    public void setModelos(Map modelos) {
        this.modelos = modelos;
    }

    
    
    public Map getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Map vehiculos) {
        this.vehiculos = vehiculos;
    }

    public Map getClientes() {
        return clientes;
    }

    public void setClientes(Map clientes) {
        this.clientes = clientes;
    }

    public Map getEspecialistas() {
        return especialistas;
    }

    public void setEspecialistas(Map especialistas) {
        this.especialistas = especialistas;
    }

    public Map getServicios() {
        return servicios;
    }

    public void setServicios(Map servicios) {
        this.servicios = servicios;
    }

    public Map getRepuestos() {
        return repuestos;
    }

    public void setRepuestos(Map repuestos) {
        this.repuestos = repuestos;
    }

    public Map getProblemas() {
        return problemas;
    }

    public void setProblemas(Map problemas) {
        this.problemas = problemas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List getReservas() {
        return reservas;
    }

    public void setReservas(List reservas) {
        this.reservas = reservas;
    }

    //Metodos Cliente
    public void agregarCliente(int dni, String nombre, String apellido, String telefono) throws Exception{
        this.getClientes();
        if(!clientes.containsKey(dni)){
            Cliente unCliente = new Cliente(dni, apellido, nombre, telefono);
            clientes.put(dni, unCliente);            
            persistencia.update(this);
        }else{
            throw new Exception("La Persona con el DNI: " + dni + " ya se encuentra registrada.");
        }
    }

    public Cliente buscarCliente (int dni) throws Exception{
        this.getClientes();
        Cliente aux = null;
        aux = clientes.get(dni);
        if (aux == null){
            throw new Exception("El Cliente con DNI " + dni + " no se encuentra en el sistema.");
        }
        return aux;
    }

    //Metodos Vehiculo
    public Vehiculo buscarVehiculo (String patente) throws Exception{
        this.getVehiculos();
        Vehiculo aux = null;
        aux = (Vehiculo) vehiculos.get(patente);
        if (aux == null){
            throw new Exception("El Vehiculo " + patente + " no se encuentra en el sistema.");
        }
        return aux;
    }
    
    public Map buscarVehiculos (Cliente unCliente) throws Exception{
        Map retorno;
        if (unCliente.getVehiculos().size() > 0){
            retorno = unCliente.getVehiculos();
        }else{
            throw new Exception("El cliente no posee vehiculos cargados.");
        }
        return retorno;
    }


    //Metodos Especialistas
    public Map buscarEspecialistasPorMarca (Marca unaMarca) throws Exception{
        this.getEspecialistas();
        Map aux = unaMarca.getEspecialistas();
        if (aux.isEmpty()){
            throw new Exception("La Marca " + unaMarca.getNombre() + " no tiene especialistas asignados.");
        }
        return aux;
    }

    //Metodos Reserva
    public void confirmarReserva(Cliente unCliente, Vehiculo unVehiculo, Especialista unEspecialista, GregorianCalendar fecha, int duracion) throws Exception{
        this.getReservas();
        Reserva unaReserva = null;
        unaReserva = new Reserva(fecha, unVehiculo, duracion, unEspecialista, unCliente);
        //if(!this.getReservas().contains(unaReserva)){
            reservas.add(unaReserva);            
            persistencia.update(this);
            this.setChanged();
            this.notifyObservers();            
        //}else{
          //  throw new Exception("La empresa ya posee esa reserva.");
        //}      
        
        /*
            Iterator<Reserva> itReservas = unEspecialista.getReservas().iterator();
            boolean act = true;
            while(itReservas.hasNext() && act == true){
                Reserva temp = itReservas.next();
                if (temp != null && temp.estaOcupadoRangoHorario(fecha, duracion)){
                    act = false;
                }
            }
            if(act){
                           
            }else{
                throw new Exception("Ya existe un turno asignado en ese horario a ese especialista");
            }  
            */
            
    }
    
    public List buscarHorariosLibres(Especialista unEspecialista, GregorianCalendar fecha, int duracion) throws Exception{
        List<Horario> retorno;
        retorno = unEspecialista.buscarHorariosLibres(fecha, duracion);
        return retorno;
    }
}

