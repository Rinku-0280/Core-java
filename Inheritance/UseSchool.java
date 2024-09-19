class UseSchool
{
    public static void main(String args[])
    {
        Student s1 = new Student();
        System.out.println("First Student is :");
        s1.show();
        Student s2 = new Student(1, "John", 94);
        System.out.println("Second student is :");
        s2.show();
        Student s3 = new Student(s2);
        System.out.println();
        s3.show();
    }
}