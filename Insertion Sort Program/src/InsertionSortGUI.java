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
			messageBox(getMode());
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
			messageBox("You have cleared the list");
		}
	}
	
	private double getMedian() {
		if (numbers.size() % 2 != 0) {
			return numbers.get(numbers.size() / 2);
			
		} else {
			double num1 = numbers.get(numbers.size() / 2);
			double num2 = numbers.get((numbers.size() / 2) - 1);
			return (num1 + num2) / 2;
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
		ArrayList<Integer> modes = new ArrayList<Integer>();
		int highestcount = 1;
		int count;
		
		for(int i = 0; i < numbers.size(); i++) {
			count = 0;
			for(int j = 0; j < numbers.size(); j++) {
				if (numbers.get(i) == numbers.get(j) && !modes.contains(numbers.get(i))) {
					count++;
				}
			}
			
			if (count > highestcount) {
				modes.clear();
				modes.add(numbers.get(i));
				highestcount = count;
			} else if (count == highestcount && highestcount > 1){
				modes.add(numbers.get(i));
			}
			
		}
		
		if (modes.isEmpty() == true) {
			return "There is no mode";
		}
		
		String output = "";
		if (modes.size() == 1)
			output = "The mode is ";
		else output = "The modes are ";
		for(int a : modes) {
			 
			output += a + " ";
		}
		
		return output;
	}
}
