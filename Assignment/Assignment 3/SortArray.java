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
		}
	
	do{
		i = 0;
		j = 1;
		if(arr[i]>arr[j]){
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		j++; 
		if(j==arr.length-1){
			i++;} 

	  }while(j!=arr.length-1);

		System.out.print("Sorted array is : ");
		for(int a=0; a<arr.length; a++){
		System.out.print(arr[a]+" ");}
   }
}