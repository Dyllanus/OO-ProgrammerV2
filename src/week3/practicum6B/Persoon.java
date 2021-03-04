package week3.practicum6B;

import java.util.ArrayList;

public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> mijnGames;

    public Persoon(String nm, double bud){
        naam = nm;
        budget = bud;
        mijnGames = new ArrayList<Game>();
    }

    public double getBudget(){
        return budget;
    }
    public boolean koop(Game g){
        boolean kanKopen = false;
        if (g.huidigeWaarde()<budget){
            if (!mijnGames.contains(g)) {
                mijnGames.add(g);
                budget = budget - g.huidigeWaarde();
                kanKopen = true;
            }
            }
        return kanKopen;
    }
    public boolean verkoop(Game g, Persoon koper){
        boolean kanVerkoop = false;
        if (mijnGames.contains(g) && !koper.mijnGames.contains(g) && koper.budget > g.huidigeWaarde()){
            mijnGames.remove(g);
            koper.mijnGames.add(g);
            koper.budget = koper.budget - g.huidigeWaarde();
            budget = budget + g.huidigeWaarde();
            kanVerkoop = true;
            }

        return kanVerkoop;
    }
    public ArrayList<Game> bepaalGamesNietInBezit(ArrayList<Game> teKoop) {
        for (Game mijn : mijnGames){
            teKoop.removeIf(mijn::equals);
        }
        return teKoop;
    }

    public Game zoekGameOpNaam(String s) {
        for (Game g : mijnGames){
            if (g.getNaam().equals(s));
            return g;
        }
        return null;
    }

    public String toString(){
        String s =  naam + " heeft een budget van €" + String.format("%.2f", budget) + " en bezit de volgende games:";
        if (mijnGames.isEmpty()){
            return s;
        }
        for (Game g : mijnGames){
            s = s + "\n"+ g ;
        }
        return s;
    }
}
