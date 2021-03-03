package week1.praticum2A;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ZwembadTest {
    @Test
    void berekenenInhoud(){
        Zwembad a = new Zwembad(10.0,25.0,2.0);
        assertEquals(500.0, a.inhoud());
        System.out.println("De test werkt");

    }

}