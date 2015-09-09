
public class TestCommand {
	
	public static void main(String[] args) {
		// begin-user-code
		DataSet data = new DataSet();
		Command popback = new popbackCommand(data);
		Command pushback0 = new pushbackCommand(data, 97);
		Command pushback1 = new pushbackCommand(data, 45);
		Command pushback2 = new pushbackCommand(data, 657);
		Command pushback3 = new pushbackCommand(data, 4);
		Command pushback4 = new pushbackCommand(data, 87);
		Command pushback5 = new pushbackCommand(data, 12);
		Command set = new setCommand(data, 2, 23);
		Command get = new getCommand(data, 2);
		
		Command display = new displayCommand(data);
		
		Modify m = new Modify();
		
		m.invokeCommand(pushback0);
		m.invokeCommand(display);
		m.invokeCommand(pushback1);
		m.invokeCommand(display);
		m.invokeCommand(pushback2);
		m.invokeCommand(display);
		m.invokeCommand(pushback3);
		m.invokeCommand(display);
		m.invokeCommand(pushback4);
		m.invokeCommand(display);
		
		m.invokeCommand(get);
		m.invokeCommand(display);
		
		m.invokeCommand(popback);
		m.invokeCommand(display);
		
		m.invokeCommand(set);
		m.invokeCommand(display);
		
		m.Undo();
		m.invokeCommand(display);
		
		m.redo();
		m.invokeCommand(display);
		
		m.invokeCommand(pushback5);
		m.invokeCommand(display);
		
		m.Undo();
		m.invokeCommand(display);
		
		m.redo();		
		m.invokeCommand(display);

		// end-user-code
	}
}