class ArmstrongNumber
{
     public static void main(String args[])
   {
	int i,a,b,c,d,sum;
	for(i=100;i<1000;i++){
	a=(i%10);
	b=(i/10);
	c=(b%10);
	d=(b/10);
	
	a*=a*a;
	c*=c*c;
	d*=d*d;
	sum=a+c+d;
	if(i==sum){
	 	System.out.println("Armstrong Numbers are ="+i);
		}

	}

   }
}