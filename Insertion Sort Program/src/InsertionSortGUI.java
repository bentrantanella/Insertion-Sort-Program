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
	boolean sorted = false;
	
	public void ButtonClicked(JButton button) {
		if (button == inputButton) {
			InputDialog i = new InputDialog(this, numbers);
			i.setVisible(true);
		}
		
		if (button == meanButton) {
			if (sorted == false) {
				 
			}
		}
		
		if (button == modeButton) {
			
		}
		
		if (button == medianButton) {
			
		}
		
		if (button == printAllButton) {
			
		}
		
		if (button == resetButton) {
			
		}
	}
}
