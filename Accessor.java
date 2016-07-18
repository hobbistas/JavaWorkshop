
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Accessor {

	public void getIt() {
		
		getHidden();
 
	}
	
	private Power device;
	private String val;

	private void getHidden(){
		
		System.out.println("Welcome to Lony Sumia r9k");
		call();
			   
		}

	private void call(){
		try{
		//boolean run = true;
		//while(run){
			
		Scanner keyboard = new Scanner(System.in);
		System.out.println("\nPlease type a command to execute; type '--help' for help");
		//keyboard.hasNextLine()){
		String command = keyboard.nextLine();

		if (command.equalsIgnoreCase("call")){

			callCase();
			
		}
	   
		else if (command.equalsIgnoreCase("sms")){
	    	
	    	smsCase();
	    	
	    }
	   
		else if(command.equalsIgnoreCase("sim")){
	    
	        simCase();

	    }
	    
		else if (command.equalsIgnoreCase("IMEI")){
	    	
	        imeiCase();
	        
	    }
	    
		else if (command.equalsIgnoreCase("battery")){
	    		   
	        batCase();
	    
	    }
	    
		else if (command.equalsIgnoreCase("swoff")){
	    	
	    	switchOff();
	    	
	    }
	    
		else if (command.equalsIgnoreCase("ison")){
	    	
	    	switchOn();
	    	
	    }
	    
		else if (command.equalsIgnoreCase("--help")){
	    	
	    	System.out.println("Available commands:"
	    			+ "\ncall: make a call"
	    			+ "\nsms: send sms"
	    			+ "\nsim: displays SIM number"
	    			+ "\nimei: displays IMEI (w/o checksum)"
	    			+ "\nbattery: displays battery status (%)"
	    			+ "\nswoff: Power off"
	    			+ "\nison: displays whether the device is on");
	    	
	    }
	    
		else if (command.equalsIgnoreCase("data")){
			
			dataCase();
			
		}
		
	    else 

	    	System.out.println("Command not found. Please try again or type --help for help");

		keyboard.close();
		//}
	}
		
	catch (NoSuchElementException err){
		System.out.println("ERROR LOL!");
	}
	      
	}
	
	private void callCase(){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		Integer num = scan.nextInt();
		String numStr = num.toString();
		Call testcall = new Call("call");
		testcall.action("call", numStr);
		scan.close();
		
	}
	
	private void smsCase(){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the text");
		String text = scan.nextLine();
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter the recipient's number");
		int num = scan2.nextInt();
		String numStr = ""+num;
		Message testSms = new Message("send");
		testSms.action("send", numStr, text);
		scan.close();
		scan2.close();
	}
	
	private void imeiCase(){
		
		IMEI imeiNumber = new IMEI();
        imeiNumber.imeiNum();
		
	}
	
	private void simCase(){
		
		ICCID simNumber = new ICCID();
        simNumber.simNum();
		
	}
	
	private void batCase(){
		
		BatteryLevel batLevelVal = new BatteryLevel();
        batLevelVal.batteryCall();
        
	}
	
	private void dataCase(){
		
		CellularData data = new CellularData();
		data.caller();
		
	}
	
	private void switchOn(){
		
		this.device = Power.on;
		devStatus(this.device);

	}
	
	private void switchOff(){
		
		this.device = Power.off;
		devStatus(this.device);

	}
	
	
	private void devStatus(Power device){
		
	
	switch(device){
		
		case on:
			
			System.out.println("The device is on.");
			break;
			
		case off:
				
			System.out.println("Power off");
				
			break;
		}
	}
}

	
