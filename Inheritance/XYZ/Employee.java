package a;
import a.b.ContactInfo;
public class Employee extends ContactInfo
{
    public int salary;
    public Employee()
    {
        salary = 0;
    }
    public Employee(String nm, String srm, long phn, int slr)
    {
        super(nm, srm, phn);
        salary = slr;
    }
    public Employee(Employee sl)
    {
        super(sl);
        salary = sl.salary;
    }
    public void show()
    {
        System.out.println("Person name is:"+name+" "+surname+"phone no:"+phone+"salary:"+salary);
    }
}