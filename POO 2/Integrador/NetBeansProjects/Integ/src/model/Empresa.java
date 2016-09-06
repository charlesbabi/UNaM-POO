/***********************************************************************
 * Module:  Empresa.java
 * Author:  Babi, John Charles
 * Purpose: Defines the Class Empresa
 ***********************************************************************/

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
import java.util.Iterator;


public class Empresa extends Observable {

    //Se declara static para poder usarla sin necesidad de tener una instancia de persistencia.
   private static Persistencia persistencia = new Persistencia();

   private int id;
   private String nombre;
   private String direccion;

   private Map<String, Vehiculo> vehiculos;
   private Map<String, Marca> marcas;
   private Map<String, Modelo> modelos;
   private Map<String, Cliente> clientes;
   private Map<String, Especialista> especialistas;
   private List <Servicio> servicios;   
   private List <Repuesto> repuestos;
   private List <Problema> problemas;
   
   private List <Reserva> reservas;
   private Map <String, Usuario> usuarios;

   /** Constructor Nulo, inicializa todas las colecciones.
    * 
    */
   public Empresa () {
        this.marcas = new HashMap();
        this.modelos = new HashMap();
        this.vehiculos = new HashMap <String, Vehiculo>();
        this.clientes = new HashMap <String, Cliente>();
        this.especialistas = new HashMap <String, Especialista>();
        this.servicios = new ArrayList();
        this.repuestos = new ArrayList();
        this.problemas = new ArrayList();
        this.reservas = new ArrayList();
        this.usuarios = new HashMap();        
    }
   /** Crea una empresa e inicializa todas las colecciones
    * 
    * @param nombre
    * @param direccion 
    */
    public Empresa(String nombre, String direccion) {
        this();
        this.nombre = nombre;
        this.direccion = direccion;
        Empresa.getPersistencia().insert(this);
    }
    
    
   // Metodos Vehiculo

    /** Crea un vehiculo y lo agrega a la lista de la empresa.
     * 
     * @param patente
     * @param fechaDeCompra
     * @param modelo
     * @param unCliente
     * @throws Exception 
     */
   public void agregarVehiculo (String patente, GregorianCalendar fechaDeCompra, Modelo modelo, Cliente unCliente) throws Exception {
       this.getVehiculos();
       //pregunta si no existe el vehiculo, entonces lo agrega
       if(!this.existeVehiculo(patente)){
           Vehiculo vehiculo = new Vehiculo ( patente,  fechaDeCompra,  modelo, unCliente);
           this.vehiculos.put(patente, vehiculo);
           persistencia.update(this);
       }else{
           // si existe lanza una excepcion
           throw new Exception ("El Vehiculo "+ modelo.getNombre()+ " - " + patente + " ya se encuentra registrado.");
       }
   }
   
   /** Busca un vehiculo por la patente, si no existe en la empresa lanza una excepcion.
    * 
    * @param patente
    * @return
    * @throws Exception 
    */
   public Vehiculo buscarVehiculo(String patente) throws Exception {
       this.getVehiculos();
       Vehiculo aux = null;
       aux = (Vehiculo) vehiculos.get(patente);
       if (aux == null){
           throw new Exception("El Vehiculo " + patente + " no se encuentra en el sistema.");
       }
       return aux;
   }
   
   /** Busca los vehiculo por cliente. si no posee vehiculos lanza una excepcion.
    * 
    * @param unCliente
    * @return
    * @throws Exception 
    */
   public List buscarVehiculosPorCliente(Cliente unCliente) throws Exception {
       this.getVehiculos();
       //Le pide al cliente sus vehiculos.
       List retorno = unCliente.obtenerVehiculos();
       //pregunta si el retorno es igual a null, entonces lanza una excepcion.
       if (retorno == null){
           throw new Exception("El cliente no posee vehiculos cargados.");
       }
       //caso de no saltar la excepcion devuelve los vehiculos del cliente.
       return retorno;
   }
   
