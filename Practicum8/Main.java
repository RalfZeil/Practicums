package Practicum8;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Auto a1 = new Auto("Mercedes", 1000.00, 1999, "KAYO");
        Auto a2 = new Auto("Mercedes", 1000.00, 1999, "KAYO");
        Fiets f1 = new Fiets("Strava", 200.00, 2018, 10021);
        Fiets f2 = new Fiets("Strava", 200.00, 2018, 10021);
        Computer c1 = new Computer("Lenova", "RA-LF-ZE-IL-ST-RA", 500, 2019);
        Computer c2 = new Computer("Lenova", "RA-LF-ZE-IL-ST-RA", 500, 2019);

        Auto a3 = new Auto("Audi", 1200.00, 2005, "OMEN");
        Fiets f3 = new Fiets("Kangeroe", 150.00, 2019, 13301);
        Computer c3 = new Computer("aSUS", "RA-ND-OM-AD-RE-SS", 700, 2021);

        BedrijfsInventaris b1 = new BedrijfsInventaris("Ralf INC", 500);

        b1.schafAan(a1);
        b1.schafAan(a2);
        b1.schafAan(a3);
        b1.schafAan(f1);
        b1.schafAan(f2);
        b1.schafAan(f3);
        b1.schafAan(c1);
        b1.schafAan(c2);
        b1.schafAan(c3);
        
        System.out.println(b1.toString());
      }
}
