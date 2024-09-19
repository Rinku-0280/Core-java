interface Test
{
    public default void say()
    {
        System.out.println("Hii from Test");
    }
}
class Exam implements Test
{
    public void see()
    {
        System.out.println("This is Test");
    }
}
