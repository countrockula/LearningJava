import java.io.*;

public class EmployeeCons	{
	// salary variable is a private static variable
	private static double salary;

	// DEPARTMENT is a constant (constants are written in all caps)
	public static final String DEPARTMENT = "Development ";

	public static void main(String args[])	{
		salary = 1000;
		System.out.println(DEPARTMENT + "average salary:" + salary);
	}

}