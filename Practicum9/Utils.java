package Practicum9;

public class Utils {
    //Returnt de precisie aantal eerste waardes van de gegeven String
    public static String eersteTwee(String str, int precisie) {
        if (str.length() < 2){
            return str;
        }
        return str.substring(0, precisie);
    }

    //Zet euro teken voor de String en zet er een komma bij
    public static String verwerkString(String euro, String cent){
        String bewerktBedrag = "€";
        return bewerktBedrag + euro + "," + cent;
    }

    public static String euroBedrag(double bedrag) {
        String bedragString = Double.toString(bedrag);
        // de double backslash voor de . omdat regex de punt als 'Any Character' ziet, oof daar zat ik wel even vast
        String[] parts = bedragString.split("\\.");
        for (String str:parts){
            System.out.println(str);
        }
        return verwerkString(parts[0], eersteTwee(parts[1], 2));
    }

    public static String euroBedrag(double bedrag, int precisie) {
        String bedragString = Double.toString(bedrag);
        String[] parts = bedragString.split("\\.");
        return verwerkString(parts[0], eersteTwee(parts[1], precisie));
    }
}
