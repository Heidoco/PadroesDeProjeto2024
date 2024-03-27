public class RubberDuck extends Pato{
    public RubberDuck(){
        setQuackBehavior(new Squeak());
        setFlyBehavior(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("Pato de borracha");
    }
}
