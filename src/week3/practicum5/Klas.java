package week3.practicum5;

import java.util.*;

public class Klas {
    private String klasCode;
    private ArrayList<Leerling> deleerling;

    public Klas(String kC){
        klasCode = kC;
        deleerling = new ArrayList<Leerling>();
    }
    public void voegLeerlingToe(Leerling l ){
        deleerling.add(l);
    }
    public void wijzigCijfer(String nm, double newCijfer) {
        for (Leerling l : deleerling)
            if (l.getNaam().equals(nm))
                l.setCijfer(newCijfer);
    }
    public ArrayList<Leerling> getLeerlingen(){
        return deleerling;
    }
    public int aantalLeerlingen(){
        return deleerling.size();
    }

    public String toString(){
        String s = "In klas " + klasCode + " zitten de volgende leerlingen:" ;
        System.out.println(s);
        for (Leerling leerling : deleerling) {
            System.out.println(leerling);
        }
        return "";
    }
}
