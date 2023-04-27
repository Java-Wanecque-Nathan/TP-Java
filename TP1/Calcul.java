package TP1;
import java.util.Random;

public class Calcul {
    private int nbrX;
    private int nbrY;
    private int result;
    Random random = new Random();

    public Calcul(){
        this.nbrY = random.nextInt(10) + 1;
        this.nbrX = random.nextInt(10) + 1;
        this.result = nbrX * nbrY;
    }

    public int getNbrX(){
        return nbrX;
    }

    public int getNbrY(){
        return nbrY;
    }

    public int getResult(){
        return result;
    }
}
