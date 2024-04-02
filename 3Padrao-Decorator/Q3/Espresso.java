public class Espresso extends Beverage{
    Beverage beverage;
    
    public Espresso() {
        description = "EXpresso"; 
    }

    public Espresso(Beverage beverage) {
        this.beverage = beverage;
        description = "EXpresso " + beverage.getDescription();
		
	}

    public double cost() {
        double cost = 0.5;
        if (beverage != null) {
            cost += beverage.cost();
        }
        return cost;
    }
}
