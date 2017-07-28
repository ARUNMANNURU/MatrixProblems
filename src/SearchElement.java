/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class SearchElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = { {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50},
              };
		searchElement(mat, 4, 29);
	}
	/* Searches the element x in mat[][]. If the 
	   element is found, then prints its position 
	   and returns true, otherwise prints "not found"
	   and returns false */
	static int searchElement(int mat[][], int n, int x){
	   int i = 0, j = n-1;  //set indexes for top right element
	   while ( i < n && j >= 0 )
	   {
	      if ( mat[i][j] == x )
	      {
	     //   printf("n found at %d %d,"i,j);
	         return 1;
	      }
	      if ( mat[i][j] > x )
	        j--;
	      else //  if mat[i][j] < x
	        i++;
	   }
	 
	   System.out.println("n Element not found");
	   return 0;  // if ( i==n || j== -1 )
	}
}