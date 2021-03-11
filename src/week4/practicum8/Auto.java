package week4.practicum8;

import java.time.LocalDate;
import java.util.Objects;

public class Auto extends Voertuig{
    private String kenteken;

    public Auto(String tp, double pr, int jr, String kt){
        super(tp, pr, jr);
        kenteken = kt;
    }

    public double huidigeWaarde(){
        double uiteindelijkeKorting = 0.7;
        int verschil = LocalDate.now().getYear() - bouwjaar;
        if (verschil == 0){
            return nieuwprijs;
        }
        for(int i = 1; i<verschil; i++){
            uiteindelijkeKorting = uiteindelijkeKorting * 0.7;
        }
        return  nieuwprijs * uiteindelijkeKorting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Auto auto = (Auto) o;
        return Objects.equals(kenteken, auto.kenteken);
    }

}
