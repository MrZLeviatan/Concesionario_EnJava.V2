import org.junit.jupiter.api.Test;

import static view.consecionarioInstance.INSTANCE;

public class tester {
    @Test
    public void test(){
        INSTANCE.getConsesionario().enviarCorreo("andrey3681.ay@gmail.com","123");
    }
}
