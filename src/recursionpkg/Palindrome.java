package recursionpkg;

public class Palindrome implements RecursiveInterface {

	/*
	 * 
	This class should check to see if a word is a palindrome.  The program
	should not care whether a word has a capital letter in it or not 
	We want to check if the word is a palindrome both 
	recursively (without loops), 
	and iteratively (looping). 

	calculate("hello") -> False
	calculate("racecar") -> True
	calculate("raceCar") -> True

	recursiveCalculate("hello") -> False
	recursiveCalculate("racecar") -> True
	recursiveCalculate("racecar") -> True

	 */
	
	/**
	 * Default constructor
	 */
	public Palindrome() {
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
		if (value.length() <= 1) return 0;
		if (value.length() == 2 && value.toLowerCase().charAt(0) == value.toLowerCase().charAt(1)) return 1;
		while(value.toLowerCase().charAt(0) == value.toLowerCase().charAt(value.length()-1) && value.length() > 2){
			value = value.substring(1, value.length()-1);
			return 1;
		}
		return 0;
	}
	
	/**
	 * This function does nothing to satisfy interface
	 * 
	 * @param value the input value
	 * @return to satisfy the method requirements
	 */
	public long recursiveCalculate(String value) {
		if (value.length() <= 1) return 0;
		if (value.length() < 4 && value.toLowerCase().charAt(0) == value.toLowerCase().charAt(value.length()-1)) return 1;
		if (value.toLowerCase().charAt(0) == value.toLowerCase().charAt(value.length()-1)) return recursiveCalculate(value.substring(1, value.length()-1));
		
		return 0;
	}
}
	

	
