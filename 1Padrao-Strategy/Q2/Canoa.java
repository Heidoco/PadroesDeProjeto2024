public class Canoa extends Barco {
    public Canoa() {
        setMetodoMover(new Remo());
    }

    public void mostrar()
    {
        System.out.println("Canoa");
    }
}
