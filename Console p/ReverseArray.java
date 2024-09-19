import java.io.*;
class ReverseArray
{
   public static void main(String args[])
   {
	Console con = System.console();
	int []arr; 
	arr = new int [10];
	int i, j, temp;
	for(i = 0; i<arr.length; i++){
		arr[i] = Integer.parseInt(con.readLine());
		}
	i = 0;
	j = arr.length-1;
	while(i<j){
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		i++;
		j--;
	}
	System.out.print("Reversed elements are :");
	for(i=0; i<arr.length; i++){
		System.out.print(arr[i]+" ");
		}

   }
}