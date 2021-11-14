package week3.day1;

public class MyPhone {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		
		sp.connectWhatsApp(); //SmartPhone class
		
		sp.takeVideo(); //AndroidPhone class
		
		sp.sendMsg(); //Mobile class
		sp.makeCall(); //Mobile class
		sp.saveContact(); //Mobile class
	}
}
