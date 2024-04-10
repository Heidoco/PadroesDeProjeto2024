public class GarageDownCommand implements Command{
    GarageDoor garagem;
  
	public GarageDownCommand(GarageDoor garagem) {
		this.garagem = garagem;
	}
 
	public void execute() {
		garagem.down();
	}
 
	public void undo() {
		garagem.up();
	}
}

