package Practicum6;

import java.util.ArrayList;

public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> mijnGames;


    public Persoon(String naam, double budget) {
        this.naam = naam;
        this.budget = budget;
        mijnGames = new ArrayList<Game>();
    }

    public double getBudget() {
        return budget;
    }

    public boolean koop(Game g){
        if(g.huideigeWaarde() < this.budget && !mijnGames.contains(g)){
            budget = budget - g.huideigeWaarde();
            mijnGames.add(g);
            return true;
        }
        else{
            return false;
        }
    }

    public boolean verkoop(Game g, Persoon koper){
        if(koper.budget > g.huideigeWaarde() && !koper.mijnGames.contains(g)){
            this.mijnGames.remove(g);
            koper.mijnGames.add(g);
            return true;
        }
        else{
            return false;
        }
    }

    public String toString() {
        String returnString = naam + " heeft een budget van $" + String.format("%.2f", budget) + " en bezit de volgende games: \n";

        for(Game game : mijnGames){
            returnString = returnString + game.toString() + "\n";
        }

        return returnString;
    }

}
