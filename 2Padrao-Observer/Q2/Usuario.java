import java.util.List;

/**
 * Usuario
 */
public class Usuario implements Observer {
    private String nome;
    private Notificador notificaador;

    public Usuario(String nome) {
        this.nome = nome;
        this.notificaador = new Notificador();
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void atualizar(List<Produto> produtos) {
        notificaador.enviarNotificacoes(this, produtos);
    }
}