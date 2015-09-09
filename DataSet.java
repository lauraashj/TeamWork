import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

public class DataSet {

	List<Integer> ints;

	public DataSet() {
		ints = new ArrayList<Integer>();
	}
	
	public DataSet(DataSet copyDataSet){
		this.ints = copyDataSet.ints;
	}

	public void pushback(int number) {
		ints.add(number);
	}

	public int get(int index) {
		System.out.println(ints.get(index));
		return ints.get(index);
	}

	public void set(int index, int number) {
		ints.set(index, number);
	}

	public void display() {
		System.out.println(ints);
	}

	public void popback() {
		ints.remove(ints.size() - 1);
	}
}