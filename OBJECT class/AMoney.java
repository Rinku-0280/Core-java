import java.io.*;
class AMoney
{
    public static void main(String args[])
    {
        Money m1 = new Money();
        m1.set(10,20);
        Money m2 = new Money();
        m2.set(10,20);

        if(m1 == m2)
            System.out.println("Shallow");
        if(m1.equals(m2))
            System.out.println("Deep");
    }
}