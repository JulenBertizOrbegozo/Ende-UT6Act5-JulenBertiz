import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

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

    @Test
    public void testSetSaldo() {
        cuenta.setSaldo(250.0f);
        assertEquals(250.0f, cuenta.getSaldo(), 0.001);
    }

    @Test
    public void testIngresarDinero() {
        cuenta.ingresarDinero(50.0f);
        assertEquals(150.0f, cuenta.getSaldo(), 0.001);
    }

    @Test
    public void testExtraerDinero() {
        cuenta.extraerDinero(30.0f);
        assertEquals(70.0f, cuenta.getSaldo(), 0.001);
    }

    @Test
    public void testCuentaNoNula() {
        assertNotNull(cuenta);
    }

    @Test
    public void testNumeroCuentaNoNulo() {
        assertNotNull(cuenta.getNumero());
    }
}