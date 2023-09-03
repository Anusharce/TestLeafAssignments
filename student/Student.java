package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName()
	{
		System.out.println("Student name from Student Class and org. Student package");
	}
	public void studentDept()
	{
		System.out.println("Student Dept from Student Class and org. Student package");
	}
	public void studentId()
	{
		System.out.println("Student ID from Student Class and org. Student package");
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.departmentName();
		s.studentName();
		s.studentDept();
		s.studentId();
	}

}
