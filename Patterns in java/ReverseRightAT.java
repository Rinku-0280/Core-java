import java.io.*;
class ReverseRightAT
{
    public static void main(String args[])
    {
        Console con = System.console();
        int i,j,n;
        n = Integer.parseInt(con.readLine());
        for(i=1;i<=n;i++)
        {
            for(j=n;j>=i;j--)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}