import java.io.*;
class CopyFile
{
    public static void main(String args[])throws IOException {
        if (args.length < 2) {
            System.out.println("Parametrs are missing");
            System.exit(0);
        } else {
            if (args.length > 2) {
                System.out.println("Too many Paramters");
                System.exit(0);
            }
        }
        File f = new File(args[0]);
        if (!f.exists()) {
            System.out.println("Source file does not exists");
            System.exit(0);
        }
        FileInputStream fis = new FileInputStream(args[0]);
        FileOutputStream fos = new FileOutputStream(args[1]);
        int ch;
        while((ch=fis.read())!=-1)
            fos.write(ch);
        fis.close();
        fos.close();
    }
}