public class Light {
	String localizacao;

	public Light(String localizacao) {
		this.localizacao = localizacao;
	}

	public void on() {
		System.out.println("Luz ligada");
	}

	public void off() {
		System.out.println("Luz Desligada");
	}


}
