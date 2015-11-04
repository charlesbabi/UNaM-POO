package modelo;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

public class Especialista extends Persona {

    private Marca marca;
    private List turnos;
    private List horarios;
 
    public Especialista () {
        super();
        this.turnos = new ArrayList();
        this.horarios = new ArrayList();
    }

    public Especialista(int dni, String nombre, String apellido, Marca mMarca, String telefono) {
        super(dni, nombre, apellido, telefono);
        this.marca = mMarca;
        this.turnos = new ArrayList();
        this.horarios = new ArrayList();
    }

    public Marca getMarca () {
        return marca;
    }

    public void setMarca (Marca val) {
        this.marca = val;
    }

    public List getHorarios() {
        return horarios;
    }

    public void setHorarios(List horarios) {
        this.horarios = horarios;
    }

    public List getTurnos() {
        return turnos;
    }

    public void setTurnos(List turnos) {
        this.turnos = turnos;
    }



    public void asignarTurno(Turno turno) throws Exception{
        if(!turnos.contains(turno)){
            turno.asignarEspecialista(this);
            turnos.add(turno);
        }else{
            throw new Exception("El turno ya se encuentra asignado a este especialista.");
        }
    }

    public void agregarHorarioDeTrabajo(short inicio, short fin, short dia) throws Exception{
        Horario aux = new Horario(inicio, fin, dia);
        if(horarios.isEmpty()){
            horarios.add(aux);
        }else if(!horarios.contains(aux)){
            horarios.add(aux);
        }else{
            throw new Exception("El especialista ya tiene ese horario de trabajo asignado.");
        }
    }

    public void buscarTurnoLibre() throws Exception{
        
    }
    /*
    public boolean estaLibre(GregorianCalendar horario) throws Exception{
    boolean retorno = false;
    if(!this.turnos.isEmpty()){
    Iterator it = this.turnos.iterator();
    Turno aux = new Turno();
    while(it.hasNext() || !aux.horarioLibre(horario)){
    aux = (Turno) it.next();
    retorno = true;
    }
    }
    return retorno;
    }*/
}

