/**
 * Barco
 */
abstract class Barco {
    public Barco() {}

    private MetodoMover metodoMover;

    public abstract void mostrar();

    public void navegar()
    {
        metodoMover.mover();
    }

    public void setMetodoMover(MetodoMover metodoMover) {
        this.metodoMover = metodoMover;
    }

}