
package capalogica;
import java.util.List;

public class Docente {
    private String cidocete;
    private String teldocente;
    private String nombredocente;
    private String apedocente;
    private String horario;
    private String turno;
    private String grupo;
    private List <Materia> listaMaterias;
    private List<Abscentismo> ListaAbscentismo;

    public Docente() {
    }
//Cuando usamos los métodos getters y setters no es necesario usar el constructor de la clase.
    public Docente(String cidocete, String teldocente, String nombredocente, String apedocente, String horario, String turno, String grupo, List<Materia> listaMaterias, List<Abscentismo> ListaAbscentismo) {
        this.cidocete = cidocete;
        this.teldocente = teldocente;
        this.nombredocente = nombredocente;
        this.apedocente = apedocente;
        this.horario = horario;
        this.turno = turno;
        this.grupo = grupo;
        this.listaMaterias = listaMaterias;
        this.ListaAbscentismo = ListaAbscentismo;
    }

    public String getCidocete() {
        return cidocete;
    }

    public void setCidocete(String cidocete) {
        this.cidocete = cidocete;
    }

    public String getTeldocente() {
        return teldocente;
    }

    public void setTeldocente(String teldocente) {
        this.teldocente = teldocente;
    }

    public String getNombredocente() {
        return nombredocente;
    }

    public void setNombredocente(String nombredocente) {
        this.nombredocente = nombredocente;
    }

    public String getApedocente() {
        return apedocente;
    }

    public void setApedocente(String apedocente) {
        this.apedocente = apedocente;
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

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public List<Materia> getListaMaterias() {
        return listaMaterias;
    }

    public void setListaMaterias(List<Materia> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }

    public List<Abscentismo> getListaAbscentismo() {
        return ListaAbscentismo;
    }

    public void setListaAbscentismo(List<Abscentismo> ListaAbscentismo) {
        this.ListaAbscentismo = ListaAbscentismo;
    }
    
    

}
