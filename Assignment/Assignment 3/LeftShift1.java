import java.io.*;
class LeftShift1
{
   public static void main(String args[])
   {
	Console con = System.console();
	int arr[]; 
	arr = new int [5];
	int i, j, temp;
	for(i=0; i<arr.length; i++){
		arr[i]=Integer.parseInt(con.readLine());}

		i=0;
		j=1;
		while(j!=arr.length-1){
			temp = arr[i];
			arr[i] = arr[j];
		}
		if(arr[j]==arr.length-1){
			arr[j]=0;	}

		System.out.print("Shifted array is : ");
		for(i=0; i<arr.length; i++){
		System.out.print(arr[i]+" ");}
   }
}