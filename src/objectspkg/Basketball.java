package objectspkg;

/**
 * This Basketball will be used as the framework for when a basketball is chosen as the projectile
 * and will apply general directions regarding it.
 * 
 * @author Marc Pelve
 * @since JDK 7
 * @since March 3, 2016
 * @version 1.0
 */
public class Basketball extends Projectile{
	
	/**
	 * This is the constructor for the Basketball that takes in the initial
	 * height and velocity of the Basketball
	 * 
	 * @param initialHeight this is the height at which the Basketball starts at (in meters)
	 * @param horizontalVelocity this is the velocity at which the Basketball is thrown at, being that it is purely horizontal force (in meters/second)
	 */
	public Basketball(double initialHeight, double horizontalVelocity) {
		super(initialHeight, horizontalVelocity);
	}
	
	/**
	 * This function checks if the Basketball is thrown from too high and will return false if it is (1.5 meters is roughly the highest jump in the world)
	 * 
	 * @return the decision whether the ball is too high or to be thrown or not (false for too high, true for within the limit)
	 */
	public boolean checkHeight(){
		if (initialHeight > 1.5){
			return false;
		} else {
			return true;
		}
	}
	
	/**
	 * This function checks if the inputed value is thrown from too high and will return a string informing of this condition
	 * 
	 * @param inputHeight this is the value inputed that needs to be checked
	 * @return the string informing whether the height is acceptable or not
	 */
	public String checkHeight(double inputHeight){
		if (inputHeight > 1.5){
			return "That is not an acceptable height";
		} else {
			return "That is an acceptable height";
		}
	}
	
	/**
	 * This sets the value of the private instance variable initial height to the adjusted one
	 * 
	 * @param adjustedHeight this is the value that will replace the initial height (in meters)
	 */
	public void setHeight(double adjustedHeight){
		this.initialHeight = adjustedHeight;
	}
}
