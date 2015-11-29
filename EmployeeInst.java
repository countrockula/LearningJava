import java.io.*;

public class EmployeeInst	{
	// this instance variable is visible for any child class.
	public String name;

	// salary variable is visible in EmployeeInst class only.
	private double salary;

	// The name variable is assigned in the constructor.
	public EmployeeInst(String empName)	{
		name = empName;
	}

	// The salary variable is assigned a value.
	public void setSalary(double empSal)	{
		salary = empSal;
	}

	// This method prints the employee details.
	public void printEmp()	{
		System.out.println("name  : " + name);
		System.out.println("salary  : " + salary);
	}

	public static void main(String args[])	{
		EmployeeInst empOne = new EmployeeInst("Ransika");
		empOne.setSalary(1000);
		empOne.printEmp();
	}


}