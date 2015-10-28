package modelo;

public class Horario {
    
    private int id;
    private short entrada;
    private short salida;
    private short dia;

    public Horario() {
    }

    public Horario(short entrada, short salida, short dia){
        this.entrada = entrada;
        this.salida = salida;
        this.dia = dia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }  

    public short getEntrada() {
        return entrada;
    }

    public void setEntrada(short entrada) {
        this.entrada = entrada;
    }

    public short getSalida() {
        return salida;
    }

    public void setSalida(short salida) {
        this.salida = salida;
    }

    public short getDia() {
        return dia;
    }

    public void setDia(short dia) {
        this.dia = dia;
    }
    
    
}
