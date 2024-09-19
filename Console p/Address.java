import java.io.*;
class Address
{
    public static void main(String args[])
    {
	Console con = System.console();
	String name, city;
	System.out.println("Enter Your name :");
	name = con.readLine();
	System.out.println("Where do you live :");
	city = con.readLine();

	System.out.println("Hello "+name+" from "+city+" You are Welcome Here");


    }
}