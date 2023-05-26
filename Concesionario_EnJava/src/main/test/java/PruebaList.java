import modelo.Administrador;
import modelo.Consesionario;
import modelo.Genero;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

;


public class PruebaList {
    @Test
    public void test01() throws Exception {

        List<Administrador>administradorList= new ArrayList<>();
        Administrador amd= new Administrador("juan","admin@gmail.com",18,12345, Genero.MASCULINO,"admin123","lolsito");
        //administradorList=modelo.Consesionario.añadirAdministrador(amd);
        administradorList.forEach(Administrador->System.out.println(Administrador.getCorreo()));

    }

    @Test
    public void  test02() throws Exception{

        List<Administrador>administradorList= new ArrayList<>();
        Administrador amd= new Administrador("juan","admin@gmail.com",18,12345, Genero.MASCULINO,"admin123","lolsito");
        String correo=amd.getCorreo();
        if (verificarAdm(correo,administradorList)==true){
            administradorList.forEach(Administrador->System.out.println(Administrador.getCorreo()));
        }


    }
}
