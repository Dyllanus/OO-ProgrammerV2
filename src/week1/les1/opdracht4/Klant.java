package week1.les1.opdracht4;

public class Klant {

    private String naam;

    private String adres; // de 3 attributen

    private String plaats;

    public Klant(String nm, String adr, String pl) {

        naam = nm;

        adres = adr;

        plaats = pl;

    }

    public String getNaam() { // getter voor attribuut naam

        return naam;

    }

    public String getAdres() { // getter voor attribuut adres

        return adres;

    }

    public String getPlaats() { // getter voor attribuut plaats

        return plaats;

    }

// toString() toont alle 3 de attributen van een Klant-object:

    public String toString() {

        return naam + " woont op " + adres + " in " + plaats;

    }

}
