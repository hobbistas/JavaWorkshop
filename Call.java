

public class Call {
	
	
	String opt;
	String call = new String("call");
	String receive = new String("receive");
	
	Call(String opt){
		this.opt = opt;
	}
	
	public void action(String opt, String number){
		
		if(opt.equalsIgnoreCase(call)){
			makeCall(number);
		}
		else if (opt.equalsIgnoreCase(receive)){
			receiveCall(number);
		}
		else
			System.out.println("Select a valid option - call/receive!");
		
	}
	
	private void makeCall(String num){
		
		if(num.length() == 9){
		    System.out.println("Calling: " + num);
		}
		
		else
			System.out.println("Invalid Number!");
	}
	
	private void receiveCall(String num){
		System.out.println(num + " is calling!");
	}

}
