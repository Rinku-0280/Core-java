class Power
{
   public static void main(String args[])
   {
	int a,b,c=1,i;
	a=(int)(Math.random()*10);
	b=(int)(Math.random()*10);
	System.out.println("a="+a);
	System.out.println("b="+b);
	
	for(i=1;i<=a;i++){
	c*=b;
	}
    System.out.println("a To The Power Of b is = "+c);
   }
}
