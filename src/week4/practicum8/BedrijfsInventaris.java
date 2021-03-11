package week4.practicum8;


import java.util.ArrayList;

public class BedrijfsInventaris {
    private String bedrijsnaam;
    private double budget;
    private ArrayList<Goed> alleGoederen;

    public BedrijfsInventaris(String nm, double bud){
        bedrijsnaam = nm;
        budget = bud;
        alleGoederen = new ArrayList<>();
    }

    public void schafAan(Goed g){
        if (!alleGoederen.contains(g) && budget>g.huidigeWaarde()){
            alleGoederen.add(g);
            budget -= g.huidigeWaarde();
        }
    }
    public String toString(){
        String s = bedrijsnaam + " heeft de goederen: ";
        for(Goed g : alleGoederen){
            s += "\n" + g;
        }
        return s;
    }

}
