public class EvenCount
{
  public static void main(String[] args)
  {
    int a,b,c,d,count=0;

    a=(int)(Math.random()*100);
    b=(int)(Math.random()*100);
    c=(int)(Math.random()*100);
    d=(int)(Math.random()*100);
    System.out.println("a="+a);
    System.out.println("b="+b);
    System.out.println("c="+c);
    System.out.println("d="+d);
   if(a%2==0){
   count++;
}
   if(b%2==0){
   count++;
}
   if(c%2==0){
   count++;
}
   if(d%2==0){
   count++;
}
      System.out.println("Even Numbesr are ="+count);

  }
}
