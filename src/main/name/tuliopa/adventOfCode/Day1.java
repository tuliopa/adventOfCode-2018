package name.tuliopa.adventOfCode;

import static name.tuliopa.utils.Utils.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Day1 {

	public static void main(String arg[]) {
		
		print("Checking frequencies.");
		print("Starting at: " + new Date());
		List<Integer> changes = new Day1().changesOfFrequencies();
		ArrayList<Integer> state = new ArrayList<>();
		int index = 0;
		int currentValue = 0;
		boolean notFound = true;
		
		while(notFound) {
			for(Integer value : changes) {
				
				currentValue += value;
				if(!state.contains(currentValue)) {
					state.add(currentValue);
					//print("index: " + index + " \t\tvalue: " + value + " \t\tCurrent Value: " + currentValue);
				} else {
					//print("index: " + index + " \t\tCurrent Value: " + currentValue);
					notFound = false;
					break;
				}
				
				index++;
			}
		}
		
		print("size:  " + state.size());
		print("final frequency: " + currentValue);
		print("Finish at: " + new Date());
	}
	
}