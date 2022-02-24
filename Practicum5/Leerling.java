package Practicum5;

public class Leerling {
    private String naam;
    private double cijfer;


    public Leerling(String nm) {
        this.naam = nm;
    }


    public String getNaam() {
        return this.naam;
    }

    public double getCijfer() {
        return this.cijfer;
    }

    public void setCijfer(double cijfer) {
        this.cijfer = cijfer;
    }


    @Override
    public String toString() {
        return naam + " heeft cijfer: " + cijfer;
    }

}
