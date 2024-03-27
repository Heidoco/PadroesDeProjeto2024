public class MallardDuck extends Pato {
    public MallardDuck(){
        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyWithWings());
    }

    @Override
    public void display() {
        System.out.println("Pato Mallard");
    }
}
