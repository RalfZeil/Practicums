package Practicum6;
import java.time.LocalDate;

public class Game {
    private String naam;
    private int releaseJaar;
    private double nieuwprijs;


    public Game(String naam, int releaseJaar, double nieuwprijs) {
        this.naam = naam;
        this.releaseJaar = releaseJaar;
        this.nieuwprijs = nieuwprijs;
    }

    public String getNaam() {
        return naam;
    }

    public double huideigeWaarde() {
        double huidigePrijs = nieuwprijs * (1 - (0.3 * (LocalDate.now().getYear() - releaseJaar)));
        return huidigePrijs;
    }

    @Override
    public boolean equals(Object andereObject) {
        boolean gelijkeObject = false;

        if (andereObject instanceof Game){
            Game andereGame = (Game) andereObject;

            if( this.naam.equals(andereGame.naam) &&
                this.releaseJaar == andereGame.releaseJaar &&
                this.nieuwprijs == andereGame.nieuwprijs){
                    gelijkeObject = true;
                }
        }

        return gelijkeObject;
    }
    

    public String toString() {
        return naam + ", uitgegeven in " + releaseJaar + "; nieuwprijs: " + nieuwprijs + " nu voor: " + this.huideigeWaarde();
    }

}
