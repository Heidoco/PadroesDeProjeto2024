import java.util.ArrayList;
import java.util.List;

public class Loja implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        notificarObservers();
    }

    public void mudarPreco(Produto produto, float novoPreco) {
        produto.setPreco(novoPreco);
        notificarObservers();
    }

    public void alterarPreco(Produto produto, float novoPreco) {
        produto.setPreco(novoPreco);
        notificarObservers();
    }

    public void registrarObserver(Observer observer) {
        observers.add(observer);
    }

    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notificarObservers() {
        for (Observer observer : observers) {
            observer.atualizar(produtos);
        }
    }
}
