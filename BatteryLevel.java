

/*import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;*/
import java.util.Random;


public class BatteryLevel {


	public void batteryCall(){
		batLvl();
	}
	
	private void batLvl(){
		
		Random ranBatLvl = new Random();
		int ranBat = ranBatLvl.nextInt(99)+1;
		
		if (ranBat <= 15 & ranBat > 5){
			System.out.println("Battery status: " + ranBat + "%"
					+ "   Energy saving mode is 'ON'.");
		}
		else if(ranBat <=5){
			System.out.println("Battery status: " + ranBat + "%"
		+ "   Please plug in the AC adapter.");
		}
		else{
			System.out.println("Battery status: " + ranBat + "%");
		}
		
		//String batStatusString = Integer.toString(ranBat);
		
		
		//WriteProps writeBat = new WriteProps("BatteryStatus", batStatusString);
		
	}
	
	
	
}


