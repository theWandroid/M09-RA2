
public class PrincipalIguals {


    public static void main(String[] args) {
        
        Fil f1 = new Fil("Pepe");
        Fil f2 = new Fil("Juan");
        //Fil[] fils = {f1, f2};
        f1.run();
        f2.run();
        
        System.out.println("Acaba thread main");
       f1.start();
       f2.start();
        

    }
}
