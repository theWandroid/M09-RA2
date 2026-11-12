public class Fil extends Thread {

    public Fil(String nom) {
        super(nom);
    }

    @Override
    public void run() {
        System.out.println("Soc el fil " + getName());
    }
}