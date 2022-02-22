package Practicum4A;

public class Huis {
    private String adres;
    private int bouwjaar;

    private Persoon huisBaas;

    public Huis(String adres, int bouwjaar) {
        this.adres = adres;
        this.bouwjaar = bouwjaar;
    }

    public void setHuisbaas(Persoon hb){
        huisBaas = hb;
    }

    public Persoon getHuisbaas(){
        return huisBaas;
    }


    @Override
    public String toString() {
        return "Huis " + adres + " is gebouwd in " 
        + bouwjaar + " en heeft huisbaas " + huisBaas.toString();
    }

}
