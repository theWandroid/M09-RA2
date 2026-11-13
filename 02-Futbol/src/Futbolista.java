public class Futbolista extends  Thread{
    public Futbolista(String nom){
        super(nom);
    }
    @Override public void run(){
        System.out.println("Soc el fil"+getName());
    }

    public static void main(String[] args) {
        Futbolista f1 = new Futbolista("Pepe");
        Futbolista f2 = new Futbolista("Juan");
        f1.start();
        f2.start();
    }
}
