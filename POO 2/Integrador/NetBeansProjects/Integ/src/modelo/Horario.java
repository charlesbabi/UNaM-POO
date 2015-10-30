package modelo;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.86A57DE9-1BE3-D2A1-DE26-76B4CD6A99D6]
// </editor-fold> 
public class Horario {
    
    private int id;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6F09D722-2337-8002-B940-4E2F6467CDB1]
    // </editor-fold> 
    private short horarioEntrada;
    
    private short diaEntrada;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.ADB923B2-5A1E-9894-2AEA-E608C90D1EC9]
    // </editor-fold> 
    private short horarioSalida;
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F7D4C613-9F2C-75C8-E08F-268D69298A90]
    // </editor-fold> 
    private short diaSalida;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.BD009B4B-BF33-ACBA-9102-421D9BCB85B1]
    // </editor-fold> 
    public Horario () {
    }

    public Horario(short horarioEntrada, short diaEntrada, short horarioSalida, short diaSalida) {
        this.horarioEntrada = horarioEntrada;
        this.diaEntrada = diaEntrada;
        this.horarioSalida = horarioSalida;
        this.diaSalida = diaSalida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

    public short getHorarioEntrada() {
        return horarioEntrada;
    }

    public void setHorarioEntrada(short horarioEntrada) {
        this.horarioEntrada = horarioEntrada;
    }

    public short getDiaEntrada() {
        return diaEntrada;
    }

    public void setDiaEntrada(short diaEntrada) {
        this.diaEntrada = diaEntrada;
    }

    public short getHorarioSalida() {
        return horarioSalida;
    }

    public void setHorarioSalida(short horarioSalida) {
        this.horarioSalida = horarioSalida;
    }

    public short getDiaSalida() {
        return diaSalida;
    }

    public void setDiaSalida(short diaSalida) {
        this.diaSalida = diaSalida;
    }

    

}

