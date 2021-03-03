package week1.les1.opdracht5;


public class Main {

    public static void main(String[] arg) {

        Student st1 = new Student("Sylvester");

        System.out.println("naam: " + st1.getNaam());

        System.out.println("nummer: " + st1.getStudentNummer() );

        st1.setStudentNummer(12345678);

        System.out.println("toString: " + st1.toString());

        System.out.println();

        Student st2 = new Student("Karel", 98765432);

        System.out.println("naam: " + st2.getNaam());

        System.out.println("nummer: " + st2.getStudentNummer());

        System.out.println("toString: " + st2.toString());

    }

}

//public class Main {
//
//    public static void main(String[] arg){
//
//        Klant k1 = new Klant("Jan", "Nijenoord 1", "Utrecht");
//
//        k1.setAdres("Vreeburg 38");
//
//        System.out.println("klant nr 1:" + k1.toString());
//
//        Klant k2 = new Klant("Wim", "Oudenoord 340", "Utrecht");
//
//        k2.setPlaats("Amsterdam");
//
//        System.out.println("klant nr 2: " + k2.toString());
//
//    }
//
//}
