
package capalogica;
import capaGrafica.IguInicio;
import capaGrafica.VentanaLogin;
import java.util.ArrayList;
import java.util.List;

public class Intentoproyecto1 {

    public static void main(String[] args) {
        
        
       
        
            
        
        
        
       /* VentanaLogin login=new VentanaLogin();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        */
       
       
        
        
        VentanaLogin login=new VentanaLogin();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        
       Docente doc=new Docente();
       doc.setCidocete("2");
       doc.setNombredocente("pablo");
       
       List<Materia> listamateria = new ArrayList();
       List<Abscentismo>listaabscentismo= new ArrayList();
       
       Abscentismo abs1=new Abscentismo();
       Abscentismo abs2=new Abscentismo();
       Abscentismo abs3=new Abscentismo();
       
       Materia mate1=new Materia();
       Materia mate2=new Materia();
       
       abs1.setFfinal("12/8/25");
       abs1.setFinicio("12/4/25");
       abs1.setIdabscentismo(23);
       abs1.setMotivo("enfermedad");
       
       listaabscentismo.add (abs1);
       
       doc.setListaAbscentismo(listaabscentismo);
       
       
       mate1.setIdmateria(12);
       mate1.setHorario("07:30-10:30");
       mate1.setNombre("programacion avanzada");
       mate1.setTurno("tarde");
       
       mate2.setHorario("10:30-12:30");
       mate2.setIdmateria(32);
       mate2.setTurno("tarde");
       mate2.setNombre("matematicas");
       
       listamateria.add(mate1);
       listamateria.add(mate2);
       
       doc.setListaMaterias(listamateria);
       
       
       
       
    }
}
