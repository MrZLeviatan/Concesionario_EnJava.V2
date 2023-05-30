import Modelo.*;
import org.junit.jupiter.api.Test;

import static view.consecionarioInstance.INSTANCE;

;


public class PruebaList {
    @Test
    public void test01() throws Exception {

        INSTANCE.getConsesionario().getListaAdministradores();
        Administrador amd= new Administrador("juan","admin@gmail.com",18,12345, Genero.MASCULINO,"admin123","lolsito");
        INSTANCE.getConsesionario().addAministrador(amd);
       INSTANCE.getConsesionario().getListaAdministradores().forEach(Administrador->System.out.println(Administrador.getNombre()));

    }

    @Test
    public void  test02() throws Exception{
        Empleado empleado= new Empleado("juan","correo",22,1234,Genero.MASCULINO,"arroz","arroz2", Estado.ACTIVO, Nivel.INFERIOR);
        INSTANCE.getConsesionario().addEmpleado(empleado);
        String correo= "correo";
        INSTANCE.getConsesionario().buscarEmpleado(correo);


       if(INSTANCE.getConsesionario().verificarAdm(correo)==false){
           System.out.println("hola");
       }
    }
}
