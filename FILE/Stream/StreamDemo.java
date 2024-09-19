import java.io.FileInputStream;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.*;
class StreamDemo
{
    public static void main(String args[]) throws IOException
    {
        StreamTokenizer st = new StreamTokenizer(new FileInputStream("Copy.java"));
        while (st.nextToken() != StreamTokenizer.TT_EOF)
        {
            String s;
            switch (st.ttype)
            {
                case StreamTokenizer.TT_EOF:
                    s = "EOL";
                    break;
                case StreamTokenizer.TT_NUMBER:
                    s = st.nval+"";
                    break;
                case StreamTokenizer.TT_WORD:
                    s = st.sval;
                    break;
                default:
                    s = ""+((char)st.ttype);
            }
            System.out.println(s);
        }
    }
}