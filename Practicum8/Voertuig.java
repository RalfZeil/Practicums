package Practicum8;

public abstract class Voertuig implements Goed {
    private String type;
    protected double nieuwprijs;
    protected int bouwjaar;


    public Voertuig(String type, double nieuwprijs, int bouwjaar) {
        this.type = type;
        this.nieuwprijs = nieuwprijs;
        this.bouwjaar = bouwjaar;
    }

    public boolean equals(Object object) {
        boolean gelijkeObject = false;

        if (object instanceof Voertuig){
            Voertuig andereVoertuig = (Voertuig) object;

            if( this.type.equals(andereVoertuig.type) &&
                this.bouwjaar == andereVoertuig.bouwjaar){
                    gelijkeObject = true;
                }
        }

        return gelijkeObject;
    }

    public String toString() {
        return "Voertuig: " + type + " met bouwjaar " + bouwjaar + " heeft een waarde van: " + Utils.euroBedrag(this.huidigeWaarde()) ;
    }
}
