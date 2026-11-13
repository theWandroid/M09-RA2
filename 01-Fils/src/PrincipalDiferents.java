
public class PrincipalDiferents {

    public static void main(String[] args) {
        
        Fil pepe = new Fil("Pepe");
        Fil juan = new Fil("Juan");
       pepe.setPriority(Thread.MAX_PRIORITY);
       juan.setPriority(Thread.MIN_PRIORITY);

       pepe.start();
       juan.start();

       System.out.println("Acaba thread main");


    }
}
