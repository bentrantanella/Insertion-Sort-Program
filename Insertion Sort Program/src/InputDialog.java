import javax.swing.*;
import BreezySwing.*;
import java.util.*;

public class InputDialog extends GBDialog {
	
	ArrayList<Integer> numbers = new ArrayList<Integer>();
	
	public InputDialog(JFrame parent, ArrayList<Integer> nums) {
		super(parent);
		setTitle("Input");
		setSize(300, 300);
		
		numbers = nums;
		
	}
	
	JLabel addLabel = addLabel("Add number to list",1,1,1,1);
	IntegerField addField = addIntegerField(0,1,2,1,1);
	JButton addButton = addButton("Add",2,1,1,1);
	
	
	
	public void buttonClicked(JButton button) {
		if(!addField.isValidNumber()) {
			messageBox("Invalid input");
			return;
		}
		numbers.add(addField.getNumber());
		messageBox("You have added the number " + addField.getNumber());
		addField.setNumber(0);
		addField.requestFocus();
		addField.selectAll();
	}
}
