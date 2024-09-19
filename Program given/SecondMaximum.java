public class SecondMaximum
{
  public static void main(String[] args)
  {
    int a,b,c,Smax,max;
    a=(int)(Math.random()*100);
    b=(int)(Math.random()*100);
    c=(int)(Math.random()*100);
    System.out.println("a="+a);
    System.out.println("b="+b);
    System.out.println("c="+c);
    if(a>b){
      max=a;
      Smax=b;}
    else{
      max=b;
      Smax=a;
    }
    if(c>max){
        Smax=max;
        max=c;}
    else{
       if(c>Smax){
        Smax=c;
      }
    }
      System.out.println("Second Maximum Number Is ="+Smax);

  }
}
