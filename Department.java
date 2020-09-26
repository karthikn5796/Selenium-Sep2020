package org.department;

import org.college.College;

public class Department extends College {
	public static void deptName() {
		System.out.println("Dept Name =Computer Science");
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
	Department dep = new Department();
	dep.deptName();
	dep.collegeName();
	dep.collegeCode();
	dep.collegeRank();
	}

}
