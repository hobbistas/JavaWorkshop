

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;

public class CellularData {
	
	public void caller(){
		
		cellularData();
		
	}

	private void cellularData(){
		
		Random randn = new Random();
		ArrayList<Integer> packetsFlow = new ArrayList<>();
		for ( int ii= 0; ii <4 ; ii++){
			packetsFlow.add(randn.nextInt(10));
		}
		String packets = packetsFlow.stream().map(Object::toString).collect(Collectors.joining(""));
		System.out.println("Data usage " + packets + " MB");
		
	}

}