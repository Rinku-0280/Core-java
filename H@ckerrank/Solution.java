import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Console con = System.console();
        String str;
        int x;
        for(int i=0; i<3; i++){
            str = con.readLine();
            x = Integer.parseInt(con.readLine());
            System.out.print(str+"               "+x);
        }
    }
}