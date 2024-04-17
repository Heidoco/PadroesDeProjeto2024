public class StateSemCredito implements State {
    MaquinaBolinha maquinaBolinha;

    public StateSemCredito(MaquinaBolinha maquinaBolinha) {
        this.maquinaBolinha = maquinaBolinha;
    }

    @Override
    public void inserirMoeda() {
        maquinaBolinha.setState(maquinaBolinha.comCredito);
        System.out.println("INSERIU MOEDA DE 2000 REAIS");
    }

    @Override
    public void devolverMoeda() {
        System.out.println("SEM MOEDA PARA DEVOLVER!");;
    }

    @Override
    public void girarManivela() {
        System.out.println("INSIRA A MOEDA PRIMEIRO!");;
    }

    @Override
    public void entregarBolinha() {
        System.out.println("INSIRA A MOEDA E GIRE A MANIVELA PRIMEIRO!");;
    }

}
