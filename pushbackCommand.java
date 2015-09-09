
public class pushbackCommand implements Command{
	
	private DataSet data;
	private int number;
	private DataSet temp;
	
	public pushbackCommand(DataSet data, int number){
		this.data = data;
		this.number = number;
		temp = this.data;
	}
	@Override
	public void execute() {
		data.pushback(number);
		
	}
	@Override
	public void undo() {
		data = temp;
		
	}
	@Override
	public void redo() {
		data.pushback(number);
		
	}

}
