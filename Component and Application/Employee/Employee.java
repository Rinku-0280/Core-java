import java.io.*;
class Employee
{
	private String name;
	private int age;
	private double salary;

	public void read()
	{
	Console con=System.console();
	name=con.readLine();
	age=Integer.parseInt(con.readLine());
	salary=Double.parseDouble(con.readLine());
	}
	public void show()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);		
  	}

}
   