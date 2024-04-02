public class DarkRoast extends Beverage {
    Beverage beverage;
    
    public double cost() {
        double cost = 1.66;
        if (beverage != null) {
            cost += beverage.cost();
        }
        return cost;
    }

    public DarkRoast() {
        description = "Cafe preto";
	}

    public DarkRoast(Beverage beverage) {
        this.beverage = beverage;
        description = "Cafe preto " + beverage.getDescription();
		
	}

    
}
