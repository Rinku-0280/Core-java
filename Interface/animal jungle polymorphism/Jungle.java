class Jungle
{
    public static void main(String args[])
    {
        System.out.println("Animal has "+Animal.no_of_legs+" Legs");
        Animal a,b;
        a = new Dog();
        a.speak();
        a.move();
        System.out.println("Dog has "+Dog.no_of_legs+" legs");
        b = new Horse();
        b.speak();
        b.move();
        System.out.println("Horse has "+Horse.no_of_legs+" legs");
    }
}