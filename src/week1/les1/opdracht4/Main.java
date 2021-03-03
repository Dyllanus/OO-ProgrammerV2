package week1.les1.opdracht4;

public class Main {

    public static void main(String[] arg) {

        Student st1 = new Student("Sylvester");

        System.out.println( "getter: " + st1.getNaam() );

        System.out.println( "toString: " + st1.toString() );

        Student st2 = new Student("Karel");

        System.out.println( "getter: " + st2.getNaam() );

        System.out.println( "toString: " + st2.toString() );

    }

}

//public class Main {
//
//    public static void main(String[] arg){
//
//        Klant k1 = new Klant("Jan", "Nijenoord 1", "Utrecht");
//
//        System.out.println(k1.getNaam()); // publieke getter
//
//        System.out.println(k1.getAdres()); // publieke getter
//
//        System.out.println(k1.getPlaats()); // publieke getter
//
//        System.out.println(k1.toString()); // toString()
//
//        Klant k2 = new Klant("Wim", "Oudenoord 340", "Utrecht");
//
//        System.out.println("Naam: " + k2.getNaam());
//
//        System.out.println("Adres: " +k2.getAdres());
//
//        System.out.println("Woonplaats: " + k2.getPlaats());
//
//        System.out.println("klant nr 2: " + k2.toString());
//
//    }
//
//}
