public class RedheadDuck extends Pato {
    public RedheadDuck(){
        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyWithWings());
    }


    public void display(){
        System.out.println("Redhead");
    }

}
