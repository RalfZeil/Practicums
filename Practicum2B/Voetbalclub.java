package Practicum2B;
public class Voetbalclub{
    private String clubNaam;

    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;

    public Voetbalclub(String nm){
        if(nm == ""){
          clubNaam = "FC";
        }
        else{
        clubNaam = nm;
        }
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
          aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
          aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
          aantalVerloren = aantalVerloren + 1;
      }

    public int aantalPunten()       { return (aantalGewonnen * 3) + (aantalGelijk * 1); }
    public int aantalGespeeld()     { return aantalGewonnen + aantalGelijk + aantalVerloren; }

    public String toString() {
        return String.format("%s %o %o %o %o %o", 
                                clubNaam, 
                                aantalGespeeld(), 
                                aantalGewonnen, 
                                aantalGelijk, 
                                aantalVerloren, 
                                aantalPunten());
    }
}