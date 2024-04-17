public class StateVencedor implements State {
    MaquinaBolinha maquinaBolinha;

    public StateVencedor(MaquinaBolinha maquinaBolinha) {
        this.maquinaBolinha = maquinaBolinha;
    }

    @Override
    public void inserirMoeda() {
        System.out.println("ESPERE SUAS BOLINHAS SAIREM");
    }

    @Override
    public void devolverMoeda() {
        System.out.println("MANIVELA JA FOI GIRADA!");;
    }

    @Override
    public void girarManivela() {
        System.out.println("CALMA! JA TA SAINDO");;
    }

    @Override
    public void entregarBolinha() {
        maquinaBolinha.quantidadeBolinhas = maquinaBolinha.quantidadeBolinhas - 2;
        System.out.println("TOMA 2 BOLAS AI");
        if (maquinaBolinha.quantidadeBolinhas == 0) 
        {
            maquinaBolinha.setState(maquinaBolinha.esgotado);
        }
        else
        {
            maquinaBolinha.setState(maquinaBolinha.semCredito);
        }
    }
}