   /** Devulve verdadero si existe el vehiculo.
    * 
    * @param patente
    * @return 
    */
   public boolean existeVehiculo(String patente){
       this.getVehiculos();
       boolean retorno = false;
       Vehiculo aux = vehiculos.get(patente);
       if (aux != null){
           retorno = true;
       }
       return retorno;
   } 
   
   /** Modifica el vehiculo con los datos dados, en caso de no existir el vehiculo lanza una excepcion.
    * 
    * @param patente
    * @param fechaDeCompra
    * @param modelo
    * @param unCliente
    * @throws Exception 
    */
   public void modificarVehiculo (String patente, GregorianCalendar fechaDeCompra, Modelo modelo, Cliente unCliente) throws Exception {
       this.getVehiculos();
       if(this.existeVehiculo(patente)){
           Vehiculo aux = this.buscarVehiculo(patente);
           aux.setPatente(patente);
           aux.setFechaDeCompra(fechaDeCompra);
           aux.setModelo(modelo);
           aux.setCliente(unCliente);
           persistencia.update(aux);
       }else{
           throw new Exception("El Vehiculo con Patente " + patente + " no se encuentra en el sistema.");
       }
   }

   
   // Metodos Marcas
   
   /** Crea una Marca y la agrega al sistema.
    * 
    * @param nombre
    * @param valorPorHora
    * @throws Exception 
    */
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
   
   /** Busca y devuelve una marca en la empresa, si no existe lanza una excepcion.
    * 
    * @param nombre
    * @return
    * @throws Exception 
    */
   public Marca buscarMarca(String nombre) throws Exception{
       this.getMarcas();
       Marca aux = this.marcas.get(nombre.toUpperCase());
       if (aux == null){
           throw new Exception("La Marca solicitada no existe.");
       }
       return aux;
   }
   
   /** Retorna un boolean, verdadero si existe la marca.
    * 
    * @param nombre
    * @return
    * @throws Exception 
    */
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
   
   /** Crea y agrega un modelo a la Empresa, si este ya no existe lanza una excepcion.
    * 
    * @param nombre
    * @param marca
    * @throws Exception 
    */
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
   
   /** Busca y devuelve un Modelo en la empresa, si no existe lanza una excepcion.
    * 
    * @param nombre
    * @return
    * @throws Exception 
    */
   public Modelo buscarModelo(String nombre) throws Exception{
       this.getMarcas();
       Modelo aux = this.modelos.get(nombre);
       if (aux == null){
           throw new Exception("El modelo solicitada no existe.");
       }
       return aux;
   }
   
   /** Retorna un boolean, verdadero si existe el Modelo.
    * 
    * @param nombre
    * @param marca
    * @return
    * @throws Exception 
    */
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
   /** Crea y agrega un Cliente a la Empresa, si este ya no existe lanza una excepcion.
    * 
    * @param dni
    * @param nombre
    * @param apellido
    * @param fechaDeNacimiento
    * @param telefono
    * @throws Exception 
    */
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

   /** Busca y devuelve un Cliente de la empresa, si no se encuentra en el sistema lanza una excepcion.
    * 
    * @param dni
    * @return
    * @throws Exception 
    */
   public Cliente buscarCliente(String dni) throws Exception {
       this.getClientes();
       Cliente aux = this.clientes.get(dni);
       if (aux == null){
           throw new Exception("El Cliente con DNI " + dni + " no se encuentra en el sistema.");
       }
       return aux;
   }
   
   /** Retorna un boolean, verdadero si existe el Cliente.
    * 
    * @param dni
    * @return
    * @throws Exception 
    */
   public boolean existeCliente(String dni) throws Exception {
       this.getClientes();
       boolean retorno = false;
       Cliente aux = this.clientes.get(dni);
       if (aux != null){
           retorno = true;
       }
       return retorno;
   }   
   
   /** Elimina logicamente el cliente, cambia el estado del cliente a false.
    * En caso que el cliente no exista lanza una excepcion.
    * 
    * @param dni
    * @throws Exception 
    */
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
      
   /**Comprueba que el cliente se encuentre activo en el sistema.
    * Si no esta activo o si no encuentra el cliente, lanza una excepcion.
    * 
    * @param dni
    * @throws Exception 
    */
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
   
