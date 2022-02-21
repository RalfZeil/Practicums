package Practicum3B;

public class Cirkel{
    private int radius;
    private int xPositie;
    private int yPositie;

    public Cirkel(int rad, int xPos, int yPos){
        if (rad <= 0){
            throw new IllegalArgumentException("Radius moet groter dan 0 zijn!");
        }
        else{
            radius = rad;
            xPositie = xPos;
            yPositie = yPos;
        }
    }

    public String toString(){
        return "crikel (" + xPositie + ", " + yPositie+ ") met radius: " + radius;
    }
}