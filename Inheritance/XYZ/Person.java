package a.b.c;
public class Person
{
   public String name, surname;
    public Person()
    {
        name = "unknown";
        surname = "unknown";
    }
    public Person(String nm, String srm)
    {
        name = nm;
        surname = srm;
    }
    public Person(Person nam)
    {
        name = nam.name;
        surname = nam.surname;
    }
}