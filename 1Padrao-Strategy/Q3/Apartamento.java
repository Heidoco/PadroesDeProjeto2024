public class Apartamento extends Imovel {
    public Apartamento(int comodos, float espaco, char localizacao) {
        super(comodos, espaco, localizacao);
        setValorComportamento(new DefinirValorComEdificacao());
    }
}