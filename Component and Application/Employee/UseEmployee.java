import java.io.*;
class UseEmployee
{
   public static void main(String Args[])
   {
	Employee e1=new Employee();
	System.out.print("Enter Name,age and salary of Employee:");
	e1.read();

	System.out.println("Name, Age and Salary of Employee is:");
	e1.show();
   }

}