package week3.les5;

import week2.practicum4A.Huis;

import java.util.ArrayList;

public class Main {

    public static void main(String[] arg) {
        ArrayList huisdieren = new ArrayList();
        Eigenaar e1 = new Eigenaar("Willem de Moller");
        System.out.println(e1);
        Huisdier h1 = new Huisdier("Nero", "Dobermann");
        e1.setBeestje(h1);

        System.out.println(e1);
        System.out.println();

        Eigenaar e2 = new Eigenaar("Pluk");

        System.out.println(e2);
        Huisdier h2 = new Huisdier("Zaza", "kakkerlak");
        e2.setBeestje(h2);

        System.out.println(e2);
        System.out.println();
        System.out.println(e1.getBeestje());
        System.out.println(e2.getBeestje());


        huisdieren.add(h1);
        huisdieren.add(h2);
        huisdieren.add(new Huisdier("Dotje", "kat"));
        System.out.println(huisdieren.size());
        for (Object huisdier : huisdieren){
            System.out.println(huisdier);
        }
        System.out.println();
        huisdieren.add(0,new Huisdier("Kiwi", "Kiwi"));
        huisdieren.set(2, new Huisdier("Leafy" , "Corgi"));
        for (Object huisdier : huisdieren){
            System.out.println(huisdier);
        }
    }

}
