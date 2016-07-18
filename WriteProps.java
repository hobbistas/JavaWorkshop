

//import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteProps {
	
	String val1, val2;
	
	
	public WriteProps(String val1, String val2) {

		this.val1 = val1;
		this.val2 = val2;
		writeProps(val1, val2);

	}
	Properties properties = new Properties();
	

	public void writeProps(String val1, String val2){
		try {
			FileInputStream in = new FileInputStream("test2.properties");
			Properties props = new Properties();
			props.load(in);
			in.close();

			FileOutputStream out = new FileOutputStream("test2.properties");
			props.setProperty(val1, val2);
			props.store(out, null);
			out.close();

			System.out.println("SAVED!!!!!!!!!!!!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("FILENOTFOUND");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("IOEXCEPTION");
		}
	}
	
	
}
