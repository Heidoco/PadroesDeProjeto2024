public class DefinirValorSemEdificacao implements DefinirValorComportamento {
    public float definirValor(char localizacao) {
        switch (localizacao) {
            case 'A':
                return 1500.0f;
            case 'B':
                return 750.0f;
            case 'C':
                return 200.0f;
            default:
                return 0.0f; // Localização inválida
        }
    }
}