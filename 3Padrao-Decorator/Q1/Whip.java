public class Whip extends CondimentDecorator {
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return  "Creme " + beverage.getDescription();
	}
 
	public double cost() {
		return 2 + beverage.cost();
	}
}
