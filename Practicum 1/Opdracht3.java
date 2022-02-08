import java.lang.Math;

public class Opdracht3 {
    public static void main(String[] args) {

        double randomNum = Math.random();
        for( int i=1; i <= 10; i++){
            System.out.println(randomNum);
            randomNum = Math.random();
        }
    }
}
