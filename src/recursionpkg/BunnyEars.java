package recursionpkg;

/**
 * This class will calculate the number of bunny ears in both recursive and iterative fashions
 * 
 * @author Marc Pelve
 * @since March 29, 2016
 * @since JDK 7
 * @version 1.0
 * 
 */
public class BunnyEars implements RecursiveInterface {

	/*
	 * 
	We have a number of bunnies and each bunny has two big floppy ears. 
	We want to compute the total number of ears across all the 
	bunnies recursively (without loops or multiplication), and iteratively (looping, no multiplication). 

	calculate(0) -> 0
	calculate(1) -> 2
	calculate(2) -> 4

	recursiveCalculate(0) -> 0
	recursiveCalculate(1) -> 2
	recursiveCalculate(2) -> 4

	 */
	
	/**
	 * Default constructor
	 */
	public BunnyEars() {
		//nothing to do in here
	}
	
	/**
	 * This function calculates the number of bunny ears based on the number of bunnies inputed
	 * 
	 * @param n the number of bunnies
	 * @return the number of bunny ears after recursively adding
	 */
	public long recursiveCalculate(long n) {
		if (n < 1) return 0;
		if (n == 1) return 2;
		return 2 + recursiveCalculate(n-1);
	}
	
	/**
	 * This function calculates the number of bunny ears based on the number of bunnies inputed
	 * 
	 * @param n the number of bunnies
	 * @return the number of bunny ears after recursively adding
	 */
	public long calculate(long n) {
		if (n<1) return 0;
		return n + n;
	}
	
	/**
	 * This function returns 0 to satisfy interface
	 * 
	 * @param value the input value
	 * @return 0 to satisfy the method requirements
	 */
	public long calculate(String value){return 0;}
	
	/**
	 * This function returns 0 to satisfy interface
	 * 
	 * @param value the input value
	 * @return to satisfy the method requirements
	 */
	public long recursiveCalculate(String value) {return 0;}
}
