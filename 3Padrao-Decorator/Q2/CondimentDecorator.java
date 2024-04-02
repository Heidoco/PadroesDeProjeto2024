/**
 * CondimentDecorator
 */
public abstract class CondimentDecorator extends Beverage{
    Beverage beverage;
    public abstract String getDescription();
    public String getTamanho()
    {
        return beverage.getTamanho();
    }

    
}