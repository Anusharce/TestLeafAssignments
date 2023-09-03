package org.department;

import org.college.College;

public class Department extends College {
	public void departmentName()
	{
		System.out.println("Department Name fro, Department Class and org.department package");
	}
	public static void main(String[] args) {
		Department d=new Department();
		d.collegeName();
		d.collegeCode();
		d.collegeRank();
		d.departmentName();

	}

}
