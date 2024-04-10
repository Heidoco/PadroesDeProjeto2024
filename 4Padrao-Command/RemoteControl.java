public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
    Command undoCommand;
 
	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		for (int i = 0; i < onCommands.length; i++) {
			onCommands[i] = new NoCommand();
		}
		for (int i = 0; i < offCommands.length; i++) {
			offCommands[i] = new NoCommand();
		}
	}
  
	public void setCommand(int slot, Command comando_on, Command comando_off) {
		onCommands[slot] = comando_on;
		offCommands[slot] = comando_off;
	}
 
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
        undoCommand = onCommands[slot];
	}
 
	public void offButtonWasPushed(int slot) {
        undoCommand = offCommands[slot];
		offCommands[slot].execute();
	}

    public void botaoUndo() {
		undoCommand.undo();
	}

	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("Controle daora \n");
		for (int i = 0; i < onCommands.length; i++) {
			stringBuff.append("|Espaço " + i + "| " + onCommands[i].getClass().getName() + "  |  " + offCommands[i].getClass().getName() + "|\n");
		}
		return stringBuff.toString();
	}

}

