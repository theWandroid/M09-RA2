
import java.util.Random;

public class Motor extends Thread {

    private volatile int potenciaActual = 0;
    private volatile int potenciaObjectiu = 0;
    private volatile boolean haDAturar = false;
    private final Random random = new Random();

    public void setPotencia(int p) {
        if (p < 0 || p > 10) {
            System.out.println("Error de valor");
        } else {
            potenciaObjectiu = p;

            if (p == 0) {
                haDAturar = true;
            }
        }
    }

    public int getPotenciaActual() {
        return potenciaActual;
    }

    public void passaAPotencia(int p) {
        setPotencia(p);
    }

    public Motor(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            if (potenciaActual == potenciaObjectiu) {
                if (haDAturar && potenciaActual == 0) {
                    return;
                }

                int interval = random.nextInt(1, 13);

                try {
                    Thread.sleep(interval * 1000L);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }

                System.out.printf(
                        "Motor %s: FerRes. Objectiu: %d Actual: %d%n",
                        getName(), potenciaObjectiu, potenciaActual
                );
            } else {
                int interval = random.nextInt(1, 13);

                try {
                    Thread.sleep(interval * 1000L);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }

                String accio;

                if (potenciaActual < potenciaObjectiu) {
                    potenciaActual++;
                    accio = "Incre.";
                } else {
                    potenciaActual--;
                    accio = "Decre.";
                }

                System.out.printf(
                        "Motor %s: %s. Objectiu: %d Actual: %d%n",
                        getName(), accio, potenciaObjectiu, potenciaActual
                );
            }
        }
    }
}
