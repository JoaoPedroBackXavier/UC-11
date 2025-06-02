
import com.mycompany.aula2.calculadora;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Testes {
    
    
    @Test
    public void testSomar(){
        assertEquals(0,calculadora.somar(0, 0));
    }
    
    @Test
    public void testSubtrair(){
        assertEquals(0,calculadora.subtrair(10, 10));
    }
    
    
}
