/**
 * pato
 */
abstract class Pato {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Pato() {}

    public void swim() {
        System.out.println("O pato está nadando.");
    }

    public abstract void display();

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
