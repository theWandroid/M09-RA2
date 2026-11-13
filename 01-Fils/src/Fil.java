public class Fil extends Thread {

    private int count = 0;

    public Fil(String nom) {
        super(nom);
    }

    @Override
    public void run() {
        //System.out.println("Soc el fil " + getName());
        System.out.println(getName()+count++);
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