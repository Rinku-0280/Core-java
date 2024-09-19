class ThirdMaximum
{
  public static void main(String args[])
  {
    int a,b,c,d,max,smax,dmax;
    a=(int)(Math.random()*100);
    b=(int)(Math.random()*100);
    c=(int)(Math.random()*100);
    d=(int)(Math.random()*100);
    System.out.println("a="+a);
    System.out.println("b="+b);
    System.out.println("c="+c);
    System.out.println("d="+d);
	if(b<a){
 	  	max=a;
	   	smax=b;
		
	if(max<c){
		max=c;
		smax=max;
		dmax=smax;}
	if(smax<c){
		smax=c;
		dmax=smax;}
	    
	if(max<d){
		max=d;
		smax=max;
		dmax=smax;}
		
    	  System.out.println("Third Maximum Number Is ="+dmax);
	   }
   }

}
