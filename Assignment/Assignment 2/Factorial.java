public class Factorial
{
   public static void main(String args[])
   {
     	int i,no,fact=1;
	no=(int)(Math.random()*10);
	System.out.println("Generated Number Is = "+no);

     	for(i=1;i<=no;i++){
        fact*=i;

 }   	
         System.out.println("factorial is ="+fact);
   }
}
