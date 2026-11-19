import java.util.Random;

public class Futbolista extends Thread {

    private static final int NUM_JUGADORS = 11;
    private static final int NUM_TIRADES = 20;
    private static final float PROBABILITAT = 0.5f;

    private int gols;

    public Futbolista(String nom) {
        super(nom);
        gols = 0;
    }

    @Override
    public void run() {
        Random randomNum = new Random();


        System.out.println("Soc el fil" + getName());

        for (int i = 0; i < NUM_TIRADES; i++) {

            randomNum *= 1*PROBABILITAT;
            gols = 
            if(randomNum == 1)goal
        }
    }

    public static void main(String[] args) {
        Futbolista f1 = new Futbolista("Pepe");
        Futbolista f2 = new Futbolista("Juan");
        f1.start();
        f2.start();
    }

    /*
    
    for(int i=0; i<NUM_TIRADES; i++)

     */
}
