import java.io.*;
class LtoU
{
    public static void main(String[] args)throws IOException
    {
        int ch;
        File f = new File("A.txt");
        if(!f.exists())
        {
            System.out.println("file doesn't exists");
            System.exit(0);
        }
        FileInputStream fis = new FileInputStream("A.txt");
        FileOutputStream fos = new FileOutputStream("temp");
        while((ch=fis.read())!=-1)
            System.out.println((char)ch);
        fis.close();
        fos.close();
        temp = ch.toUpperCase();
        temp = ch.renameTo();
    }
}