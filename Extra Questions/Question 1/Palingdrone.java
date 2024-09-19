class Palingdrone
{
     public static void main(String args[])
   {
	int i,a,b,pal;
	for(i=1;i<100;i++)
	{
	   a=i%10;
	   b=i/10;
	   if(a==b){
		pal=i;
		System.out.println("Palingdrone number is="+pal);
		}
	}
   }
}