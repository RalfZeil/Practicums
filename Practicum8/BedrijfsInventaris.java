package Practicum8;

import java.util.ArrayList;

public class BedrijfsInventaris {
    private String bedrijfsNaam;
    private double budget;

    private ArrayList<Goed> alleGoederen = new ArrayList<Goed>();


    public BedrijfsInventaris(String bedrijfsNaam, double budget) {
        this.bedrijfsNaam = bedrijfsNaam;
        this.budget = budget;
    }

    public void schafAan(Goed g){
        if (!alleGoederen.contains(g) && budget > g.huidigeWaarde()){
            alleGoederen.add(g);
            budget = budget - g.huidigeWaarde();
        }
    }

    public String toString() {
        String goederenString = bedrijfsNaam + " heeft :\n";

        for (Goed goed : alleGoederen){
            goederenString += goed + "\n";
        }
        return goederenString;
    }

}
