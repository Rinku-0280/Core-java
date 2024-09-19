class Jmm108
{
   public static void main (String args[])
   {
	Boolean b=false;
	if(b){
	System.out.print("A");}
	else
		if(b=false){
		System.out.print("B");}
	else
		if(b){
		System.out.print("C");}
 	else
		if(!b){
		System.out.print("D");}
	else
		System.out.print("E");


   }

}