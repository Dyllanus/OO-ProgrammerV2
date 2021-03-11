package week4.practicum8;

import java.time.LocalDate;
import java.util.Objects;

public class Fiets extends Voertuig{
    private int framenummer;

    public Fiets(String tp, double pr, int jr, int fnr){
        super(tp, pr, jr);
        framenummer =fnr;
    }
    @Override
    public double huidigeWaarde(){
        double uiteindelijkeKorting = 0.9;
        int verschil = LocalDate.now().getYear() - bouwjaar;
        if (verschil == 0){
            return nieuwprijs;
        }
        for(int i = 1; i<verschil; i++){
            uiteindelijkeKorting *= 0.9;
        }
        return  nieuwprijs * uiteindelijkeKorting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Fiets fiets = (Fiets) o;
        return framenummer == fiets.framenummer;
    }

}
