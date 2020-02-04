import java.util.*;

public class Sort {
	private ArrayList<Integer> numlist = new ArrayList<Integer>();
	
	public Sort(ArrayList<Integer> numbers) {
		numlist = numbers;
	}
	
	public void sortArray() {
		int num;
		int pos;
		for(int i = 0; i < numlist.size(); i++) {
			num = numlist.get(i);
			pos = i;
			
			while(pos > 0 && numlist.get(pos-1) > num) {
				numlist.set(pos, numlist.get(pos-1));
				pos--;
			}
			
			numlist.set(pos, num);
		}
	}

}
