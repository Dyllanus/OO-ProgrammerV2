package week4.practicum8;

import java.time.LocalDate;
import java.util.Objects;

public class Computer implements Goed{
    private String type;
    private String macAdres;
    private double aanschafPrijs;
    private int productieJaar;

    public Computer(String tp, String adr, double pr, int jr){
        type=tp;
        macAdres = adr;
        aanschafPrijs = pr;
        productieJaar = jr;
    }

    @Override
    public double huidigeWaarde() {
        double uiteindelijkeKorting = 0.6;
        int verschil = LocalDate.now().getYear() - productieJaar;
        if (verschil == 0){
            return aanschafPrijs;
        }
        for(int i = 1; i<verschil; i++){
            uiteindelijkeKorting *=  0.6;
        }
        return  aanschafPrijs * uiteindelijkeKorting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Double.compare(computer.aanschafPrijs, aanschafPrijs) == 0 && productieJaar == computer.productieJaar && Objects.equals(type, computer.type) && Objects.equals(macAdres, computer.macAdres);
    }

    public String toString(){
        return "Een computer met type: " + type + " is nu nog waard: €" + String.format("%.2f", huidigeWaarde());
    }
}
