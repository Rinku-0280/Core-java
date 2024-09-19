import java.io.*;
public class FILE
{
    public static void main(String[] args)
    {;
        File f1 = new File("C:/Users/jangi/OneDrive/Desktop/Core java");
        if(f1.exists())
        {
            System.out.println("File exists");
        }
        else
        {
            System.out.println("File does not exists");
        }

    }
}