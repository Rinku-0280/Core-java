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
		x=square%10;
		y=square/10;
		z=y/10;
		w=z/10;
		if(x==w)
		}
	
	 }
		

    }

}