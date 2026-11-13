public class Fil extends Thread {
 
    private static int ITERACIONS = 9;


    public Fil(String nom) {
        super(nom);
    }

    @Override
    public void run() {
        //System.out.println("Soc el fil " + getName());
       for (int i = 1; i <= ITERACIONS; i++) {
            System.out.println( getName() + i);
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
}