

//import java.util.ArrayList;
//import java.util.Random;
//import java.util.stream.Collectors;


public class IMEI {

	private static final String IMEI = "91994575990459";
	
	public void imeiNum(){
		
		IMEINumber();

	}


	private void IMEINumber(){
	
		System.out.println("IMEI " + this.IMEI);
		/*Random ran = new Random();
		ArrayList<Integer> num = new ArrayList<>();
		for (int ii = 0; ii < 15; ii++){
			num.add(ran.nextInt(10));
			
		}
		
		String imei = num.stream().map(Object::toString).collect(Collectors.joining(""));
		System.out.println("IMEI " + imei + " [" + imei.length() + "digits]");
		System.out.println("IMEI " + imei.substring(0, 14)
		+ " checksum "+ imei.substring(14));

	}*/

}
}