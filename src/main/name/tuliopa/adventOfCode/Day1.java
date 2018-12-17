package name.tuliopa.adventOfCode;

import static name.tuliopa.utils.Utils.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Day1 {

	public static void main(String arg[]) {
		
		print("Checking frequencies.");
		print("Starting at: " + new Date());
		List<Integer> changes = new Day1().changesOfFrequencies();
		ArrayList<Integer> state = new ArrayList<>();
		int currentValue = 0;
		boolean notFound = true;
		
		while(notFound) {
			for(Integer value : changes) {
				
				currentValue += value;
				if(!state.contains(currentValue)) {
					state.add(currentValue);
				} else {
					notFound = false;
					break;
				}
				
			}
		}
		
		print("size:  " + state.size());
		print("final frequency: " + currentValue);
		print("Finish at: " + new Date());
	}
	
	public List<Integer> changesOfFrequencies() {
		ArrayList<Integer> a = new ArrayList<>();
		
		try {
			
			Iterator<String> iterator = convertFileToStream("src/main/resources/day01.txt").iterator();
			while(iterator.hasNext()){
				a.add(Integer.parseInt(iterator.next()));
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return a;
	}
}
