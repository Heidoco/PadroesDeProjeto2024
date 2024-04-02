/**
 * Cafeteria
 */
public class Cafeteria {

    public static void main(String[] args) {
        Beverage cafezinhoo = new DarkRoast();
        cafezinhoo.setTamanho("G");
        cafezinhoo = new Soy(cafezinhoo);
        cafezinhoo = new DarkRoast(cafezinhoo);
        cafezinhoo = new DarkRoast(cafezinhoo);
        cafezinhoo = new Espresso(cafezinhoo);
        cafezinhoo = new Mocha(cafezinhoo);
        
        System.out.println(cafezinhoo.cost() + " " + cafezinhoo.getDescription() + " Grande.");

    }
}