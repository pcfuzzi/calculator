// Assertions-Klasse von Junit werden in das projekt geladen
// zum überprüfen von dem zu erwarteten wert mit zurückgelieferten werten
import static org.junit.jupiter.api.Assertions.*;

// Test-Klassen von Junit werden in das projekt geladen
import org.junit.jupiter.api.Test;

//klassenname der test klase: calculator
class calculatorTest {

	//Herzstück unsres Testings:
	
	@Test
    public void testAdd() {
        calculator c = new calculator();
        int result = c.add(2, 2);
        assertEquals(4, result);
    }


@Test
   public void testSub() {
    calculator c = new calculator();
    int result = c.sub(4, 2);
    assertEquals(2, result);
}

@Test
public void testMult() {
    calculator c = new calculator();
    int result = c.mult(2, 3);
    assertEquals(6, result );
}

@Test
public void testDiv() {
    calculator c = new calculator();
    int result = c.div(10, 2);
    assertEquals(5, result);
}

}

//Klassen calculator mit den vier grundrechenarten
class calculator {
//Berechnung einer addition
	public int add(int a, int b) {
        return a + b;

}
	public int sub(int a, int b) {
        return a - b;
    }

    public int mult(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division durch 0 ist nicht erlaubt");
        }
        return a / b;
    }

}