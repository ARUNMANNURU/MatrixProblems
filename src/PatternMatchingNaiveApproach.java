/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class PatternMatchingNaiveApproach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stringPattern = "Hello Arun";
		String textPattern = "Arun";
		patternMatching(stringPattern,textPattern);
	}
	static void patternMatching(String stringPattern,String textPattern){
		
		int lenA = stringPattern.length();
		int lenB = textPattern.length();
		char[] chText = stringPattern.toCharArray();
		char[] paText = textPattern.toCharArray();
		for(int i=0; i <= lenA-lenB; i++){
			int j;
			for(j=0; j < lenB; j++)
				if(chText[i+j] != paText[j]){
					System.out.println("Pattern found"+i);
					break;
				}else if(j == lenB){
					System.out.println("Pattern not found");
					break;
				}
		}
	}
}
