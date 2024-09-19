interface Item
{
     public void title();
     public void author();
     public void publication();
}
interface I2nd
{
     public void movie();
     public void name();
     public void catagory();
}
class Book implements Item
{
     public void title()
     {
          System.out.println("Enter Title Of Book :");
     }
     public void author()
     {
          System.out.println("Enter Author Of Book :");
     }
     public void publication()
     {
          System.out.println("Enter Publication Of Book :");
     }
}
class DVD implements I2nd
{
     public void movie()
     {
          System.out.println("Enter Title Of Movie :");
     }
     public void name()
     {
          System.out.println("Enter Director Name :");
     }
     public void catagory()
     {
          System.out.println("Enter Catagory Of Movie :");
     }
}