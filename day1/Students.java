package week3.day1;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("The student ID is: " +id);

	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println("The student ID is: " +id +"and Name is: " +name);

	}
	
	public void getStudentInfo(String mail, int phone) {
		System.out.println("The email is: " +mail +" and number is: " +phone);

	}
	
	public static void main(String[] args) {
		Students st = new Students();
		st.getStudentInfo(18);
		st.getStudentInfo(18, "Arthi");
		st.getStudentInfo("arthid@gmail.com", 1234567890);
		
	}
}
