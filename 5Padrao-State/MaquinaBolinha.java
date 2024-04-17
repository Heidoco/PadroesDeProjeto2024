public class MaquinaBolinha {
    State semCredito;
    State comCredito;
    State esgotado;
    State vendido;
    State vencedor;

    State state = esgotado;
    int quantidadeBolinhas = 0;

    public MaquinaBolinha(int quantidadeBolinhas) {
		comCredito = new StateComCredito(this);
		semCredito = new StateSemCredito(this);
		esgotado = new StateEsgotado(this);
		vendido = new StateVendido(this);
		vencedor = new StateVencedor(this);

		this.quantidadeBolinhas = quantidadeBolinhas;
 		if (quantidadeBolinhas > 0) {
			state = semCredito;
		} 
	}

    void setState(State state) {
		this.state = state;
	}

    public void inserirMoeda() {
		state.inserirMoeda();
	}
 
	public void devolverMoeda() {
		state.devolverMoeda();
	}
 
	public void girarManivela() {
		state.girarManivela();
		state.entregarBolinha();
	}

}
