package Practicum2;

public class Zwembad{

    private double lengte;
    private double breedte;
    private double diepte;

    public Zwembad( double lg, double br, double dp ){
        lengte = lg;
        breedte = br;
        diepte = dp;
    }

    public Zwembad(){}

    //Setters
    public void setLengte   (double lg) { lengte    = lg; }
    public void setBreedte  (double br) { breedte   = br; }
    public void setDiepte   (double dp) { diepte    = dp; }

    //Getters
    public double getLengte  () { return lengte;  }
    public double getBreedte () { return breedte; }
    public double getDiepte  () { return diepte;  }

    //Calculate inhoud of the zwembad and return in
    public double inhoud()  { return (lengte * breedte * diepte); }

    public String toString(){
        return "Dit zwembad is " + breedte + " meter breed, " + lengte + " meter lang, en " + diepte + " meter diep";
    }
}
