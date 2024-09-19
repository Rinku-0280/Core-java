class Occurence
{
   public static void main(String args[])
   {
		int no,i,max=0,count=0;
		for(i=1;i<=10;i++){
		no=(int)(Math.random()*10);
		System.out.println(no+" ");
		if(no>max){
			max=no;
			count = 1;
		}else if(no == max){
			max=no;
			count++;
			System.out.println("max no TWO is= "+max);
			System.out.println("max count TWO is= "+count);
		}
		System.out.println("max no is= "+max);
		System.out.println("max count is= "+count);
	}
    }
}
