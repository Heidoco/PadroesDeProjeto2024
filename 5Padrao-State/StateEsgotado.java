public class StateEsgotado implements State {
    MaquinaBolinha maquinaBolinha;

    public StateEsgotado(MaquinaBolinha maquinaBolinha) {
        this.maquinaBolinha = maquinaBolinha;
    }

    @Override
    public void inserirMoeda() {
        System.out.println("MAQUINA SEM BOLINHAS, TENTE NOVAMENTE OUTRA HORA");
    }

    @Override
    public void devolverMoeda() {
        System.out.println("SEM MOEDA PARA DEVOLVER!");;
    }

    @Override
    public void girarManivela() {
        System.out.println("MAQUINA SEM BOLINHAS, TENTE NOVAMENTE OUTRA HORA");;
    }

    @Override
    public void entregarBolinha() {
        System.out.println("SEM BOLINHA :(");;
    }

}
