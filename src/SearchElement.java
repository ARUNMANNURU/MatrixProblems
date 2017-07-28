import java.util.Hashtable;

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
                		{32, 33, 39, 50}};
		searchElement(mat,4, 29);
	}
	/* Searches the element x in mat[][]. If the 
	   element is found, then prints its position 
	   and returns true, otherwise prints "not found"
	   and returns false */
	static void searchElement(int mat[][],int n, int x){
	
		int i = 0, j = n-1;  //set indexes for top right element
		
		   while ( i < n && j >= 0 )  // 0 < 3 && 3 >= 0 -- 0 < 3 && 2 >= 0 -- 0 < 3 && 1 >= 0 
		   {
		      if ( mat[i][j] == x )   // 40 == 29 -- 30 == 29 -- 20 == 29
		      {
		    	  System.out.println("Element found at---->"+"("+i+","+j+")");
		      }
		      if ( mat[i][j] > x )	// 40 > 29 -- 30 > 29 
		        j--;				// 2 -- 1
		      else //  if mat[i][j] < x -- 20 < 29
		        i++;
		   }
		 System.out.println("Not found");
		 
	}
}
