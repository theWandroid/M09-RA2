
public class PrincipalIguals {

    public static void main(String[] args) {
        
        Fil pepe = new Fil("Pepe");
        Fil juan = new Fil("Juan");
        //Fil[] fils = {f1, f2};
       //Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
       pepe.setPriority(Thread.MAX_PRIORITY);
       juan.setPriority(Thread.MAX_PRIORITY);

       pepe.start();
       juan.start();

       System.out.println("Acaba thread main");


    }
}
