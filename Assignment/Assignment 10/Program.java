import java.io.Console;

class Book
{
     private
          String b_name, b_author, b_publication;
     public
          Book(String name, String author, String publication)
          {
               b_name = name;
               b_author =author;
               b_publication = publication;
          }
          void print()
          {
               System.out.println("Book Name: \t\t"+b_name+"\nBook Author: \t\t"+b_author+"\nBook Publication: \t"+b_publication+"\n");
          }

}

class Dvd
{
     private
          String m_name, m_director, m_category;
     public
          Dvd(String name, String director, String category)
          {
               m_name = name;
               m_director = director;
               m_category = category;
          }
          void print()
          {
               System.out.println("Movie Name: \t\t"+m_name+"\nMovie Director: \t"+m_director+"\nMovie Category: \t"+m_category+"\n");
          }

}

class Item
{
     public static void main(String[] args)
     {
          Book b[] = new Book[10];
          Dvd d[] = new Dvd[10];
          int b_len = 0, d_len = 0;
          Console con = System.console();
          for(int i=0; i<3; i++)
          {
               System.out.println("Please Enter b or d for selection: ");
               String str = con.readLine();
               switch(str.toCharArray()[0])
               {
                    case 'b':
                         System.out.print("Enter Book Name: ");
                         String b_name = con.readLine();
                         System.out.print("Enter Book Author: ");
                         String b_author = con.readLine();
                         System.out.print("Enter Book Publication: ");
                         String b_publication = con.readLine();
                         System.out.println();
                         b[b_len++] = new Book(b_name, b_author, b_publication);
                         break;
                    case 'd':
                         System.out.print("Enter Movie Name: ");
                         String m_name = con.readLine();
                         System.out.print("Enter Movie Director: ");
                         String m_director = con.readLine();
                         System.out.print("Enter Movie Category: ");
                         String m_category = con.readLine();
                         System.out.println();
                         d[d_len++] = new Dvd(m_name, m_director, m_category);
                         break;
                    default:
                         System.out.print("Please choose correct option");
                         break;
               }
          }
          System.out.println("-------------------------------\nSelected Books are("+b_len+")\n-------------------------------\n");
          for(int i=0 ; i<b_len; i++)
               b[i].print();
          System.out.println("-------------------------------\nSelected DVD's are("+d_len+")\n-------------------------------\n");
          for(int i=0 ; i<d_len; i++)
               d[i].print();

     }
}