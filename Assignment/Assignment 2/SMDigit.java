class SMDigit
{
   public static void main(String args[])
   {
	int num1,num2,a,b,count=0;
	num1=(int)(Math.random()*100000);
	num2=(int)(Math.random()*10);
	System.out.println("5 digit no is="+num1);
	System.out.println("1 digit no is="+num2);

	 while(num1!=0){
	  a=num1%10;
	  b=num1/10;
	  num1=num1/10;
	  System.out.println("1 no is ="+a);
	  System.out.println("2 no is ="+b);
   	  if(num2==a){
	  count++;}
	}
	 
	 System.out.println("It Appears="+count+" Times");	   
   }
}
