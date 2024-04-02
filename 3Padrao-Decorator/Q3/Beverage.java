public abstract class Beverage {
	String description = "Bebida";
	String tamanho;
  
	public String getDescription() {
		return description;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getTamanho() {
		return tamanho;
	}
 
	public abstract double cost();
}
