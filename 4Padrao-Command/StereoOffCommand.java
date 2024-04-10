public class StereoOffCommand implements Command{
    Stereo som;
  
	public StereoOffCommand(Stereo som) {
		this.som = som;
	}
 
	public void execute() {
		som.off();
	}
 
	public void undo() {
		som.on();
	}
}
