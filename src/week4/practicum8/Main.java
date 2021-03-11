package week4.practicum8;

public class Main {
    public static void main(String[] args){
        BedrijfsInventaris school = new BedrijfsInventaris("School" , 50000);
        Computer c1 = new Computer("HP", "92:acd:56", 1100.00, 2018);
        Computer c2 = new Computer("HP", "92:acd:56", 1100.00, 2018);
        Auto a1 = new Auto("Mercedes-Benz A-klasse A 180", 29995.00, 2019, "4-ZTV-94");
        Auto a2 = new Auto("Mercedes-Benz A-klasse A 180", 29995.00, 2019, "4-ZTV-94");
        Fiets f1 = new Fiets("Batavus", 550, 2020, 25689);
        Fiets f2 = new Fiets("Batavus", 550, 2020, 25689);

        Computer c3 = new Computer("Dell","156:rts:69", 1500.00, 2020);
        Fiets f3 = new Fiets("AMD", 300.00, 2019, 256);
        Auto a3 = new Auto("Renault Clio", 9995.00, 2020, "pr-504-41");

        school.schafAan(c1);
        school.schafAan(c2);
        school.schafAan(a1);
        school.schafAan(a2);
        school.schafAan(f1);
        school.schafAan(f2);
        school.schafAan(c3);
        school.schafAan(f3);
        school.schafAan(a3);

        System.out.println(school);

    }
}
