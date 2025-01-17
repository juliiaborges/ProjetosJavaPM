package tdd2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraTest {

   private Operacoes calcular = new Operacoes();

    @Test
    public void testRaiz() {
        double raiz = calcular.raiz(81);
        assertEquals(9, raiz, 0.01);
    }

    @Test
    public void testPotencia() {
        double potencia = calcular.potenciar(10,2);
        assertEquals(100, potencia, 0.01);
    }

    @Test
    public void testSeno(){
        double seno = calcular.seno(42);
        assertEquals(0.6691, seno, 0.01);
    }

    @Test
    public void testTangente(){
        assertEquals(1.0, calcular.tangente(45), 0.01);
    }

    @Test
    public void testSoma(){
        double result = calcular.soma(6, 1);
        assertEquals(7, result);
    }

    @Test
    public void testSub(){
        double result = calcular.sub(10, 6);
        assertEquals(6, result);
    }

    @Test
    public void testCosceno() {
        double cosceno = Operacoes.cosceno(42);
        assertEquals(0.7071, Operacoes.cosceno(45), 0.01);
    }

}

