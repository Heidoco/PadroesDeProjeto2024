/**
 * Cafeteria
 */
public class Cafeteria {

    public static void main(String[] args) {
        Beverage cafezinho = new Espresso();
        cafezinho.setTamanho("P");
        cafezinho = new Milk(cafezinho);
        cafezinho = new Whip(cafezinho);
        System.out.println(cafezinho.cost() + " " + cafezinho.getDescription());

        Beverage cafezinhoo = new DarkRoast();
        cafezinhoo.setTamanho("G");
        cafezinhoo = new Soy(cafezinhoo);
        cafezinhoo = new Mocha(cafezinhoo);
        
        System.out.println(cafezinhoo.cost() + " " + cafezinhoo.getDescription() + " Grande.");

        Beverage cafepequeno = new DarkRoast();
		cafepequeno.setTamanho("P");
		cafepequeno = new Soy(cafepequeno);
        cafepequeno = new Mocha(cafepequeno);

        System.out.println(cafepequeno.cost() + " " + cafepequeno.getDescription() + " Pequeno.");
    }
}