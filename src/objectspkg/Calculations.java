package objectspkg;

/**
 * This interface is used to implement the two calculations that are required in every class that involves a projectile to be used: duration and distance.  
 * 
 * @author Marc Pelve
 * @since JDK 7
 * @since March 2, 2016
 * @version 1.0
 */

public interface Calculations {
	//Methods for any projectile
	public double duration();
	public double distance();
}
