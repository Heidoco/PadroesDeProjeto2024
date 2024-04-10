public class StereoOnWithCDCommand implements Command{
    Stereo som;
  
	public StereoOnWithCDCommand(Stereo som) {
		this.som = som;
	}
 
	public void execute() {
		som.on();
	}
 
	public void undo() {
		som.off();
	}
}
