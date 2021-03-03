package week2.practicum3A;

public class Voetbalclub {
    private String naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;

    public Voetbalclub(String nm){
        if (nm ==null || nm.isEmpty()){
            nm = "FC";
        }
        naam=nm;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }
    public int getGewonnen(){
        return aantalGewonnen;
    }
    public int getGelijk(){
        return aantalGelijk;
    }
    public int getVerloren(){
        return aantalVerloren;
    }


    public int aantalPunten(){
        return (aantalGewonnen * 3) + aantalGelijk;
    }
    public int aantalGespeeld(){
        return aantalGewonnen + aantalVerloren + aantalGelijk;
    }
    public String toString(){
        return naam +" "+aantalGespeeld()+" "+ aantalGewonnen + " " +aantalGelijk+ " "+ aantalVerloren + " " + aantalPunten();
    }
}
