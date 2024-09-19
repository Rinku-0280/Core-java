class SuperPalingdrone
{
     public static void main(String args[])
   {
	int i,a,b,pal,square,x,y,z,w;
	for(i=1;i<100;i++)
	{
	   a=i%10;
	   b=i/10;
	   if(a==b){
	   pal=i;
	   System.out.println("Palingdrone number is="+i);}
	

		for(pal=11;pal<100;pal++)
		{
	  	square=pal*pal;
		System.out.println("SuperPalingdrone number1 is="+square);

		x=square%10;
		System.out.println("SuperPalingdrone number2 is="+x);

		y=square/10;
		System.out.println("SuperPalingdrone number3 is="+y);

		z=y/10;
		System.out.println("SuperPalingdrone number4 is="+z);

		w=z/10;
		System.out.println("SuperPalingdrone number5 is="+w);

		}	
	 }


    }

}