import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;

public class CuentaTest {
    private Cuenta cuenta;
    @Before
    public void setUp() {
        cuenta = new Cuenta("ES123456789", 100.0f);
    }

    @Test
    public void testDatosIniciales() {
        assertEquals("ES123456789", cuenta.getNumero());
        assertEquals(100.0f, cuenta.getSaldo(), 0.001);
    }

    @Test
    public void testSetNumero() {
        cuenta.setNumero("ES987654321");
        assertEquals("ES987654321", cuenta.getNumero());
    }


}