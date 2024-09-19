import java.io.*;
public class Table
{
    public static void main(String args[])
    {
        Console con = System.console();
        int n=1,i,k;
        i = Integer.parseInt(con.readLine());
        System.out.println("Multiple no is :"+i);
        for(n=1; n<=10; n++)
        {
            k = i*n;
            System.out.println(i+" X "+n+" = "+k);
        }

    }
}