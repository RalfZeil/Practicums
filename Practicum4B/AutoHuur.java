package Practicum4B;

public class AutoHuur {
    private int aantalDagen;

    private Klant huurder;
    private Auto gehuurdeAuto;


    public AutoHuur() {}

    public void setAantalDagen(int aantalDagen)     { this.aantalDagen = aantalDagen; }
    public int getAantalDagen()                     { return aantalDagen; }

    public void setGehuurdeAuto(Auto gA)            { this.gehuurdeAuto = gA; }
    public Auto getGehuurdeAuto()                   { return gehuurdeAuto; }

    public void setHuurder(Klant k)                 { this.huurder = k; }
    public Klant getHuurder()                       { return huurder; }

    public double totaalPrijs(){
        if(gehuurdeAuto != null && huurder != null){
            return aantalDagen * gehuurdeAuto.getPrijsPerDag() * (1 - huurder.getKorting() / 100);
        }
        else{ return 0.0; }
    }

    @Override
    public String toString() {
        String autoStr;
        String klantStr;

        if(gehuurdeAuto == null){
            autoStr = "er is geen auto bekend";
        }
        else{
            autoStr = "auto type: " + gehuurdeAuto.toString();
        }

        if(huurder == null){
            klantStr = "er is geen huurder bekend";
        }
        else{
            klantStr = "op naam van: " + huurder.toString();
        }

        return autoStr + "\n" +
            klantStr+ "\n" +
            "aantal dagen: " + aantalDagen +
            " en dat kost: " + totaalPrijs();
    }
    
}
