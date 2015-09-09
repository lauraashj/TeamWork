
public class popbackCommand implements Command{

	private DataSet data;
	private DataSet temp;
	
	public popbackCommand(DataSet data){
		this.data = data;
		temp = this.data;
	}
	@Override
	public void execute() {
		data.popback();
		
	}
	@Override
	public void undo() {
		this.data = temp;
		
	}
	@Override
	public void redo() {
		data.popback();
		
	}

}
