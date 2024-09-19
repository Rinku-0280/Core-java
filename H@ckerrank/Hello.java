import java.io.*;
import java.util.*;

public class Hello {

    public static void main(String[] args) {
        Console con = System.console();
        System.out.println("Hello, World.");
        String str=new String();
        str=con.readLine();
        System.out.print(str);
    }
}
