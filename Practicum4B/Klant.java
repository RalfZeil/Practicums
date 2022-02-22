package Practicum4B;

public class Klant {
    private String naam;
    private double kortingsPercentage;


    public Klant(String naam) {
        this.naam = naam;
    }

    public void setKorting(double kP) {
        this.kortingsPercentage = kP;
    }

    public double getKorting() {
        return kortingsPercentage;
    }

    @Override
    public String toString() {
        return naam + " (korting: " + kortingsPercentage + "%)";
    }

}
