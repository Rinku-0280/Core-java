class UseRationalConstructor
{
    public static void main(String args[])
    {
	RationalConstructor rac = new RationalConstructor();
	double a,b,c,d;
	a = rac.sum(4,8,3,6);
	System.out.println("sum is :"+a);
	b = rac.sub(9,4,2,7);
	System.out.println("subtraction is :"+b);
	c = rac.mul(4,3,9,8);
	System.out.println("multiplied is :"+c);
	d = rac.div(9,3,3,5);
	System.out.println("divison is :"+d);

    }
}