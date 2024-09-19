class UseMoney
{
   public static void main(String args[])
   {
	Money m1;
	m1=new Money();
	m1.set(100,20);
	System.out.println("First amount is :");
	m1.show();

	Money m2;
	m2=new Money();
	m2.set(700,44);
	System.out.println("Second amount is :");
	m2.show();

   }
}
   