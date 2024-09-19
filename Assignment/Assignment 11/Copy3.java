import java.io.*;
class Copy3
{
    public static void main(String[] args)throws IOException
    {
        if(args.length<3)
        {
            System.out.println("Parameters are lacking");
            System.exit(0);
        }
        else
        {
            if(args.length>3)
            {
                System.out.println("Too many Parameters");
                System.exit(0);
            }
        }
        File f1 = new File(args[0]);
        if(!f1.exists())
        {
            System.out.println("Source files does not exists");
            System.exit(0);
        }
        File f2 = new File(args[1]);
        if(!f2.exists())
        {
            System.out.println("Source files does not exists");
            System.exit(0);
        }
        FileInputStream fis1 = new FileInputStream(args[0]);
        FileInputStream fis2 = new FileInputStream(args[1]);
        FileOutputStream fos = new FileOutputStream(args[2],true);
        int ch;
        while((ch=fis1.read())!=-1)
            fos.write(ch);
        while((ch=fis2.read())!=-1)
            fos.write(ch);
        fis1.close();
        fis2.close();
        fos.close();
    }
}