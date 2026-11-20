
import java.util.Random;

public class DormAleatori extends Thread {

    private final Random random = new Random();
    private long totalTemps;
    private int ITERACIONS = 10;

    public DormAleatori(String nom) {
        super(nom);
    }

    @Override
    public void run() {
        for (int i = 0; i < ITERACIONS; i++) {
            int interval = random.nextInt(0, 1000);
            totalTemps += interval;

            System.out.printf("%-5s(%d) a dormir %4dms total %5dms%n", getName(), i, interval, totalTemps);

            try {
                Thread.sleep(interval);

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

    }

    public static void main(String[] args) {
        DormAleatori joan = new DormAleatori("Joan");
        DormAleatori pep = new DormAleatori("Pep");
        joan.start();
        pep.start();

        try {
            joan.join();
            pep.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }

}
