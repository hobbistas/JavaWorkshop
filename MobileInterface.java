

public interface MobileInterface {
	
	void power(String state);
	void mode(String state);
	void call(String state);
	void sms(String state);
	void cellularData(String state);
	void simNumber(Integer[] num);
	void IMEI(Integer[] num);
	void batteryLvl(Integer lvl);
	

}
