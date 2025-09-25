
package capalogica;

 class Abscentismo {
     
    private String finicio;
    private String ffinal;
    private String motivo;
    private int idabscentismo;

    public Abscentismo() {
    }

    public Abscentismo(String finicio, String ffinal, String motivo, int idabscentismo) {
        this.finicio = finicio;
        this.ffinal = ffinal;
        this.motivo = motivo;
        this.idabscentismo = idabscentismo;
    }

    public String getFinicio() {
        return finicio;
    }

    public void setFinicio(String finicio) {
        this.finicio = finicio;
    }

    public String getFfinal() {
        return ffinal;
    }

    public void setFfinal(String ffinal) {
        this.ffinal = ffinal;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public int getIdabscentismo() {
        return idabscentismo;
    }

    public void setIdabscentismo(int idabscentismo) {
        this.idabscentismo = idabscentismo;
    }
    
    
}
