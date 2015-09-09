import java.util.ArrayList;
import java.util.List;

public class Modify {

	private List<Command> undoList = new ArrayList<Command>();
	private List<Command> redoList = new ArrayList<Command>();

	public void invokeCommand(Command command) {
		// begin-user-code

		if (command instanceof pushbackCommand
				|| command instanceof popbackCommand
				|| command instanceof setCommand) {
			this.undoList.add(command);
		}
		command.execute();
		// end-user-code
	}

	public void Undo() {
		if (undoList.size() > 0) {
			Command cmd = undoList.get(undoList.size() - 1);
			undoList.remove(undoList.size() - 1);
			cmd.undo();
			redoList.add(cmd);
		}
	}

	public void redo() {
		if (redoList.size() > 0) {
			Command cmd = redoList.get(redoList.size() - 1);
			redoList.remove(redoList.size() - 1);
			cmd.redo();
			undoList.add(cmd);
		}
	}
}