package Practicum8;

import java.time.LocalDate;

public class Fiets extends Voertuig {
    private int framenummer;

    public Fiets(String type, double nieuwprijs, int bouwjaar, int framenummer) {
        super(type, nieuwprijs, bouwjaar);
        this.framenummer = framenummer;
    }

    public double huidigeWaarde() {
        double huidigePrijs = nieuwprijs;

        for(int i=0; i<(LocalDate.now().getYear() - bouwjaar); i++ ){
            huidigePrijs = huidigePrijs * 0.90;
        }
        
        return huidigePrijs;
    }
    
}
