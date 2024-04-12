import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SingletonTest {

    @Test
    @DisplayName("Singleton 1")
    public void igualdadDeObjetos(){
        Singleton dato = Singleton.getInstance();
        Singleton dato1 = Singleton.getInstance();

        assertSame(dato,dato1);
    }
}
