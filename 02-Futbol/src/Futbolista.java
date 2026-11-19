
import java.util.Random;

public class Futbolista extends Thread {

    private static final int NUM_JUGADORS = 11;
    private static final int NUM_TIRADES = 20;
    private static final float PROBABILITAT = 0.5f;

    private int gols;

    public int getGols(){
        return  gols;
    }

    public Futbolista(String nom) {
        super(nom);
        gols = 0;
    }

    @Override
    public void run() {
        Random random = new Random();

        //System.out.println("Soc el fil" + getName());

        for (int i = 0; i < NUM_TIRADES; i++) {

            if (random.nextFloat() < PROBABILITAT) {
                gols++;
            }
            //System.out.println(gols + " gols.");

        }
    }

    public static void main(String[] args) {

        Futbolista[] jugadors = new Futbolista[NUM_JUGADORS];
        String[] plantilla
                = {"Piqué", "Vinicius", "Torres", "Ramos", "Ronaldo", "Lewan", "Belli", "Arnau", "Aspas", "Messi", "MBapé"};
        System.out.println("Inici dels xuts --------------------");

        for (int i = 0; i < jugadors.length; i++) {
            jugadors[i] = new Futbolista(plantilla[i]);
            jugadors[i].start();
        }


        for (int i = 0; i < jugadors.length; i++){
            try {
                jugadors[i].join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println(jugadors[i]+" "+e.getMessage());
            }
        }

        System.out.println("Fi dels xuts -----------------------");

        System.out.println("--- Estadístiques ------");


        for (int i = 0; i < jugadors.length; i++){
            System.out.printf("%-10s -> %d gols%n",jugadors[i].getName(), jugadors[i].getGols());
        }

        


    }

    /*
    
    for(int i=0; i<NUM_TIRADES; i++)

     */
}
