public class Soy extends CondimentDecorator {
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

    public double cost() {
		return 0.25 + beverage.cost();
	}

	public String getDescription() {
		return  "Leite de soja " + beverage.getDescription();
	}

	
}