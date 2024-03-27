
public class Ecommerce {
    public static void main(String[] args) {
        // Criando uma instância da loja
        Loja loja = new Loja();


        Produto produto1 = new Produto("Banana", 100000, 1);
        Produto produto2 = new Produto("Cafe", 50, 2);

        Usuario usuario1 = new Usuario("Jorge");
        Usuario usuario2 = new Usuario("Roberto");

        loja.registrarObserver(usuario1);
        loja.registrarObserver(usuario2);

        loja.adicionarProduto(produto1);
        loja.adicionarProduto(produto2);

        loja.alterarPreco(produto1, 15.0f);
    }
}