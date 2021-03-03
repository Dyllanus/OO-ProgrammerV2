package week2.les4.lesopdracht;

public class Klant {
    private String naam;
    private String adres;
    private String plaats;
    private Rekening mijnRekening;

    public Klant(String nm, String ad, String pl){
        naam= nm;
        adres = ad;
        plaats = pl;
    }
    public void setMijnRekening(Rekening r){
        mijnRekening = r;
    }
    public Rekening getMijnRekening(){
        return mijnRekening;
    }
    public void setAdres(String ad){
        adres = ad;
    }
    public void setPlaats(String pl){
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

    public String toString() {
        String s = naam + ", woont op " + adres + ", in " + plaats;
        if (mijnRekening==null){
            s = s + "; er is nog geen rekening bekend";
        }else{
            s =  s+ ";\n" + mijnRekening.toString();
        }
        return s;
    }
}
