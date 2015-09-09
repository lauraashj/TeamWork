
public class getCommand implements Command{

	private DataSet data;
	private int index;
	
	public getCommand(DataSet data, int index){
		this.data = data;
		this.index = index;
	}

	@Override
	public void execute() {
		data.get(index);
		
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void redo() {
		// TODO Auto-generated method stub
		
	}

}
