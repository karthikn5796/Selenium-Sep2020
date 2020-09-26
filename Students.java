package week3.day1;

public class Students {
	public void getStudentInfo(int id,String name) {
		System.out.println("Student ID: " +id);
		System.out.println("Student Name:" +name);
	}
public void getStudentInfo(String email,long PhoneNumber ) {
	System.out.println("Student email:"+email);
	System.out.println("Student PhoneNumber:"+PhoneNumber);
	

}


	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Students stu = new Students();
		stu.getStudentInfo(115, "Karthikeyan M");
		stu.getStudentInfo("karthikn5796@gmail.com", 995500006);
	}

}
