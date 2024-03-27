/**
 * Casa
 */
public class Casa extends Imovel {
    public Casa(int comodos, float espaco, char localizacao) {
        super(comodos, espaco, localizacao);
        setValorComportamento(new DefinirValorComEdificacao());
    }
}
