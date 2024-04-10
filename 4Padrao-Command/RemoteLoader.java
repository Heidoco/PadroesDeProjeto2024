public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl controle = new RemoteControl();

        Light luzDaSala = new Light("Sala");
        LightOnCommand luzDaSalaLigado = 
				new LightOnCommand(luzDaSala);
		LightOffCommand luzDaSalaDesligado = 
				new LightOffCommand(luzDaSala);

		GarageDoor garagem = new GarageDoor();
		GarageUpCommand garagemAberta = new GarageUpCommand(garagem);
		GarageDownCommand garagemFechada = new GarageDownCommand(garagem);

		CeilingFan ventilador = new CeilingFan("Sala");
		CeilingFanOffCommand ventiladorDesligado = new CeilingFanOffCommand(ventilador);
		CeilingFanHighCommand ventiladorRapidao = new CeilingFanHighCommand(ventilador);

		Stereo somzao = new Stereo("Sala");
		StereoOnWithCDCommand somzaoLigado = new StereoOnWithCDCommand(somzao);
		StereoOffCommand somzaoDesligado = new StereoOffCommand(somzao);
 
		
        controle.setCommand(0, luzDaSalaLigado, luzDaSalaDesligado);
		controle.setCommand(1, garagemAberta, garagemFechada);
		controle.setCommand(2, ventiladorDesligado, ventiladorRapidao);
		controle.setCommand(3, somzaoLigado, somzaoDesligado);

		System.out.println(controle);

        controle.onButtonWasPushed(0);
		controle.offButtonWasPushed(0);
		controle.botaoUndo();
		
		controle.onButtonWasPushed(1);
		controle.offButtonWasPushed(1);
		controle.botaoUndo();

		
		controle.onButtonWasPushed(2);
		controle.offButtonWasPushed(2);
		controle.botaoUndo();

		
		controle.onButtonWasPushed(3);
		controle.offButtonWasPushed(3);
		controle.botaoUndo();

       
    }
}
