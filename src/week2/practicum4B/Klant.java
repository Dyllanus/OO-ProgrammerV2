package week2.practicum4B;

public class Klant {
    private String naam;
    private double kortingsPercentage;

    public Klant(String nm){
        naam=nm;
    }
    public void setKorting(Double kP){
        if(kP<0){
            kP=0.0;
        }
        kortingsPercentage=kP;
    }
    public double getKorting(){
        return kortingsPercentage;
    }
    public String toString(){
        return "op naam van: " + naam + " (korting: " + kortingsPercentage + "%)";
    }
}
