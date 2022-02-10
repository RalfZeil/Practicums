package Practicum1;
public class Opdracht5 {
    public static void main(String[] args) {
        String zaag = "s";
        int zaagLengte = 10;

        for (int i=1; i<zaagLengte; i++){

            if(i % 2 == 0){
                zaag = "ss";
            }
            else{
                zaag = "s";
            }

            System.out.println(zaag);
        }
    }
}
