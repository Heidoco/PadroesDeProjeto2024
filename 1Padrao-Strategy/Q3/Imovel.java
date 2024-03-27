/**
 * Imovel
 */
abstract class Imovel {
    private DefinirValorComportamento valorComportamento;
    private int comodos;
    private float espaco;
    private char localizacao;

    public Imovel(int comodos, float espaco, char localizacao) {
        this.comodos = comodos;
        this.espaco = espaco;
        this.localizacao = localizacao;
    }

    public int getComodos() {
        return comodos;
    }

    public void setComodos(int comodos) {
        this.comodos = comodos;
    }

    public float getEspaco() {
        return espaco;
    }

    public void setEspaco(float espaco) {
        this.espaco = espaco;
    }

    public char getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(char localizacao) {
        this.localizacao = localizacao;
    }

    public void setValorComportamento(DefinirValorComportamento valorComportamento) {
        this.valorComportamento = valorComportamento;
    }

    public float calcularValor(){
        return espaco*valorComportamento.definirValor(this.localizacao) + comodos*1000 ;
    }

    
}