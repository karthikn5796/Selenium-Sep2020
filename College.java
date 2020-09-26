package org.college;

public class College {
	
	public static void collegeName() {
		System.out.println("COLLEGE NAME = SRM");
	}
	public static void	collegeCode() {
		System.out.println("COLLEGE CODE =1025");
	}
	public static void collegeRank() {
		System.out.println("COLLEGE RANK =05");
	}
		@SuppressWarnings({ "unused", "static-access" })
		public static void main(String[] args) {
College col = new College();
col.collegeName();
col.collegeCode();
col.collegeRank();
	}

}
