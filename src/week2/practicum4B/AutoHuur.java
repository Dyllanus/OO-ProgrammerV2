package week2.practicum4B;

public class AutoHuur {
    private int aantalDagen;
    private Auto gehuurdeAuto;
    private Klant huurder;

    public AutoHuur(){
    }
    public void setAantalDagen(int aD){
        aantalDagen = aD;
    }
    public int getAantalDagen(){
        return aantalDagen;
    }
    public void setGehuurdeAuto(Auto gA){
        gehuurdeAuto = gA;
    }
    public Auto getGehuurdeAuto(){
        return gehuurdeAuto;
    }
    public void setHuurder(Klant k){
        huurder=k;
    }
    public Klant getHuurder() {
        return huurder;
    }
    public double totaalPrijs(){
        if (huurder==null){
            return 0;
        }
        if (gehuurdeAuto==null){
            return 0;
        }
        int dag = getAantalDagen();
        double prijs = gehuurdeAuto.getPrijsPerDag();
        double korting = (huurder.getKorting()) / 100;
        double uitkorting = (dag * prijs) * korting;
        return  prijs * dag - uitkorting;
    }
    public String toString(){
        String auto = "  " + gehuurdeAuto  + "\n";
        String huur = "  " + huurder + "\n";
        String alles = "  aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
        if (huurder==null){
              huur =  "  er is geen huurder bekend\n";
        }
        if (gehuurdeAuto==null){
             auto = "  er is geen auto bekend\n";
        }
        if (aantalDagen <0){
            alles = "  Het aantal dagen wat u heeft ingevuld is negatief (" +aantalDagen+")";
        }
        return auto + huur + alles;
    }
}
