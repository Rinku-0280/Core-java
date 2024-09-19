class LongestSeries
{
   public static void main(String args[])
   {
	int no,i,max=0,count=0,sr=0;
	for(i=1;i<=10;i++){
	no=(int)(Math.random()*100);
	System.out.print(no+" ");

	if(no>max){
	max=no;
	count++;
	System.out.print(max);}
	else{
	  if(sr<count){
	  sr=count;
	  max=0;
	  count=1;
	  }
	if(count>=sr){
	System.out.println(count);}
	else{
 	System.out.println(sr);}
	}
      }
   }

}
