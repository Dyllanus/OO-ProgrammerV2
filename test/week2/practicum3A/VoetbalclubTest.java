package week2.practicum3A;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {
    @Test
    void clubnaamLeeg(){
        Voetbalclub v0 = new Voetbalclub("");
        assertEquals("FC 0 0 0 0 0", v0.toString());
        Voetbalclub v1 = new Voetbalclub(null);
        assertEquals("FC 0 0 0 0 0", v1.toString());
    }
    @Test
    void verwerkResultaten(){
        Voetbalclub v2 = new Voetbalclub("Test");
        v2.verwerkResultaat('a');
        v2.verwerkResultaat('q');
        v2.verwerkResultaat('w');
        assertEquals("Test 1 1 0 0 3", v2.toString());
    }
    @Test
    void verwerkResulatenZichtbaarToString(){
        Voetbalclub v3 = new Voetbalclub("Test");
        v3.verwerkResultaat('w');
        assertEquals("Test 1 1 0 0 3", v3.toString());
        v3.verwerkResultaat('g');
        assertEquals("Test 2 1 1 0 4", v3.toString());
        v3.verwerkResultaat('v');
        assertEquals("Test 3 1 1 1 4", v3.toString());
    }
    @Test
    void herhaardelijkeVerwerken(){
        Voetbalclub v4 = new Voetbalclub("Test");
        v4.verwerkResultaat('w');
        v4.verwerkResultaat('v');
        v4.verwerkResultaat('w');
        v4.verwerkResultaat('g');
        v4.verwerkResultaat('g');
        v4.verwerkResultaat('w');
        assertEquals("Test 6 3 2 1 11", v4.toString());
    }
}