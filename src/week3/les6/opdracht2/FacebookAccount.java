package week3.les6.opdracht2;

import java.util.ArrayList;

public class FacebookAccount {
    private String naam;
    private ArrayList<Vriend> mijnVrienden;

    public FacebookAccount(String nm){
        naam = nm;
        mijnVrienden = new ArrayList<>();
    }

    public String getNaam() {
        return naam;
    }

    public void voegVriendToe(Vriend nwV){
        if (nwV.equals(nwV))
            mijnVrienden.add(nwV);
        System.out.println(mijnVrienden.size());
    }

    public boolean verwijderVriend(Vriend exV){
        mijnVrienden.remove(exV);
        return true;
    }
    public boolean isVriendMet(Vriend v) {
        return true;
    }
    public int aantalVrienden(){
        return mijnVrienden.size();
    }
    public String toString(){
        System.out.println(naam + " heeft " + aantalVrienden() + " vrienden: ");
        for (Vriend vriend : mijnVrienden){
            System.out.println(vriend);
        }
        return "";
    }
}
