
public class displayCommand implements Command{

	private DataSet data;
	
	public displayCommand(DataSet data){
		this.data = data;
	}
	@Override
	public void execute() {
		data.display();
		
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
