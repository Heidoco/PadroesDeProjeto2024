public class Decaf extends Beverage {
    Beverage beverage;

    public Decaf() {
        description = "Descafeinado";
    }

    public Decaf(Beverage beverage) {
		this.beverage = beverage;
        description = "Descafeinado " + beverage.getDescription();
	}

    public double cost() {
        double cost = 5;
        if (beverage != null) {
            cost += beverage.cost();
        }
        return cost;
    }
}
