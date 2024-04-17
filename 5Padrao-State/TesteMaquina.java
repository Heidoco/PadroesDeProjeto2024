public class TesteMaquina {
    public static void main(String[] args) {
        MaquinaBolinha maquina = new MaquinaBolinha(5);

        maquina.inserirMoeda();
        maquina.girarManivela();

        maquina.inserirMoeda();
        maquina.inserirMoeda();
        maquina.girarManivela();

        maquina.girarManivela();

        maquina.devolverMoeda();

        maquina.girarManivela();
        maquina.girarManivela();

        maquina.inserirMoeda();
        maquina.girarManivela();
        maquina.devolverMoeda();
        maquina.girarManivela();
    }
}
