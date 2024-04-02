public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return 50 + beverage.cost();
    }

    public String getDescription() {
        return "Chocolatinho " + beverage.getDescription();
    }
}
