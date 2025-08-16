import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.Calculadora;

public class CalculadoraTest {
    @Test
    public void somaTest() {
        Calculadora calc = new Calculadora();
        int result = calc.soma(1, 1);
        assertEquals(2, result);
    }

    @Test
    public void subTest() {
        Calculadora calc = new Calculadora();
        int result = calc.sub(2, 1);
        assertEquals(1, result);
    }              
    
    @Test
    public void multTest() {
        Calculadora calc = new Calculadora();
        int result = calc.mult(2, 3);
        assertEquals(6, result);
    }

    @Test
    public void divTest() {
        Calculadora calc = new Calculadora();
        double result = calc.div(10, 5);
        assertEquals(2, result, 0.01);
    }

    @Test
    public void divZeroTest() {
        Calculadora calc = new Calculadora();
        double result = calc.div(10, 0);
        assertEquals(-1, result, 0.01);
    }
}