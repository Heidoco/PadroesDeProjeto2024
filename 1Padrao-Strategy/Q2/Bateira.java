public class Bateira extends Barco {
    public Bateira() {
        setMetodoMover(new Remo());
    }

    public void mostrar()
    {
        System.out.println("Bateira");
    }
}
