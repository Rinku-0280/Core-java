import java.io.*;
class SortArray
{
   public static void main(String args[])
   {
	Console con = System.console();
	int arr[]; 
	arr = new int [5];
	int i, j, temp;
	for(i = 0; i<arr.length; i++){
		arr[i] = Integer.parseInt(con.readLine());
		System.out.print("Given array is : ");}

		for(i=0; i<arr.length; i++){
			for(j=i+1; j<arr.length; j++){
			   if(arr[i]>arr[j]){
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;}
			}
		}

		System.out.print("Sorted array is : ");
		for(int a=0; a<arr.length; a++){
		System.out.print(arr[a]+" ");}
   }
}