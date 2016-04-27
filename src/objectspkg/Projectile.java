package objectspkg;
import static java.lang.Math.sqrt;

/**
 * This Projectile will be used as the framework for when a projectile is created 
 * and general directions regarding it.
 * 
 * @author Marc Pelve
 * @since JDK 7
 * @since March 20, 2016
 * @version 1.2
 */
public class Projectile implements Calculations {
	protected double initialHeight; //the starting height of the Projectile
	private double horizontalVelocity; //the starting velocity of the Projectile
	private double time; //the time of flight of Projectile
	
	/**
	 * This is the constructor for the Projectile that takes in the initial
	 * height and velocity of the Projectile
	 * 
	 * @param initialHeight this is the height at which the Projectile starts at (in meters)
	 * @param horizontalVelocity this is the velocity at which the Projectile is thrown at, being that it is purely horizontal force (in meters/second)
	 */
	public Projectile(double initialHeight, double horizontalVelocity){
		this.initialHeight = initialHeight;
		this.horizontalVelocity = horizontalVelocity;
	}
	
	/**
	 * This function uses the standard vertical projectile motion formula (dy = v1 * t + 0.5 * a * t^2) to return the time it take to reach the 'ground' (a value of 0)
	 * 
	 * @return the time at which the Projectile's y-value reaches 0 in only positive number values (as a double)
	 */
	public double duration(){
		time = sqrt((2 * initialHeight)/9.81);
		return time;
	}
	
	/**
	 * This function uses the standard horizontal motion formula to return the distance the Projectile traveled while in 'flight'
	 * 
	 * @return the distance the Projectile traveled (in meters - as a double)
	 */
	public double distance(){
		return time * horizontalVelocity;
	}
	
	/**
	 * This function returns the user-inputed value of the initial horizontal velocity to ensure the value used is paired with other correct information
	 * 
	 * @return the horizontal velocity that is inputed when initializing the Projectile (as a double)
	 */
	public double velocity(){
		return horizontalVelocity;
	}
	
	/**
	 * This function returns the user-inputed value of the initial vertical height to ensure the value used is paired with other correct information
	 * 
	 * @return the vertical height that is inputed when initializing the Projectile (as a double)
	 */
	public double height(){
		return initialHeight;
	}
	
	/**
	 * This function returns the specific class of the object when printed, overriding the default toString function when an array of objects is printed
	 * 
	 * @return the class name of the object being printed by the toString function
	 */
	@Override
	public String toString() {
		return getClass().getSimpleName();
	}
	
}
