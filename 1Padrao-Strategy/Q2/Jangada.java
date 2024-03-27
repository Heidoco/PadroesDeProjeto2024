public class Jangada extends Barco {
    public Jangada() {
        setMetodoMover(new Remo());
    }

    public void mostrar()
    {
        System.out.println("Jangada");
    }
}