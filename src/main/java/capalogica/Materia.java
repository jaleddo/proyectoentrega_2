
package capalogica;


public class Materia {
    
    private int idmateria;
    private String horario;
    private String turno;
    private String nombre;

    public Materia() {
    }

    public Materia(int idmateria, String horario, String turno, String nombre) {
        this.idmateria = idmateria;
        this.horario = horario;
        this.turno = turno;
        this.nombre = nombre;
    }

    public int getIdmateria() {
        return idmateria;
    }

    public void setIdmateria(int idmateria) {
        this.idmateria = idmateria;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
