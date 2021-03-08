package week3.practicum6A;

import java.time.LocalDate;

public class Game {
    private String naam;
    private int releaseJaar;
    private double nieuwprijs;

    public Game(String nm, int rJ, double nwpr){
        naam = nm;
        releaseJaar = rJ;
        nieuwprijs = nwpr;
    }

    public String getNaam(){
        return naam;
    }
    public double huidigeWaarde(){
        double kortingPerJaar = 0.7;
        double uiteindelijkeKorting = 0.7;
        int verschil = LocalDate.now().getYear() - releaseJaar;
        if (verschil == 0){
            return nieuwprijs;
        }
        for(int i = 1; i<verschil; i++){
                uiteindelijkeKorting = uiteindelijkeKorting * kortingPerJaar;
        }
        return  nieuwprijs * uiteindelijkeKorting;
    }

    public boolean equals(Object andereObject){
        boolean gelijkeObjecten = false;
        if (andereObject instanceof Game){
            Game andereGame = (Game) andereObject;
            if(this.naam.equals(andereGame.naam) && this.releaseJaar == andereGame.releaseJaar){
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }

    public String toString(){
        return naam + ", uitgegeven in " + releaseJaar + "; nieuwprijs: €" + String.format("%.2f", nieuwprijs) + " nu voor: €" + String.format("%.2f", huidigeWaarde());
    }


}
