public class Terreno extends Imovel {
    public Terreno(float espaco, char localizacao) {
        super(0, espaco, localizacao);
        setValorComportamento(new DefinirValorSemEdificacao());
    }
}
