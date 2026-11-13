
public class Fil extends Thread {

    private final int ITERACIONS = 9;
    private final int FEINA = 1000;
    private final int DELAY;

    public Fil(String nom) {
        super(nom);
        this.DELAY = 0;
    }

    public Fil(String nom, int delay) {
        super(nom);
        this.DELAY = delay;
    }

    @Override
    public void run() {
        //System.out.println("Soc el fil " + getName());
        if(DELAY == 0)
            runAmbFeina();
        else{
           try {
               runAmbDelay();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
        }
        System.out.println("Acaba fil " + getName());
    }

    private void runAmbFeina() {
        for (int i = 1; i <= ITERACIONS; i++) {
            System.out.println(getName() + " " + i);
            for (int j = 0; j < FEINA; j++) {
            }
        }
    }

    private void runAmbDelay() throws InterruptedException {
        for (int i = 1; i <= ITERACIONS; i++) {
            System.out.println(getName() + " " + i);
        Thread.sleep(DELAY);

        }
    }
}

/*
    public static void main(String[] args) {
        Fil f = new Fil("A");
       System.out.println("Inici");
       f.start();
       System.out.println("Final");
    }
 */

