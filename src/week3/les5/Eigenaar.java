package week3.les5;

public class Eigenaar {
    private String naam;
    private int giroNr;
    private Huisdier beestje;

    public Eigenaar(String nm) {
        naam = nm;
    }

    public Huisdier getBeestje() {
        return beestje;
    }
    public void setBeestje(Huisdier beestje){
        this.beestje = beestje;
    }

    public void setGiroNr(int nr) { giroNr = nr; }

    public int getGiroNr() { return giroNr; }

    public String getNaam() { return naam; }

    public String toString() {

        return naam + " heeft giro " + giroNr + ". En het baasje van "+ beestje;

    }

}
