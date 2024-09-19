class Exceptions
{
    public static void main(String args[])
    {
        int a = 1, b = 0;
        try
        {
            System.out.println("Try block entered");
            System.out.println(a/b);
            System.out.println("Ending Try block");
        }
        catch(ArithmeticException e)
        {
            System.out.println("You can't divide by zero");
        }
        finally
        {
            System.out.println("Bye");
        }
        System.out.println("See you again");
    }
}