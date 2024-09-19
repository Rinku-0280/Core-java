import a.Employee;

class Office
{
    public static void main(String args[])
    {
        Employee s1 = new Employee();
        System.out.println("First Employee is :");
        s1.show();
        Employee s2 = new Employee("Rinku","Jangir",787868111, 60000);
        System.out.println("Second Employee is :");
        s2.show();
        Employee s3 = new Employee(s2);
        System.out.println();
        s3.show();
    }
}