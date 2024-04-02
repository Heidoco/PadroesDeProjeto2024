/**
 * Cafeteria
 */
public class Cafeteria {

    public static void main(String[] args) {
        Beverage cafezinho = new Espresso();
        cafezinho = new Milk(cafezinho);
        cafezinho = new Whip(cafezinho);
        System.out.println(cafezinho.cost() + " " + cafezinho.getDescription());

        Beverage cafezinhoo = new DarkRoast();
        cafezinhoo = new Mocha(cafezinhoo);
        cafezinhoo = new Soy(cafezinhoo);
        System.out.println(cafezinhoo.cost() + " " + cafezinhoo.getDescription());

    }
}