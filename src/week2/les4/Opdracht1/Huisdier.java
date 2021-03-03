package week2.les4.Opdracht1;

public class Huisdier {
    private String naam;
    private String ras;
    private double gewicht;
    private Eigenaar baasje;

    public Huisdier(String nm, String r) {
        naam = nm;
        ras = r;
        gewicht = 0.0;

    }

    public Eigenaar getBaasje() {
        return baasje;
    }

    public void setBaasje(Eigenaar baasje) {
        this.baasje = baasje;
    }

    public String getNaam() { return naam; }

    public String getRas() { return ras; }

    public String toString() {

        return naam + ", de " + ras + ", weegt " + gewicht + " kg.\n" + "En de eigenaar is: " + baasje;

    }

}
