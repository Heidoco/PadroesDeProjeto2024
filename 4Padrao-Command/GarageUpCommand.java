public class GarageUpCommand implements Command{
    GarageDoor garagem;
  
	public GarageUpCommand(GarageDoor garagem) {
		this.garagem = garagem;
	}
 
	public void execute() {
		garagem.up();
	}
 
	public void undo() {
		garagem.down();
	}
}
