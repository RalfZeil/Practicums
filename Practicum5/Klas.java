package Practicum5;
import java.util.ArrayList;

public class Klas {
    private String klasCode;
    private ArrayList<Leerling> deLeerlingen;


    public Klas(String klasCode) {
        this.klasCode = klasCode;
        deLeerlingen = new ArrayList<Leerling>();
    }

    public void voegLeerlingToe(Leerling l){
        deLeerlingen.add(l);
    }

    public void wijzigCijfer(String nm, double nweCijfer){
        for (Leerling temp : deLeerlingen){
            if (temp.getNaam().equals(nm)){
                temp.setCijfer(nweCijfer);
            }
        }
    }

    public ArrayList<Leerling> getLeerlingen(){
        return deLeerlingen;
    }

    public int aantalLeerlingen(){
        return deLeerlingen.size();
    }


    @Override
    public String toString() {
        String klasString = "in klas " + klasCode + " zitten de volgende leerlingen: ";
        for(Leerling temp : deLeerlingen){
            klasString = klasString + "\n" + temp.toString();
        }
        return klasString;
    }

}
