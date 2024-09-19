public class Matrix 
{
    private int rows;
    private int cols;
    private int[][] arr;

    public Matrix() 
    {
        this.rows = 0;
        this.cols = 0;
        this.arr = new int[0][0];
    }

    public Matrix(int rows, int cols) 
    {
        this.rows = rows;
        this.cols = cols;
        this.arr = new int[rows][cols];
    }

    public Matrix(int[][] arr) 
    {
        this.rows = arr.length;
        this.cols = arr[0].length;
        this.arr = arr;
    }

    public Matrix(int rows, int cols, int initialValue) 
       {
        this.rows = rows;
        this.cols = cols;
        this.arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) 
	   {
            for (int j = 0; j < cols; j++) 
		{
                this.arr[i][j] = initialValue;
                }
           }
       
}
