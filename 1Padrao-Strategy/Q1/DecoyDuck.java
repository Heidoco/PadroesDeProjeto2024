public class DecoyDuck extends Pato{
    public DecoyDuck(){
        setQuackBehavior(new MuteQuack());
        setFlyBehavior(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("Pato de mentira");
    }
}
