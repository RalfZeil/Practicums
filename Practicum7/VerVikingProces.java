package Practicum7;

public class VerVikingProces implements OpmaakProces {
    public VerVikingProces(){}

    public String maakOp(String input){
        String nieuw = input;

        nieuw = nieuw.replace("o", "ö");
        nieuw = nieuw.replace("a", "ä");
        nieuw = nieuw.replace("e", "ë");
        nieuw = nieuw.replace("u", "ü");
        nieuw = nieuw.replace("i", "ï");

        return nieuw;
    }
}
