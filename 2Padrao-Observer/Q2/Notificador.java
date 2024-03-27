import java.util.List;

public class Notificador {
    public void enviarNotificacoes(Usuario usuario, List<Produto> produtos) {
        System.out.println("Usuário " + usuario.getNome() + " atualizado com novas informações dos produtos:");
        for (Produto produto : produtos) {
            System.out.println(produto.getNome() + " - R$" + produto.getPreco());
        }
    }
}