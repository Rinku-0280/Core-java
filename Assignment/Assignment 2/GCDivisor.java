class GCDivisor
{
   public static void main(String args[])
   {
	int a,i,b,gcd=0;
	a=(int)(Math.random()*100);
	b=(int)(Math.random()*100);
	System.out.println("a="+a);
	System.out.println("b="+b);

	for(i=1;i<=a&&i<=b;i++){
	if(a%i==0){
	 System.out.println("a is="+i);}
	if(b%i==0){
	 System.out.println("b is="+i);}
	  if(a%i==0&&b%i==0){
	  System.out.println("Divisor of a are="+i);
	  gcd=i;
	  } 
        }
    System.out.println("Greatest Common Divisor of a and b is ="+gcd);
   }
}
