package week2.les3.Opdracht2;
import java.util.Random;

public class BelastingTarieven {
    static void produceerBelastingTarieven() {
        for (int i = 1; i <= 10; i++) {
            int random = new Random().nextInt(5);
            double tarief = (100 / random) - 20;
            System.out.println(i+": "+tarief + " %");

        }
    }
}
