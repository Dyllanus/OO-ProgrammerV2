package week2.practicum4B;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AutoHuurTest {
    private AutoHuur huur;
    @BeforeEach
    public void init(){
        huur = new AutoHuur();
    }
    @Test
    void geenHuurderGeenAuto(){
        assertEquals("  er is geen auto bekend\n" +
                "  er is geen huurder bekend\n" +
                "  aantal dagen: 0 en dat kost 0.0", huur.toString());
    }
    @Test
    void geenHuurderGeenAutoWelDagenGeenKorting() {
        huur.setAantalDagen(2);
        assertEquals("  er is geen auto bekend\n" +
                "  er is geen huurder bekend\n" +
                "  aantal dagen: 2 en dat kost 0.0", huur.toString());
    }
    @Test
    void geenHuurderWelAutoWelDagenGeenKorting(){
        Auto a = new Auto("Volvo V60", 350);
        huur.setAantalDagen(4);
        huur.setGehuurdeAuto(a);
        assertEquals("  Volvo V60 met prijs per dag: 350.0\n" +
                "  er is geen huurder bekend\n" +
                "  aantal dagen: 4 en dat kost 0.0", huur.toString());
    }
    @Test
    void welHuurderGeenAutoGeenDagenGeenKorting(){
        Klant k = new Klant("Douwe Egberts");
        huur.setHuurder(k);
        assertEquals("  er is geen auto bekend\n" +
                "  op naam van: Douwe Egberts (korting: 0.0%)\n" +
                "  aantal dagen: 0 en dat kost 0.0", huur.toString());
    }
    @Test
    void geenHuurderWelAutoGeenDagenGeenKorting(){
        Auto a = new Auto("Talisman", 200);
        huur.setGehuurdeAuto(a);
        assertEquals("  Talisman met prijs per dag: 200.0\n" +
                "  er is geen huurder bekend\n" +
                "  aantal dagen: 0 en dat kost 0.0", huur.toString());
    }
    @Test
    void welHuurderWelAutoGeenDagenGeenKorting(){
        Auto a = new Auto("Talisman", 200.0);
        Klant k = new Klant("Douwe Egberts");
        huur.setHuurder(k);
        huur.setGehuurdeAuto(a);
        assertEquals("  Talisman met prijs per dag: 200.0\n" +
                "  op naam van: Douwe Egberts (korting: 0.0%)\n" +
                "  aantal dagen: 0 en dat kost 0.0", huur.toString());
    }
    @Test
    void welHuurderWelAutoNegatieveDagenGeenKorting(){
        Auto a = new Auto("Talisman", 200);
        Klant k = new Klant("Douwe Egberts");
        huur.setAantalDagen(-2);
        huur.setHuurder(k);
        huur.setGehuurdeAuto(a);
        assertEquals("  Talisman met prijs per dag: 200.0\n" +
                "  op naam van: Douwe Egberts (korting: 0.0%)\n" +
                "  Het aantal dagen wat u heeft ingevuld is negatief (-2)", huur.toString());
    }
    @Test
    void welHuurderWelAutoPositieveDagenGeenKorting(){
        Auto a = new Auto("Talisman", 200);
        Klant k = new Klant("Douwe Egberts");
        huur.setAantalDagen(2);
        huur.setHuurder(k);
        huur.setGehuurdeAuto(a);
        assertEquals("  Talisman met prijs per dag: 200.0\n" +
                "  op naam van: Douwe Egberts (korting: 0.0%)\n" +
                "  aantal dagen: 2 en dat kost 400.0", huur.toString());
    }
    @Test
    void welHuurderWelAutoPositieveDagenNegatieveKorting(){
        Auto a = new Auto("Talisman", 200);
        Klant k = new Klant("Douwe Egberts");
        k.setKorting(-10.0);
        huur.setAantalDagen(2);
        huur.setHuurder(k);
        huur.setGehuurdeAuto(a);
        assertEquals("  Talisman met prijs per dag: 200.0\n" +
                "  op naam van: Douwe Egberts (korting: 0.0%)\n" +
                "  aantal dagen: 2 en dat kost 400.0", huur.toString());
    }
    @Test
    void welHuurderWelAutoPositieveDagenPositieveKorting(){
        Auto a = new Auto("Talisman", 200);
        Klant k = new Klant("Douwe Egberts");
        k.setKorting(10.0);
        huur.setAantalDagen(2);
        huur.setHuurder(k);
        huur.setGehuurdeAuto(a);
        assertEquals("  Talisman met prijs per dag: 200.0\n" +
                "  op naam van: Douwe Egberts (korting: 10.0%)\n" +
                "  aantal dagen: 2 en dat kost 360.0", huur.toString());
    }

}