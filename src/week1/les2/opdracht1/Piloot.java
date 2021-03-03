package week1.les2.opdracht1;

public class Piloot {
    private  String naam;
    private  Double salaris;
    private int vlieguren;

    public Piloot(String nm){
        naam=nm;
    }

    public Double getSalaris(){
        return salaris;
    }

    public int getVlieguren(){
        return vlieguren;
    }

    public void setSalaris(Double nwSal){
        salaris = nwSal;
    }

    public void verhoogVliegurenMet(int nwvlu){
        vlieguren =+ nwvlu;
    }

    public String toString(){
        return naam + " heeft " + vlieguren + " vlieguren gemaak en verdient " + salaris;
    }

}
