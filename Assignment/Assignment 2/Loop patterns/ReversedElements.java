class ReversedElements
{
   public static void main(String args[])
   {
	Console con = System.console();
	int arr[] = new int[10];
	int i,j,temp;
	Systm.out.print("Enter values");
	for(i=0;i<arr.length;i++){
	arr[i]=Integer.parseInt(con.readLine());

	i=0;
	i=arr.length-1;
	while(i<j){
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		j--;
		}
		Systm.out.print("Reversed arr elements are ");
		for(i=0;i<arr.lenth;i++){
		Systm.out.print(arr[i]+" ");
		}

	}
   }
}