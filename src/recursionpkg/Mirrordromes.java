package recursionpkg;

public class Mirrordromes implements RecursiveInterface {

	/*
	 * 
		This class should count the number of mirrordromes within the given string,
	including single mirror letters as defined below.
	
	A mirrordrome is a word that will check to see if a word can be mirrored
	in the horizontal axis when cut in half.
	
	Single letters that are considered mirrors in this program include:
	i, l, m, n, o, t, u, v, w, x
	
	Letters that are considered mirrored opposites in this program include:
	b <-> d, p <-> q, s <-> z

	
	calculate("dob") -> 2          //('o', 'dob')
	calculate("linnil") -> 9       //('n', 'n', 'nn', 'i', 'i', 'l', 'l', 'inni', 'linnil')
	calculate("totally") -> 7      //('t', 't', 'o', 'l', 'l', 'll', 'tot')
	

	recursiveCalculate("dob") -> 2          //('o', 'dob')
	recursiveCalculate("linnil") -> 9       //('n', 'n', 'nn', 'i', 'i', 'l', 'l', 'inni', 'linnil')
	recursiveCalculate("totally") -> 7      //('t', 't', 'o', 'l', 'l', 'll', 'tot')

	 */
	
	
	/**
	 * Default constructor
	 */
	public Mirrordrome() {
		//nothing to do in here
	}
	
	/**
	 * This function returns 0 to satisfy interface
	 * 
	 * @param n the input value
	 * @return 0 to satisfy the method requirements
	 */
	public long recursiveCalculate(long n) {return 0;}
	
	/**
	 * This function returns 0 to satisfy interface
	 * 
	 * @param n the input value
	 * @return 0 to satisfy the method requirements
	 */
	public long calculate(long n) {return 0;}
	
	/**
	 * This function does nothing to satisfy interface
	 * 
	 * @param value the input value
	 * @return 0 to satisfy the method requirements
	 */
	public long calculate(String value){
		char[] singleLetterDromes;
		singleLetterDromes[0] = 'i';
		singleLetterDromes[1] = 'l';
		singleLetterDromes[2] = 'm';
		singleLetterDromes[3] = 'n';
		singleLetterDromes[4] = 'o';
		singleLetterDromes[5] = 't';
		singleLetterDromes[6] = 'u';
		singleLetterDromes[7] = 'v';
		singleLetterDromes[8] = 'w';
		singleLetterDromes[9] = 'x';
		
		for (int i = 0; i < value.length(); i++){
			
	}
	
	/**
	 * This function does nothing to satisfy interface
	 * 
	 * @param value the input value
	 * @return to satisfy the method requirements
	 */
	public long recursiveCalculate(String value) {
		char[] singleLetterDromes;
		
	}
}
	
}
