package week3.day1;

public class CompareString {
	
	public void compare(String str1, String str2) {
		
		if (str1 == str2) {
			System.out.println("This is to check == operator");
		}
		
		if (str1.equals(str2)) {
			System.out.println("This is to check equals condition");
		}

		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("This is to check equalsIgnoreCase condition");
		}
	}

	public static void main(String[] args) {
		CompareString cmpstr = new CompareString();
		
		String str1 = "I am Learning Java";
		String str2 = "I am learning java";
		
		cmpstr.compare(str1, str2);
		
				
	}
}
