import java.util.Random;

public class StateComCredito implements State {
    MaquinaBolinha maquinaBolinha;
    private Random random;

    public StateComCredito(MaquinaBolinha maquinaBolinha) {
        this.maquinaBolinha = maquinaBolinha;
        this.random = new Random();
    }

    @Override
    public void inserirMoeda() {
        System.out.println("SÓ PRECISA DE UMA MOEDA!");
        
    }

    @Override
    public void devolverMoeda() {
        System.out.println("MOEDA DEVOLVIDA!");
        maquinaBolinha.setState(maquinaBolinha.semCredito);
    }

    @Override
    public void girarManivela() {
        System.out.println("MANIVELA GIRANDO, SERA QUE VAI TER SORTE?");
        int sorte = random.nextInt(10);
        if (sorte == 9 && maquinaBolinha.quantidadeBolinhas > 1) {
            System.out.println("PARABÉNS! VOCE VAI GANHAR 2 BOLINHAS!");
            maquinaBolinha.setState(maquinaBolinha.vencedor);
        } else {
            System.out.println("VOCE VAI GANHAR 1 BOLINHA!");
            maquinaBolinha.setState(maquinaBolinha.vendido);
        }
        
    }
    
    @Override
    public void entregarBolinha() {
        System.out.println("NENHUMA BOLINHA!");
        
    }
    
}
