public class Stereo {
	String localizacao;
 
	public Stereo(String localizacao) {
		this.localizacao = localizacao;
	}
  
	public void on() {
		System.out.println("Som " + localizacao +" ligado.");
	} 
  
	public void off() {

		System.out.println("Som " + localizacao +" desligado.");
	}
  
}
