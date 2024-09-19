import java.io.*;
class ReverseArray
{
    public static void main(String args[])
    {
        Console con = System.console();
                int arr[] = new int[10];
                int i,j,temp;
                System.out.println("Enter value =");
                for(i=0 ;i<arr.length; i++){
                    System.out.println("Reversed Array element are = arr " );
                    arr[i] =Integer.parseInt(con.readLine());
                    System.out.println("Reversed Array element are =arr[i] "+arr[i]);
                    i=0;
                    j= arr.length-1;
                    System.out.println("Reversed Array element are = i "+i);
                    System.out.println("Reversed Array element are =j "+ j);
                      while(i<j){
                          System.out.println("Reversed Array element are = i 2 "+i);
                          System.out.println("Reversed Array element are =j 2 "+ j);
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                        i++;
                        j--;
                    }
                    System.out.println("Reversed Array element are =");
                    for (i=0;i<arr.length;i++){
                        System.out.println(i+" ");
                    }

                }

    }
}
