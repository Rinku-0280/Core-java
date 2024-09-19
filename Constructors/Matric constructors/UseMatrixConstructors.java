class UseMatrixConstructors
{
    public static void main(String args[])
   {
	MatrixConstructors M1 = new MatrixConstructors();
	System.out.println("First matrix is");
	M1.show();

	MatrixConstructors M2 = new MatrixConstructors(5,4);
	System.out.println("Second matrix is");
	M2.show();

 	MatrixConstructors M3 = new MatrixConstructors(M2);
	System.out.println("Third matrix is");
	M3.show();

   }

}