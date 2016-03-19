package model;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import Persist.Persistencia;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Empresa extends Observable {

   private static Persistencia persistencia = new Persistencia();

   private int id;
   private String nombre;
   private String direccion;

   private Map<String, Vehiculo> vehiculos;
   private Map<String, Marca> marcas;
   private Map<String, Modelo> modelos;
   private Map<String, Cliente> clientes;
   private Map<String, Especialista> especialistas;
   private Map servicios;   
   private Map repuestos;
   private Map <Integer, Problema> problemas;
   
   private List <Reserva> reservas;
   private Map <String, Usuario> usuarios;

   public Empresa () {
        this.marcas = new HashMap();
        this.modelos = new HashMap();
        this.vehiculos = new HashMap <String, Vehiculo>();
        this.clientes = new HashMap <String, Cliente>();
        this.especialistas = new HashMap <String, Especialista>();
        this.servicios = new HashMap();
        this.repuestos = new HashMap();
        this.problemas = new HashMap();
        this.reservas = new ArrayList();
        this.usuarios = new HashMap();        
    }
   
    public Empresa(String nombre, String direccion) {
        this();
        this.nombre = nombre;
        this.direccion = direccion;
        Empresa.getPersistencia().insert(this);
    }
    
    
   // Metodos Vehiculo

   public void agregarVehiculo (String patente, GregorianCalendar fechaDeCompra, Modelo modelo, Cliente unCliente) throws Exception {
       this.getVehiculos();
       boolean aux = this.existeVehiculo(patente);
       if(aux == false){
           Vehiculo vehiculo = new Vehiculo ( patente,  fechaDeCompra,  modelo, unCliente);
           this.vehiculos.put(patente, vehiculo);
           persistencia.update(this);
       }else{
           throw new Exception ("El Vehiculo "+ modelo.getNombre()+ " - " + patente + " ya se encuentra registrado.");
       }
   }
   
   public Vehiculo buscarVehiculo(String patente) throws Exception {
       this.getVehiculos();
       Vehiculo aux = null;
       aux = (Vehiculo) vehiculos.get(patente);
       if (aux == null){
           throw new Exception("El Vehiculo " + patente + " no se encuentra en el sistema.");
       }
       return aux;
   } 
   
   public List buscarVehiculos(Cliente unCliente) throws Exception {
       //this.getVehiculos();
       List retorno = unCliente.getVehiculos();
       if (retorno.size() <= 0){
           throw new Exception("El cliente no posee vehiculos cargados.");
       }
       return retorno;
   }
   
   public boolean existeVehiculo(String patente) throws Exception {
       this.getVehiculos();
       boolean retorno = false;
       Vehiculo aux = vehiculos.get(patente);
       if (aux != null){
           retorno = true;
       }
       return retorno;
   } 
   
   public void modificarVehiculo (String patente, GregorianCalendar fechaDeCompra, Modelo modelo, Cliente unCliente) throws Exception {
       this.getVehiculos();
       Vehiculo aux = this.vehiculos.get(patente);
       if (aux == null){
           throw new Exception("El Vehiculo con Patente " + patente + " no se encuentra en el sistema.");
       }else{
           aux.setPatente(patente);
           aux.setFechaDeCompra(fechaDeCompra);
           aux.setModelo(modelo);
           aux.setCliente(unCliente);
           persistencia.update(aux);
       }
   }

   
   // Metodos Marcas
   
   public void agregarMarca(String nombre, float valorPorHora) throws Exception{
       this.getMarcas();
       nombre = nombre.toUpperCase();
       boolean aux = existeMarca(nombre);
       if (aux == false){
           Marca unaMarca = new Marca(nombre, valorPorHora);
           this.marcas.put(nombre, unaMarca);
           persistencia.update(this);
       }else{
           throw new Exception("La Marca "+ nombre +" ya se encuentra registrada");
       }
   }
   
   public Marca buscarMarca(String nombre) throws Exception{
       this.getMarcas();
       Marca aux = this.marcas.get(nombre.toUpperCase());
       if (aux == null){
           throw new Exception("La Marca solicitada no existe.");
       }
       return aux;
   }
   
   public boolean existeMarca (String nombre) throws Exception{
       boolean retorno = false;
       this.getMarcas();
       Marca aux = this.marcas.get(nombre.toUpperCase());
       if (aux != null){
           retorno = true;
       }
       return retorno;
   }
   
   // Metodos Modelos
   
   public void agregarModelo(String nombre, Marca marca) throws Exception{
       this.getModelos();
       nombre = nombre.toUpperCase();
       boolean aux = existeModelo(nombre, marca);
       if (aux == false) {
           Modelo unModelo = new Modelo(nombre, marca);
           this.modelos.put(nombre, unModelo);
           persistencia.update(this);
       } else {
           throw new Exception("El Modelo "+ nombre +" ya se encuentra registrada " + "para la marca " + marca.getNombre() + ".");
       }
   }
   
   public Modelo buscarModelo(String nombre) throws Exception{
       this.getMarcas();
       Modelo aux = this.modelos.get(nombre);
       if (aux == null){
           throw new Exception("El modelo solicitada no existe.");
       }
       return aux;
   }
   
   public boolean existeModelo(String nombre, Marca marca) throws Exception{
       this.getMarcas();
       boolean retorno = false;
       Modelo aux = this.modelos.get(nombre);
       if (aux != null && aux.getMarca() == marca){
           retorno = true;
       }
       return retorno;
   }
   
   // Metodos Cliente

   public void agregarCliente(String dni, String nombre, String apellido, GregorianCalendar fechaDeNacimiento, String telefono) throws Exception {
       this.getClientes();
       nombre = nombre.toUpperCase();
       apellido = apellido.toUpperCase();
       boolean asd = existeCliente(dni);
       if(asd == false){
           Cliente unCliente = new Cliente(dni, apellido, nombre, fechaDeNacimiento, telefono);
           clientes.put(dni, unCliente);
           persistencia.update(this);
       }else{
           throw new Exception("La Persona con el DNI: " + dni + " ya se encuentra registrada.");
       }
   }

   public Cliente buscarCliente(String dni) throws Exception {
       this.getClientes();
       Cliente aux = this.clientes.get(dni);
       if (aux == null){
           throw new Exception("El Cliente con DNI " + dni + " no se encuentra en el sistema.");
       }
       return aux;
   }
   
   public boolean existeCliente(String dni) throws Exception {
       this.getClientes();
       boolean retorno = false;
       Cliente aux = this.clientes.get(dni);
       if (aux != null){
           retorno = true;
       }
       return retorno;
   }   
   
   public void eliminarCliente(String dni)throws Exception {
       this.getClientes();
       Cliente aux = buscarCliente(dni);
       if (aux != null){
           boolean estado = false;
           aux.setEstado(estado);
           persistencia.update(aux);
       }else{
           throw new Exception("El Cliente con DNI " + dni + " no se encuentra en el sistema.");
       }
   }   
      
   public void comprobarEstadoActivoCliente(String dni)throws Exception {
       this.getClientes();
       Cliente aux = buscarCliente(dni);
       if (aux != null){
           if(aux.getEstado() == false){
               throw new Exception("El Cliente con DNI " + dni + " esta dado de baja en el sistema.");
           }
       }else{
           throw new Exception("El Cliente con DNI " + dni + " no se encuentra en el sistema.");
       }
   }
   
   public void cambiarEstado(Persona unaPersona)throws Exception {
       unaPersona.cambiarEstado();
       persistencia.update(unaPersona);
       persistencia.update(this);
   }
   
   public void modificarCliente(String dni, String nombre, String apellido, GregorianCalendar fechaDeNacimiento, String telefono) throws Exception {
       this.getClientes();
       Cliente aux = this.clientes.get(dni);
       nombre = nombre.toUpperCase();
       apellido = apellido.toUpperCase();
       if (aux == null){
           throw new Exception("El Cliente con DNI " + dni + " no se encuentra en el sistema.");
       }else{
           aux.setNombre(nombre);
           aux.setApellido(apellido);
           aux.setFechaDeNacimiento(fechaDeNacimiento);
           aux.setTelefono(telefono);
           persistencia.update(aux);
       }
   }

    // Metodos Especilista
   
   public void agregarEspecialista (String dni, String apellido, String nombre, GregorianCalendar fechaDeNacimiento, String telefono, Marca unaMarca) throws Exception{
       this.getEspecialistas();
       boolean asd = existeEspecialista(dni);
       if(asd == false){
           Especialista unEspecialista = new Especialista( dni,  apellido,  nombre, fechaDeNacimiento, telefono, unaMarca);
           especialistas.put(dni, unEspecialista);
           persistencia.update(this);
       }else{
           throw new Exception("El especialista con numero de identidad "+ dni +" ya se encuentra registrado en el sistema.");
       }
   }
   
   public Especialista buscarEspecialista (String dni) throws Exception{
       this.getEspecialistas();
       Especialista aux = this.especialistas.get(dni);
       if(aux == null){
           throw new Exception("El especialista con dni " + dni + " no se encuentra registrado en el sistema.");
       }
       return aux;
   }

   public boolean existeEspecialista(String dni) throws Exception {
       this.getEspecialistas();
       boolean retorno = false;
       Especialista aux = this.especialistas.get(dni);
       if (aux != null){
           retorno = true;
       }
       return retorno;
   }
   
   public void modificarEspecialista(String dni, String nombre, String apellido, GregorianCalendar fechaDeNacimiento, String telefono, Marca unaMarca) throws Exception {
       this.getClientes();
       Especialista aux = this.especialistas.get(dni);
       nombre = nombre.toUpperCase();
       apellido = apellido.toUpperCase();
       if (aux == null){
           throw new Exception("El Especialista con DNI " + dni + " no se encuentra en el sistema.");
       }else{
           aux.setNombre(nombre);
           aux.setApellido(apellido);
           aux.setFechaDeNacimiento(fechaDeNacimiento);
           aux.setTelefono(telefono);
           aux.setMarca(unaMarca);
           persistencia.update(aux);
       }
   }
   
   /**Genera una agena a partir de una fecha inicial hasta la final, en un especialista determinado con un intervalo determinado.
    * 
    * @param unEspecialista
    * @param inicio
    * @param fin
    * @param intervalo
    * @throws Exception 
    */
   public void generarAgenda(Especialista unEspecialista, GregorianCalendar inicio, GregorianCalendar fin, int intervalo) throws Exception {
       this.getEspecialistas();
       Horario unHorario;
       Dia unDia;
       while(inicio.before(fin) || inicio.equals(fin)){
           unDia = new Dia(inicio);
           SimpleDateFormat sdf = new SimpleDateFormat();
           while(inicio.get(Calendar.HOUR_OF_DAY) <= fin.get(Calendar.HOUR_OF_DAY) && inicio.get(Calendar.MINUTE) <= fin.get(Calendar.MINUTE) ){
               unHorario = new Horario(inicio, fin);
               inicio.add(Calendar.MINUTE, intervalo);
           }
           
       }
   }

   
   /** Metodos Especialistas
    *
    * @param unaMarca
    * @exception Exception
    * @pdOid 288d0c83-9edc-449c-9c44-72c475abd712 */
   public Map buscarEspecialistasPorMarca(Marca unaMarca) throws Exception {
       this.getEspecialistas();
       Map aux = unaMarca.getEspecialistas();
       if (aux.isEmpty()){
           throw new Exception("La Marca " + unaMarca.getNombre() + " no tiene especialistas asignados.");
       }
       return aux;
   }

   /** Metodos Reserva
    *
    * @param unCliente
    * @param unVehiculo
    * @param unEspecialista
    * @param fecha
    * @param duracion
    * @exception Exception
    * @pdOid 4efe5309-ea75-48a9-a966-bf64a67c2839 */
   public void confirmarReserva(Cliente unCliente, Vehiculo unVehiculo, Especialista unEspecialista, GregorianCalendar fecha, int duracion) throws Exception {

   }

   /** @param unEspecialista
    * @param fecha
    * @param duracion
    * @exception Exception
    * @pdOid ee73084e-9816-422a-8e5e-1ca636d5625d */
   public List buscarHorariosLibres(Especialista unEspecialista, GregorianCalendar fecha, int duracion) throws Exception {
       List<Horario> retorno;
       retorno = unEspecialista.buscarHorariosLibres(fecha, duracion);
       return retorno;
   }

   /** @param descripcion
    * @param duracion
    * @pdOid e9d631ca-8162-4970-a55e-00bd88af3312 */
   public void agregarProblema(String descripcion, int duracion) {
      // TODO: implement
   }

   /** @param nombreUsuario
    * @pdOid e09a0d52-7f40-4d59-b0ca-929b33381b95 */
   public Usuario buscarUsuario(String nombreUsuario) {
      // TODO: implement
      return null;
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

    public Map<String, Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Map<String, Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public Map<String, Marca> getMarcas() {
        return marcas;
    }

    public void setMarcas(Map<String, Marca> marcas) {
        this.marcas = marcas;
    }

    public Map<String, Modelo> getModelos() {
        return modelos;
    }

    public void setModelos(Map<String, Modelo> modelos) {
        this.modelos = modelos;
    }

    public Map<String, Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Map<String, Cliente> clientes) {
        this.clientes = clientes;
    }

    public Map<String, Especialista> getEspecialistas() {
        return especialistas;
    }

    public void setEspecialistas(Map<String, Especialista> especialistas) {
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

    public Map<Integer, Problema> getProblemas() {
        return problemas;
    }

    public void setProblemas(Map<Integer, Problema> problemas) {
        this.problemas = problemas;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public Map<String, Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Map<String, Usuario> usuarios) {
        this.usuarios = usuarios;
    }

   

}