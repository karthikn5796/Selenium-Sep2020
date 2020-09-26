package org.student;

import org.department.Department;

public class Student extends Department {
	
	

	public static void studentName() {
		System.out.println("SI Name = Karthikeyan M");
	}
	public static void studentDept() {
		System.out.println("SI DEP = BCA ");
	}
	public static void studentId() {
		System.out.println("SI ID= 1155");
	}
	
	@SuppressWarnings({ "unused", "static-access" })
	public static void main(String[] args) {
		Student stu = new Student();
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
		stu.deptName();
		stu.studentName();
		stu.studentDept();
		stu.studentId();
		

		
	}

}
