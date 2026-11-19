
public class MainDemoFil {

    public static void main(String[] args) {
        Thread filActual = Thread.currentThread();
        //filActual.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Prioritat -> "+ filActual.getPriority()+", Nom: "+filActual.getName());
        System.out.println(filActual.toString());

    }

}