   /**Cambia el estado de una persona. de true a false o de false a true. dependiendo el estado anterior.
    * 
    * @param unaPersona 
    */
   public void cambiarEstado(Persona unaPersona){
       unaPersona.cambiarEstado();
       persistencia.update(unaPersona);
       persistencia.update(this);
   }
   
   /**Modifica el cliente con todos los datos ingresados. Si no encuentra el cliente lanza una excepcion.
    * 
    * @param dni
    * @param nombre
    * @param apellido
    * @param fechaDeNacimiento
    * @param telefono
    * @throws Exception 
    */
   public void modificarCliente(String dni, String nombre, String apellido, GregorianCalendar fechaDeNacimiento, String telefono) throws Exception {
        this.getClientes();
        // en caso de no encontrar el cliente lanza una excepcion desde esta funcion.
        Cliente aux = this.buscarCliente(dni);
        nombre = nombre.toUpperCase();
        apellido = apellido.toUpperCase();
        aux.setNombre(nombre);
        aux.setApellido(apellido);
        aux.setFechaDeNacimiento(fechaDeNacimiento);
        aux.setTelefono(telefono);
        persistencia.update(aux);
   }

    // Metodos Especilista
   
   /**Crea y agrega un Especialista a la Empresa. Si ya existe el especialista lanza una excepcion.
    * 
    * @param dni
    * @param apellido
    * @param nombre
    * @param fechaDeNacimiento
    * @param telefono
    * @param unaMarca
    * @throws Exception 
    */
   public void agregarEspecialista (String dni, String apellido, String nombre, GregorianCalendar fechaDeNacimiento, String telefono, Marca unaMarca) throws Exception{
       this.getEspecialistas();
       boolean asd = existeEspecialista(dni);
       if(asd == false){
           try {
            Usuario temp = this.crearUsuario(dni, "1");
            Especialista unEspecialista = new Especialista( dni,  apellido.toUpperCase(),  nombre.toUpperCase(), fechaDeNacimiento, telefono, unaMarca, temp);
            especialistas.put(dni, unEspecialista);
            persistencia.update(this);
           } catch (Exception e) {
               throw new Exception(e.getMessage());
           }
       }else{
           throw new Exception("El especialista con numero de identidad "+ dni +" ya se encuentra registrado en el sistema.");
       }
   }
   
   /** Busca y retorno un Especialista. en caso de no encontrar el especialista lanza una excepcion.
    * 
    * @param dni
    * @return
    * @throws Exception 
    */
   public Especialista buscarEspecialista (String dni) throws Exception{
       this.getEspecialistas();
       Especialista aux = this.especialistas.get(dni);
       if(aux == null){
           throw new Exception("El especialista con dni " + dni + " no se encuentra registrado en el sistema.");
       }
       return aux;
   }

   /** Retorna un boolean, verdadero si existe el Especialista.
    * 
    * @param dni
    * @return
    * @throws Exception 
    */
   public boolean existeEspecialista(String dni) throws Exception {
       this.getEspecialistas();
       boolean retorno = false;
       Especialista aux = this.especialistas.get(dni);
       if (aux != null){
           retorno = true;
       }
       return retorno;
   }
   
   /**Modifica los datos del especialista, en caso de no encontrar al especialista lanza una excepcion.
    * 
    * @param dni
    * @param nombre
    * @param apellido
    * @param fechaDeNacimiento
    * @param telefono
    * @param unaMarca
    * @throws Exception 
    */
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
   
  /**
   * 
   * @param unEspecialista
   * @param desde
   * @param hasta
   * @param gregorianCalendar
   * @param gregorianCalendar0
   * @param Dias 
     * @throws java.lang.Exception 
   */
   public void generarAgenda(Especialista unEspecialista, GregorianCalendar desde, GregorianCalendar hasta, GregorianCalendar gregorianCalendar, GregorianCalendar gregorianCalendar0, int[] Dias) throws Exception {
       if(unEspecialista != null){
           unEspecialista.generarAgenda(desde, hasta, gregorianCalendar, gregorianCalendar0, Dias);
       }
   }
   
