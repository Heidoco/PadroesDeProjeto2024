public class BarcoAVela extends Barco {
    public BarcoAVela() {
        setMetodoMover(new Vela());
    }

    public void mostrar()
    {
        System.out.println("Barco a Vela");
    }
}