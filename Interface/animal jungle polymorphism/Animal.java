interface Animal
{
    void speak();
    void move();
    int no_of_legs = 4;
}
class Dog implements Animal
{
    public void speak()
    {
        System.out.println("Dog Barks");
    }
    public void move()
    {
        System.out.println("Dog Jumps");
    }
}
class Horse implements Animal
{
    public void speak()
    {
        System.out.println("Horse Neighs");
    }
    public void move()
    {
        System.out.println("Horse Runs");
    }
}