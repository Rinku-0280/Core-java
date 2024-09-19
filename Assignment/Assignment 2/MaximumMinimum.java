class GCDivisor
{
   public static void main(String args[])
   {
	int a,b,i;
	a=(int)(Math.random()*100);
	b=(int)(Math.random()*100);
	System.out.println("a="+a);
	System.out.println("b="+b);

	for(i=1;i<=a;i++){
	  if(a%i==0){
	  a=1;
	  System.out.println("Divisor of a are="+a);
	  }
  	  if(a%i==0){
	  b=1;
	  System.out.println("Divisor of b are="+b); 
 	  } 
        }
    System.out.println("Greatest Common Divisor of a and b is ="+a+" "+b);
   }
}
