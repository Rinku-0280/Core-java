import java.io.*;
class ReadData
{
     public static void main(String args[])
    {
	Console con = System.console();
  	String name,city;
	System.out.println("Enter Your Name=");
	name=con.readLine();
	System.out.println("Enter Your City=");
	city=con.readLine();
		System.out.print("Hello "+name+" From "+city+" YOU ARE WELCOME HERE");
    }

}