   public boolean verificarDia(GregorianCalendar dia, int[] dias){
        boolean retorno = false;
        int i = 0;
        while(i < dias.length && retorno == false){
            if (dias[i] == dia.get(Calendar.DAY_OF_WEEK)){
                retorno = true;
            }
        }
        return retorno;
   }
   
   
   /** Metodos Especialistas
    *
    * @param unaMarca
     * @return 
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

   /** Agrega una reserva de Mantenimiento
    *
    * @param unCliente
    * @param unVehiculo
    * @param unEspecialista
    * @param fecha
    * @exception Exception
    * @pdOid 4efe5309-ea75-48a9-a966-bf64a67c2839 */
   public void confirmarReserva(Cliente unCliente, Vehiculo unVehiculo, Especialista unEspecialista, GregorianCalendar fecha) throws Exception {
       if (unCliente != null) {
           if (unVehiculo != null) {
               if (unEspecialista != null) {
                   GregorianCalendar hoy = new GregorianCalendar();
                   if (fecha.getTime().after(hoy.getTime())) {
                       //espescialista busca el dia
                        Dia unDia = unEspecialista.buscarDia(fecha);
                        Reserva unaReserva = new Reserva(fecha, unDia, unEspecialista, unCliente, unVehiculo);
                        this.reservas.add(unaReserva);
                        Empresa.persistencia.update(this);
                   } else {
                       SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                       throw new Exception("La fecha debe ser superior a la actual: " + sdf.format(hoy.getTime()));
                   }
               } else {
                   throw new Exception("El Especialista es incorrecto o nulo.");
               }
           } else {
               throw new Exception("El Vehiculo es incorrecto o nulo.");
           }
       } else {
           throw new Exception("El cliente es incorrecto o nulo.");
       }
   }
   
   /**Agrega una reserva de Reparacion cuando se le pasa una lista de problemas.
    * 
    * @param unCliente
    * @param unVehiculo
    * @param unEspecialista
    * @param fecha
    * @param problemas
    * @throws Exception 
    */
   public void confirmarReserva(Cliente unCliente, Vehiculo unVehiculo, Especialista unEspecialista, GregorianCalendar fecha, ArrayList<Problema> problemas) throws Exception {   
       if (unCliente != null) {
           if (unVehiculo != null) {
               if (unEspecialista != null) {
                   GregorianCalendar hoy = new GregorianCalendar();
                   if (fecha.getTime().after(hoy.getTime())) {
                       //espescialista busca el dia
                        Dia unDia = unEspecialista.buscarDia(fecha);
                        Iterator<Problema> it = problemas.iterator();
                        Reserva unaReserva = new Reserva(fecha, unDia, unEspecialista, unCliente, unVehiculo);
                        while(it.hasNext()){
                            unaReserva.agregarProblema(it.next());
                        }
                        this.reservas.add(unaReserva);
                        Empresa.persistencia.update(this);
                   } else {
                       SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                       throw new Exception("La fecha debe ser superior a la actual: " + sdf.format(hoy.getTime()));
                   }
               } else {
                   throw new Exception("El Especialista es incorrecto o nulo.");
               }
           } else {
               throw new Exception("El Vehiculo es incorrecto o nulo.");
           }
       } else {
           throw new Exception("El cliente es incorrecto o nulo.");
       }
   }
   
   /** *  @param unEspecialista
    * @param fecha
     * @return 
    * @exception Exception
    * @pdOid ee73084e-9816-422a-8e5e-1ca636d5625d */
   public List buscarHorariosLibres(Especialista unEspecialista, GregorianCalendar fecha) throws Exception {
       List retorno;
       retorno = unEspecialista.horarioDisponible(fecha);
       return retorno;
   }

   //Metodos Problemas

   public void agregarProblema(String descripcion, int duracion) throws Exception {
        this.getProblemas();
        if(!existeProblema(descripcion)){
            Problema nuevoProblema = new Problema(descripcion.toUpperCase(), duracion);
            problemas.add(nuevoProblema);
            persistencia.update(this);
        }else{
            throw new Exception("El problema: " + descripcion + ", ya se encuentra registrado en el sistema.");
        }
   }

