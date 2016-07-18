

public class ICCID {

	private static final String simNumber = "35724944383003879165";

	public void simNum(){
		
		ICCIDNumber(simNumber.toString());
		
	}


	private void ICCIDNumber(String str){
		
		System.out.println("SIMnumber " + str.substring(6,18));
		
	}

}