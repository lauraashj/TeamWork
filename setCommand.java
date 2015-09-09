public class setCommand implements Command {

	private DataSet data;
	private int index;
	private int number;
	private DataSet temp;

	public setCommand(DataSet data, int index, int number) {
		this.data = data;
		this.index = index;
		this.number = number;

	}

	@Override
	public void execute() {
		temp = new DataSet(data);
		data.set(index, number);

	}

	@Override
	public void undo() {
		data = new DataSet(temp);
	}

	@Override
	public void redo() {
		data.set(index, number);

	}

}
