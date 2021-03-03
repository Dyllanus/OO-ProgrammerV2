package week1.les1.opdracht5;

public class Klant {

    private String naam;

    private String adres; // de 3 attributen

    private String plaats;

    public Klant(String nm, String adr, String pl) {

        naam = nm;

        adres = adr;

        plaats = pl;

    }

    public String getNaam() {
        return naam;
    }

    public String getAdres() {
        return adres;
    }

    public String getPlaats() {
        return plaats;
    }

    public void setAdres(String nwAdr) { // publieke setter

        adres = nwAdr;

    }

    public void setPlaats(String nwPl) { // publieke setter

        plaats = nwPl;

    }

    public String toString() {

        String s = naam + " woont op " + adres + " in " + plaats;

        return s;

    }
}