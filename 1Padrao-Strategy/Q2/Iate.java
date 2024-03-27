public class Iate extends Barco {
    public Iate() {
        setMetodoMover(new Motor());
    }

    public void mostrar()
    {
        System.out.println("Barco Iate");
    }
}