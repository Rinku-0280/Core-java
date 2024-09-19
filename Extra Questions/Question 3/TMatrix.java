import java.io.*;
class TMatrix
{
    public static void main(String args[])
    {
        Console con = System.console();
        int a[][] = new int[3][3];
        int i, j;
        System.out.println("Enter a value:");
        for(i=0; i<a.length; i++){
          for(j=0; j<a[i].length; j++){
             a[i][j] = Integer.parseInt(con.readLine());
            }
        }
        System.out.println("given matrix is:");
        for(i=0; i<a.length; i++){
            for(j=0; j<a[i].length; j++){
                System.out.print(a[i][j]+" ");
                System.out.println("");
            }
        }
    }
}