   public boolean existeProblema(String descripcion) throws Exception {
       this.getProblemas();
       boolean retorno = false;
       Iterator<Problema> it = this.problemas.iterator();
       while(it.hasNext() && retorno == false){
           if (it.next().isThis(descripcion)){
               retorno = true;
           }
       }
       return retorno;
   }
    
   //Metodos Usuarios

   public Usuario crearUsuario(String nombre, String pass) throws Exception{
       this.getUsuarios();
       Usuario retorno = null;
       if (this.usuarios.get(nombre) == null){
           retorno = new Usuario(nombre, pass);
           this.usuarios.put(nombre, retorno);
           persistencia.update(this);
       }else{
           throw new Exception("El Usuario ya existe");
       }
       return retorno;
   }
   
   public boolean existeUsuario(String nombre){
       this.getUsuarios();
       boolean retorno = false;
       if(this.buscarUsuario(nombre) != null){
           retorno = true;
       }
       return retorno;
   }
   
   public Usuario buscarUsuario(String nombreUsuario) {
       return usuarios.get(nombreUsuario);
   }

   /** Comprubea que el usuario y contraseña sean correctos. En caso de verdadero devuelve el usuario al cual ingreso, en caso de ser incorrecto devuelve null.
    * 
    * @param usuario
    * @param contra
    * @return 
    */
   public Usuario verificarUsuario(String usuario, String contra){
       Usuario temp = this.buscarUsuario(usuario);
       if (temp != null){
           if (!temp.verificarClave(contra)){
               temp = null;
           }
       }
       return temp;
   } 
   
   //Metodos Reservas
   
   public List verReservas(Especialista unEspe, GregorianCalendar unDia) throws Exception{
       return unEspe.verReservas(unDia);
   }
   
   //Metodos Servicios
   
   public void agregarServicio(String observacion, int tiempo, Reserva reserva, List <Problema> problemas, List <RepuestoLinea> repuestos) throws Exception{
       if (reserva != null) {
           if(!reserva.fueAtendido()){
             Servicio unServicio = new Servicio(observacion, tiempo, reserva, problemas, repuestos);
             this.servicios.add(unServicio);
             Empresa.persistencia.update(this);  
           }else{
              throw new Exception("La reserva ya fue atendida por el especialista."); 
           }             
       } else {
           throw new Exception("El servicio ya existe en el sistema.");
       }
   }
   
   //Metodos Repuesto
   
   public boolean existeRepuesto(String descripcion){
       this.getRepuestos();
       boolean retorno = false;
       Iterator<Repuesto> it = this.repuestos.iterator();
       while(it.hasNext() && retorno == false){
           if (it.next().isThis(descripcion)){
               retorno = true;
           }
       }
       return retorno;
   }
   
   public void agregarRepuesto(String descripcion, float valor, int stock) throws Exception{
       this.getProblemas();
        if(!existeRepuesto(descripcion)){
            Repuesto nuevoRepuesto = new Repuesto(descripcion.toUpperCase(), valor, stock);
            repuestos.add(nuevoRepuesto);
            persistencia.update(this);
        }else{
            throw new Exception("El Repuesto: " + descripcion + ", ya se encuentra registrado en el sistema.");
        }
   }
   
   public Repuesto buscarRepuesto(String descripcion) throws Exception{
       List <Repuesto> lista = this.getRepuestos();
       Iterator <Repuesto> it = lista.iterator();
       boolean is = false;
       Repuesto aux = null;
       while(it.hasNext() && is == false){
           aux = it.next();
           if(!(is = aux.isThis(descripcion))){
               aux = null;
           }
       }
       return aux;
   }
   
   //Getter and Setter..
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
    public List <Servicio> getServicios() {
        return servicios;
    }
    public void setServicios(List <Servicio> servicios) {
        this.servicios = servicios;
    }
    public List <Repuesto> getRepuestos() {
        return repuestos;
    }
    public void setRepuestos(List <Repuesto> repuestos) {
        this.repuestos = repuestos;
    }
    public List<Problema> getProblemas() {
        return problemas;
    }
    public void setProblemas(List<Problema> problemas) {
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