package week3.Day2Assignments;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("Student id is " + id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Student id is " + id + " Name is " + name );
	}
	public void getStudentInfo(int id, String name, String email, Long phnNumber) {
		System.out.println("Student id is " + id +
				" Name is " + name +
				" Mail id is "+ email +
				" Mobile Number is" + phnNumber);
	}

	public static void main(String[] args) {
		Students s=new Students();
		s.getStudentInfo(1566);
		s.getStudentInfo(1566, "Anusha");
		s.getStudentInfo(1566, "Anusha", "varaprasadanusha@gmail.com", 9876543210L);
	}

}
