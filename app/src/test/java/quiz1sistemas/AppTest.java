
package quiz1sistemas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void testCalcularValorBoleta() {
        assertEquals(30000, App.calcularValorBoleta("V", 2));
        assertEquals(50000, App.calcularValorBoleta("G", 5));
        assertEquals(-1, App.calcularValorBoleta("H", 10));
        assertEquals(-1, App.calcularValorBoleta("V", 0));
    }

    @Test void testCalcularValorNetoCombo() {
        assertEquals(40000, App.calcularValorNetoCombo(1, 1));
        assertEquals(120000, App.calcularValorNetoCombo(2, 4));
        assertEquals(-1, App.calcularValorNetoCombo(4, 1));
        assertEquals(-1, App.calcularValorNetoCombo(1, 0));
    }

    @Test void testCalcularDescuentoCombo() {
        assertEquals(2000, App.calcularDescuentoCombo("V", 1, 40000));
        assertEquals(0, App.calcularDescuentoCombo("G", 2, 120000));
        assertEquals(-1, App.calcularDescuentoCombo("H", 4, -1));
        assertEquals(-1, App.calcularDescuentoCombo("V", 1, -1));
    }

    @Test void testCalcularValorFactura() {
        assertEquals(72000, App.calcularValorFactura(40000, 30000, 2000));
        assertEquals(170000, App.calcularValorFactura(120000, 50000, 0));
    }
}
