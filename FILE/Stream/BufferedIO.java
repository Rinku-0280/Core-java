import java.io.*;
class BufferedIO
{
    public static void main(String args[])throws IOException
    {
        FileInputStream fis = new FileInputStream("A.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("b.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int ch;
        while((ch=bis.read())!=-1)
            bos.write(ch);
        bis.close();
        bos.close();
    }
}
