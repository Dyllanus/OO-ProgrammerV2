package week2.les4.lesopdracht;

public class Rekening {
    private int nummer;
    private double saldo = 0.0;

    public Rekening(int nr){
        nummer =nr;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNummer() {
        return nummer;
    }
    public void stort(double bedrag){
        saldo = saldo +bedrag;
    }
    public void neemOp(double bedrag){
        saldo = saldo - bedrag;
    }
    public String toString(){
        return "Op rekening " + nummer + " staat " + saldo;
    }
}
