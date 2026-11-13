
public class PrincipalEstricte {

    public static void main(String[] args) {

        Fil pepe = new Fil("Pepe", 1);
        Fil juan = new Fil("Juan", 1);

        pepe.setPriority(Thread.MIN_PRIORITY);
        juan.setPriority(Thread.MIN_PRIORITY);

        pepe.start();
        juan.start();

        System.out.println("Acaba thread main");

    }
}
