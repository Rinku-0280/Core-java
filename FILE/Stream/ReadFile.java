import java.io.*;
class ReadFile
{
    public static void main(String args[])throws IOException
    {
        FileInputStream fis = new FileInputStream("A.txt");
        int ch;
        while((ch=fis.read())!=-1)
            System.out.println((char)ch);
        fis.close();
    }
}