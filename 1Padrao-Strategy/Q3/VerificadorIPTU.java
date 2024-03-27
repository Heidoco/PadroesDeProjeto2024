public class VerificadorIPTU {
    public static void main(String[] args) {
        
        Imovel casaA = new Casa(4, 200.0f, 'A');
        Imovel casaB = new Casa(3, 150.0f, 'B');
        Imovel terrenoC = new Terreno(500.0f, 'C');

        System.out.println("Valor da casa na região A: R$" + casaA.calcularValor());
        System.out.println("Valor da casa na região B: R$" + casaB.calcularValor());
        System.out.println("Valor do terreno na região C: R$" + terrenoC.calcularValor());
    }
}
