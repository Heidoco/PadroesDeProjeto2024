public class DefinirValorComEdificacao implements DefinirValorComportamento{
    public float definirValor(char localizacao) {
        switch (localizacao) {
            case 'A':
                return 3000.0f;
            case 'B':
                return 1000.0f;
            case 'C':
                return 500.0f;
            default:
                return 0.0f;
        }
    }
}
