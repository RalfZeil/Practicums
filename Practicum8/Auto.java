package Practicum8;

import java.time.LocalDate;

public class Auto extends Voertuig {
    private String kenteken;


    public Auto(String type, double nieuwprijs, int bouwjaar, String kenteken) {
        super(type, nieuwprijs, bouwjaar);
        this.kenteken = kenteken;
    }

    public double huidigeWaarde() {
        double huidigePrijs = nieuwprijs;

        for(int i=0; i<(LocalDate.now().getYear() - bouwjaar); i++ ){
            huidigePrijs = huidigePrijs * 0.70;
        }
        
        return huidigePrijs;
    }

}
