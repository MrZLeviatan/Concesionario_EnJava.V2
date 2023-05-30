import Modelo.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PruebaPersonas {
    @Test
    public void test01() throws Exception {
        List<Empleado>empleadoList=new ArrayList<>();
        empleadoList.add(new Empleado("juan","correo",18,1091, Genero.MASCULINO,"lolsito","lolsito", Estado.ACTIVO, Nivel.INFERIOR));
        empleadoList.add(new Empleado("juan","correo",18,1092, Genero.MASCULINO,"lolsito","lolsito", Estado.ACTIVO, Nivel.INFERIOR));


    }

}
