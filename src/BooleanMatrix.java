/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class BooleanMatrix {

	/**
	 * @param args
	 */
	
	static void modifyMatrix(boolean mat[][],int R,int C)
	{
	    boolean[] row = null;
	    boolean[] col = null;
	 
	    int i, j;
	 
	 
	    /* Initialize all values of row[] as 0 */
	    for (i = 0; i < R; i++)
	    {
	       row[i] = false;
	    }
	 
	 
	    /* Initialize all values of col[] as 0 */
	    for (i = 0; i < C; i++)
	    {
	       col[i] = false;
	    }
	 
	 
	    /* Store the rows and columns to be marked as 1 in row[] and col[]
	       arrays respectively */
	    for (i = 0; i < R; i++)
	    {
	        for (j = 0; j < C; j++)
	        {
	            if (mat[i][j] == true)
	            {
	                row[i] = true;
	                col[j] = true;
	            }
	        }
	    }
	 
	    /* Modify the input matrix mat[] using the above constructed row[] and
	       col[] arrays */
	    for (i = 0; i < R; i++)
	    {
	        for (j = 0; j < C; j++)
	        {
	            if ( row[i] == true || col[j] == true )
	            {
	                mat[i][j] = true;
	            }
	        }
	    }
	}
	 
	/* A utility function to print a 2D matrix */
	static void printMatrix(boolean mat[][],int R,int C)
	{
	    int i, j;
	    for (i = 0; i < R; i++)
	    {
	        for (j = 0; j < C; j++)
	        {
	        	System.out.print(mat[i][j]+" ");
	        }
	    System.out.println();   
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] mat = {{true,false,false,true},{false,false,true,false},{false,false,false,false}};
		int R = mat.length;
		int C = mat[0].length;
		System.out.println("Input Matrix N:");
		    
		printMatrix(mat,R,C);
		 
		modifyMatrix(mat,R,C);
	
	    System.out.println("Matrix after modification N:");
	    printMatrix(mat,R,C);
	}

}
