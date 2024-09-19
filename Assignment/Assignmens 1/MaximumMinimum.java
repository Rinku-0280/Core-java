class MaximumMinimum
{
   public static void main(String[] args)
   {
       int a,b,c,d,max=0,min=99;
       a=(int)(Math.random()*100);
       b=(int)(Math.random()*100);
       c=(int)(Math.random()*100);
       d=(int)(Math.random()*100);
       System.out.println("a="+a);
       System.out.println("b="+b);
       System.out.println("c="+c);
       System.out.println("d="+d);
       if(a>b){
        max=a;
        min=b;
         if(c>max){
          max=c;
	  }
         else{
	   if(c<min){
	   min=c;}
	    }
         if(d>max){
          max=d;
	  }
 	 else{
	   if(d<min){
	   min=d;}
	   }
        System.out.println("Maximum Number Is ="+ max);
        System.out.println("Minimun Number Is ="+ min);
       }
    }

}
