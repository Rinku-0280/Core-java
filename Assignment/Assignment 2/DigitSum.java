class DigitSum
{
   public static void main(String args[])
   {
	int no,a,sum=0;
	no=(int)(Math.random()*100000);
	System.out.println("No is ="+no); 

	while(no!=0){
	a=no%10;
	sum+=a;
	no=no/10;
	}
     System.out.println("Sum of Digits are ="+sum);
   }
}
