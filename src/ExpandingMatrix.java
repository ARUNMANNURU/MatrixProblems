/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class ExpandingMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "aacbddc";
		 System.out.println("Left of-->"+str+"is-->"+findLeft(str));
	}
	// Returns left of str in an expanding matrix of
	// a, b, c  and d.
	//aacbdcd
	static String findLeft(String str)
	{
	    int n = str.length();
	    char[] ch = str.toCharArray();
	 
	    // Start from rightmost position
	    while (n > 0)
	    {
	    	n--;
	        // If the current character is ‘b’ or ‘d’,
	        // change to ‘a’ or ‘c’ respectively and
	        // break the loop
	        if (ch[n] == 'd')
	        {
	            ch[n] = 'c';
	            break;
	        }
	        if (ch[n] == 'b')
	        {
	            ch[n] = 'a';
	            break;
	        }
	 
	        // If the current character is ‘a’ or ‘c’,
	        // change it to ‘b’ or ‘d’ respectively
	        if (ch[n] == 'a')
	            ch[n] = 'b';
	        else if (ch[n] == 'c')
	            ch[n] = 'd';
	     
	    }
	 
	    return str;
	}

}
