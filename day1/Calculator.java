package week3.day1;

public class Calculator {

	public void add(int num1, int num2) {
		System.out.println("The sum is: " +(num1+num2));

	}
	
	public void add(int num1, int num2, int num3) {
		System.out.println("The sum is: " +(num1+num2+num3));

	}

	public void mul(int num1, int num2) {
		System.out.println("The multiplied value is: " +num1*num2);

	}
 
	public void mul(int num1, double num2 ) {
		System.out.println("The multiplied value is: " +num1*num2);

	}

	public void sub(int num1, int num2 ) {
		System.out.println("The subtracted value is: " +(num1-num2));

	}
	
	public void sub(double num1, double num2 ) {
		System.out.println("The subtracted value is: " +(num1-num2));

	}

	public void div(int num1, int num2 ) {
		System.out.println("The divided value is: " +num1/num2);

	}

	public void div(double num1, int num2 ) {
		System.out.println("The divided value is: " +num1/num2);

	}
	
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add(10, 20);
		cal.add(10, 20, 30);
		cal.mul(10, 20);
		cal.mul(10, 5.6);
		cal.sub(10, 5);
		cal.sub(25.6, 15.5);
		cal.div(5, 2);
		cal.div(5.5, 2);
	}
	
	
	
}
