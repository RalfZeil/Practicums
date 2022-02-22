package Practicum4B;

public class Auto {
    private String type;
    private double prijsPerDag;


    public Auto(String type, double prijsPerDag) {
        this.type = type;
        this.prijsPerDag = prijsPerDag;
    }

    public void setPrijsPerDag(double prPd){
        prijsPerDag = prPd;
    }

    public double getPrijsPerDag() {
        return prijsPerDag;
    }


    @Override
    public String toString() {
        return type + " met prijs per dag: " + prijsPerDag;
    }
    
}
