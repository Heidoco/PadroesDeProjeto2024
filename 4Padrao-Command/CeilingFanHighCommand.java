public class CeilingFanHighCommand implements Command {
	CeilingFan ceilingFan;
  
	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
 
	public void execute() {
		ceilingFan.on();
	}
 
	public void undo() {
		ceilingFan.off();
	}
}
