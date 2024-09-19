import java.io.*;
class RightAngleT
{
    public static void main(String args[])
    {
        Console con = System.console();
        int i,j,n;
        n = Integer.parseInt(con.readLine());
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}