public class Simulador {
    public static void main(String[] args) {
        Pato borrachao = new RubberDuck();
        Pato normallard = new MallardDuck();
        

        System.out.println("Pato borrachao:");
        borrachao.display();
        borrachao.swim();
        borrachao.performQuack();
        borrachao.performFly();
        System.out.println();
        
        System.out.println("Pato Mallard:");
        normallard.display();
        normallard.swim();
        normallard.performQuack();
        normallard.performFly();
    }
}
