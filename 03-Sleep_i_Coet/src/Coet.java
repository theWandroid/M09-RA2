
import java.util.Scanner;

public class Coet {

    Scanner sc = new Scanner(System.in);

    private final int NUM_MOTORS = 4;
    private Motor[] motors = new Motor[NUM_MOTORS];

    public Coet() {
        for (int i = 0; i < NUM_MOTORS; i++) {
            motors[i] = new Motor(Integer.toString(i));
        }

    }

    public static void main(String[] args) {
        Coet test = new Coet();
        test.arranca();
    }

    public void arranca() {
        for (int i = 0; i < NUM_MOTORS; i++) {

            motors[i].start();
        }
        String potencia = "";
        potencia = sc.nextLine();
        int num = -1;
        try {
            num = Integer.parseInt(potencia);

        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("Passant a potencia "+ num);
        for (int i = 0; i < NUM_MOTORS; i++) {
            motors[i].passaAPotencia(num);
        }

        while (num != 0) {
            potencia = sc.nextLine();
            try {
                num = Integer.parseInt(potencia);

            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                return;
            }
        System.out.println("Passant a potencia "+ num);

            for (int i = 0; i < NUM_MOTORS; i++) {
                motors[i].passaAPotencia(num);
            }

        }

        try {
            for (int i = 0; i < NUM_MOTORS; i++) {
                motors[i].join();
            }
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
            return;
        }
        System.out.println("Fins aviat!");
        return;

    }

}
