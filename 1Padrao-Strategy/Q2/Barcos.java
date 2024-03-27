public class Barcos {
    public static void main(String[] args) {
        Bateira bateira = new Bateira();
        Iate iate = new Iate();
        Canoa canoa = new Canoa();
        Jangada jangada = new Jangada();
        BarcoAVela barcoAVela = new BarcoAVela();
        
        System.out.println("--- Testando a Bateira ---");
        bateira.navegar();
        bateira.mostrar();
        System.out.println();
        
        System.out.println("--- Testando o Iate ---");
        iate.navegar();
        iate.mostrar();
        System.out.println();
        
        System.out.println("--- Testando a Canoa ---");
        canoa.navegar();
        canoa.mostrar();
        System.out.println();
        
        System.out.println("--- Testando a Jangada ---");
        jangada.navegar();
        jangada.mostrar();
        System.out.println();
        
        System.out.println("--- Testando o Barco a Vela ---");
        barcoAVela.navegar();
        barcoAVela.mostrar();
    }
}
