public class CeilingFan {
	String localizacao;
 
	public CeilingFan(String localizacao) {
		this.localizacao = localizacao;
	}
  
	public void on() {
		System.out.println("Ventilador " + localizacao +" ligado.");
	} 
  
	public void off() {

		System.out.println("Ventilador " + localizacao +" desligado.");
	}
  
}
