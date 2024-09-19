class Loop4
{
   public static void main(String args[])
   {
	int i,j;
	for(i=1;i<=5;i++){
		for(j=0;j<i;j++){
		System.out.print((j%2==0)?"0":"1");
		}
	System.out.println();
	}
   }
}