import java.io.*;
class Money implements Cloneable
{
    private int rs;
    private int paisa;
    public void set (int r,int p)
    {
        rs=r;
        paisa=p;
    }
    public String toString()
    {
        return rs+"."+paisa;
    }
}