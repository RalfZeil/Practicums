package Practicum8;

import java.time.LocalDate;

public class Computer implements Goed {
    private String type;
    private String macAdres;
    private double aanschafPrijs;
    private int productieJaar;


    public Computer(String type, String macAdres, double aanschafPrijs, int productieJaar) {
        this.type = type;
        this.macAdres = macAdres;
        this.aanschafPrijs = aanschafPrijs;
        this.productieJaar = productieJaar;
    }
    
    public double huidigeWaarde() {
        double huidigePrijs = aanschafPrijs;

        for(int i=0; i<(LocalDate.now().getYear() - productieJaar); i++ ){
            huidigePrijs = huidigePrijs * 0.60;
        }
        
        return huidigePrijs;
    }

    public boolean equals(Object object) {
        boolean gelijkeObject = false;

        if (object instanceof Computer){
            Computer andereComputer = (Computer) object;

            if( this.type.equals(andereComputer.type) &&
                this.macAdres == andereComputer.macAdres){
                    gelijkeObject = true;
                }
        }

        return gelijkeObject;
    }

    public String toString() {
        return "Computer: " + type + " met productie jaar " + productieJaar + " heeft een waarde van: " + String.format("%.2f", this.huidigeWaarde()) ;
    }
    
}
