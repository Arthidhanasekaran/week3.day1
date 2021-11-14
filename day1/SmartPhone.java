package week3.day1;

public class SmartPhone extends AndroidPhone{

	public void connectWhatsApp() {
		System.out.println("connect to whatsapp");

	}
	
	public void takeVideo() {
		System.out.println("take video from child class");

	}
	
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.takeVideo();
	}
}
