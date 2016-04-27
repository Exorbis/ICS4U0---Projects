package recursionpkg;

/**
 * This class will calculate the factorial in both recursive and iterative fashions
 * 
 * @author Mr. Seidel
 * @since October 4, 2015
 * @since JDK 8
 * @version 1.0
 * 
 */
public class Factorial implements RecursiveInterface {

	/**
	 * Default constructor
	 */
	public Factorial() {
		//nothing to do in here
	}
	
	/**
	 * Calculate the value n-factorial (n!) using a recursive method
	 * 
	 * @param n the value to calculate up to
	 * @return the final factorial calculated value as a double
	 */
	public long recursiveCalculate(long n) {
		if (n <= 1) return 1;
		return n * recursiveCalculate(n - 1);
	}
	
	/**
	 * Calculate the value n-factorial (n!) using an iterative method
	 * 
	 * @param n the value to calculate up to
	 * @return the final factorial calculated value as a double
	 */
	public long calculate(long n) {
		if (n <= 1) return 1; //used to catch bad input as well
		
		long answer = 1;
		for (int i = 1; i <= n; i++) {
			answer = answer * i;
		}
		return answer;
	}
	
	/**
	 * This function does nothing to satisfy interface
	 * 
	 * @param value the input value
	 * @return 0 to satisfy the method requirements
	 */
	public long calculate(String value){return 0;}
	
	/**
	 * This function does nothing to satisfy interface
	 * 
	 * @param value the input value
	 * @return to satisfy the method requirements
	 */
	public long recursiveCalculate(String value) {return 0;}
	
}
