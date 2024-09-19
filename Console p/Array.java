import java.io.*;
class Array
{
    public static void main(String args[])
    {
	Console con = System.console();
	int a[], b[];
	a = new int[3];
	for(int i=0;i<a.length;i++){
		System.out.print("enter a value:");
		a[i] = Integer.parseInt(con.readLine());
		}
	for(int i=0; i<a.length; i++){
	System.out.print(a[i]+" ");
		}
    }
}