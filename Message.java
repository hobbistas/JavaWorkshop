

public class Message {

	String opt;
	String send = new String("send");
	String receive = new String("receive");
	
	
	Message(String opt){
		this.opt = opt;
	}
	
	public void action(String opt, String number,String text){
		
		if(opt.equalsIgnoreCase(send)){
			sendText(number, text);
		}
		else if (opt.equalsIgnoreCase(receive)){
			receiveText(number);
			//TODO read for a file a simple text
		}
		else
			System.out.println("Select a valid option - call/receive!");
		
	}
	
	private void sendText(String num, String text){
		
		if(num.length() == 9){
		    System.out.println("Sending to: " + num 
		    		+ "\ntext :" + text);
		}
		
		else
			System.out.println("Invalid Number!");
	}
	
	private void receiveText(String num){
		System.out.println(num + " Receiving TEXT!!!!!");
	}

}