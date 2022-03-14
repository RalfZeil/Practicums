package Practicum7;

import java.util.ArrayList;

public class StringProcessor {
    private ArrayList<OpmaakProces> processen;

    public StringProcessor(){
        processen = new ArrayList<>();
    }

    public String verwerk(String input){
        String nieuw = input;

        for (OpmaakProces process : processen){
            nieuw = process.maakOp(nieuw);
        }

        return nieuw;
    }

    public void voegProcesToe(OpmaakProces proces){
        processen.add(proces);
    }



}
