package week2.les3.Opdracht2;

public class TarievenFabriek {
    public static void main(String[] arg) {
        try {
            BelastingTarieven.produceerBelastingTarieven();
        } catch (ArithmeticException e){
            System.out.println("Mislukt");

        }
    }

}
