public class Soy extends CondimentDecorator {
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

    public double cost() {
		if (beverage.getTamanho() == "P") 
		{
			return beverage.cost() + 0.1;
		} 
		else if (beverage.getTamanho() == "M") 
		{
			return beverage.cost() + 0.15;
		}
		else
		{
			return beverage.cost() + 0.20;
		}
	}

	public String getDescription() {
		return  "Leite de soja " + beverage.getDescription();
	}

	
}