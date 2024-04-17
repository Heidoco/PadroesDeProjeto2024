public class StateVendido implements State{

    MaquinaBolinha maquinaBolinha;

    public StateVendido(MaquinaBolinha maquinaBolinha) {
        this.maquinaBolinha = maquinaBolinha;
    }

    @Override
    public void inserirMoeda() {
        System.out.println("ESPERA ATÉ A PRIMEIRA BOLINHA SAIR!");
    }

    @Override
    public void devolverMoeda() {
        System.out.println("VOCE JA GIROU A MANIVELA! SEM REEMBOLSO AGORA");

    }

    @Override
    public void girarManivela() {
        System.out.println("SOMENTE 1 BOLINHA DESSA VEZ");
    }

    @Override
    public void entregarBolinha() {
        maquinaBolinha.quantidadeBolinhas--;
        System.out.println("PEGUE SUA BOLINHA!");
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
