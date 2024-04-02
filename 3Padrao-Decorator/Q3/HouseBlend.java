public class HouseBlend extends Beverage {
    Beverage beverage;

    public HouseBlend() {
        description = "Especial";
    }

    public HouseBlend(Beverage beverage) {
        this.beverage = beverage;
        description = "Especial " + beverage.getDescription();
		
	}

    public double cost() {
        double cost = 25;
        if (beverage != null) {
            cost += beverage.cost();
        }
        return cost;
    }
}


