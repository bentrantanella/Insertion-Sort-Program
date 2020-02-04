import javax.swing.*;
import BreezySwing.*;
import java.util.*;

public class InsertionSortGUI extends GBFrame {
	
	public static void main(String[] args) {
		JFrame frm = new InsertionSortGUI();
		frm.setTitle("Mean, median, and mode");
		frm.setSize(300, 300);
		frm.setVisible(true);
		
	}

	JButton inputButton = addButton("Input",1,1,1,1);
	JButton meanButton = addButton("Find mean",2,1,1,1);
	JButton modeButton = addButton("Find mode",3,1,1,1);
	JButton medianButton = addButton("Find median",4,1,1,1);
	JButton printAllButton = addButton("Print all",5,1,1,1);
	JButton resetButton = addButton("Reset",6,1,1,1);
	
	public InsertionSortGUI() {
		meanButton.setEnabled(false);
		modeButton.setEnabled(false);
		medianButton.setEnabled(false);
	}
	
	ArrayList<Integer> numbers = new ArrayList<Integer>();
	
	
	public void buttonClicked(JButton button) {
		if (button == inputButton) {
			InputDialog i = new InputDialog(this, numbers);
			i.setVisible(true);
			
			if(numbers.size() > 0) {
				Sort s = new Sort(numbers);
				s.sortArray();
				
				meanButton.setEnabled(true);
				modeButton.setEnabled(true);
				medianButton.setEnabled(true);
			}
			
			
		}
		
		if (button == meanButton) {
			messageBox("The mean is " + getMean());
		}
		
		if (button == modeButton) {
			messageBox("The mode is " + getMode());
		}
		
		if (button == medianButton) {
			messageBox("The median is " + getMedian());
		}
		
		if (button == printAllButton) {
			String output = "";
			for(Integer a : numbers) {
				output += a + "\n";
			}
			messageBox(output);
		}
		
		if (button == resetButton) {
			numbers.clear();
		}
	}
	
	private double getMedian() {
		if (numbers.size() % 2 != 0) {
			return numbers.get(numbers.size() / 2);
		} else {
			return (numbers.get(numbers.size() / 2) + numbers.get((numbers.size() / 2) - 1)) / 2;
		}
	}
	
	private double getMean() {
		double total = 0;
		for(int a : numbers) {
			total += a;
		}
		
		return total / numbers.size();
	}
	
	private String getMode() {
		
		String output = "";
		int highestcount = 0;
		ArrayList<Integer> counts = new ArrayList<Integer>();
		ArrayList<Integer> singles = new ArrayList<Integer>();
		
		for(int i = 0; i < numbers.size() - 1; i++) {
			int count = 1;
			while(numbers.get(i) == numbers.get(i + 1)) {
				count++;
			}
			counts.add(count);
		}
		
		for(int j = 0; j < numbers.size() - 1; j++) {
			if (numbers.get(j) == numbers.get(j+1))
				continue;
			else singles.add(numbers.get(j));
		}
		
		for()
		
		
		
		return output;
	}
}
