package a.b;
import a.b.c.Person;
public class ContactInfo extends Person
{
   public long phone;
            public ContactInfo()
            {
                phone = 0;
            }
            public ContactInfo(String nm,String srm,long phn )
            {
                super(nm,srm);
                phone = phn;
            }
            public ContactInfo(ContactInfo con)
            {
                super(con);
                phone = con.phone;
            }
}