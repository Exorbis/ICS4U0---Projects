package objectspkg;

import java.util.*;
import java.text.DecimalFormat;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;





public class Main {
	
	public static void main(String[] args) {
		//Setup array lists for gathered information
		ArrayList<String> listOfNames = new ArrayList<String>();
		ArrayList<Double> listOfDurations = new ArrayList<Double>();
		ArrayList<Double> listOfDistances = new ArrayList<Double>();
		ArrayList<Double> listOfVelocities = new ArrayList<Double>();
		ArrayList<Double> listOfHeights = new ArrayList<Double>();
		DecimalFormat decimals = new DecimalFormat("#.###"); //3-decimal formatting
		Scanner userInput = new Scanner(System.in); //setup for user-based input
		
		//Selection for a straight from file launch or user inputed information
		System.out.println("Which methodology would you like to execute, 'load from file' or 'text input'?");
		String inputMethod = userInput.nextLine().toLowerCase().trim();
		

		/* Established to store file based information:
		* seperateData[0] is thrower's name, seperateData[1] is projectile type
		* seperateData[2] is starting height, seperateData[3] is starting velocity
		*/
		ArrayList<Projectile> projectile = new ArrayList<Projectile>();
		
		if (inputMethod.equals("load from file")){
			
			try(BufferedReader lineReader = new BufferedReader(new FileReader("data.txt"))){
				String lineInFile;
				String seperateData[] = null;
			
				while ((lineInFile = lineReader.readLine()) != null){
					seperateData = lineInFile.split(",");
					
					if (seperateData[1].toLowerCase().equals("basketball")){
						
						//Starting height and velocity gathered and placed in new object
						Projectile ball = new Basketball(Double.parseDouble(seperateData[2]), Double.parseDouble(seperateData[3]));
						projectile.add(new Basketball(Double.parseDouble(seperateData[2]), Double.parseDouble(seperateData[3]))); //for class reference on finishing print
						
						
						
						//Name, velocity, height, duration and distance gathered and placed in lists with 3-decimal formating  (except name)
						listOfNames.add(seperateData[0]);
						listOfVelocities.add(Double.valueOf(decimals.format(ball.velocity())));
						listOfHeights.add(Double.valueOf(decimals.format(ball.height())));
						listOfDurations.add(Double.valueOf(decimals.format(ball.duration())));
						listOfDistances.add(Double.valueOf(decimals.format(ball.distance())));
						
					} 
					
					if(seperateData[1].toLowerCase().equals("projectile")) {
						
						//Starting height and velocity gathered and placed in new object
						Projectile ball = new Projectile(Double.parseDouble(seperateData[2]), Double.parseDouble(seperateData[3]));
						projectile.add(new Projectile(Double.parseDouble(seperateData[2]), Double.parseDouble(seperateData[3]))); //for class reference on finishing print
						
						//Name, velocity, height, duration and distance gathered and placed in lists with 3-decimal formating  (except name)
						listOfNames.add(seperateData[0]);
						listOfVelocities.add(Double.valueOf(decimals.format(ball.velocity())));
						listOfHeights.add(Double.valueOf(decimals.format(ball.height())));
						listOfDurations.add(Double.valueOf(decimals.format(ball.duration())));
						listOfDistances.add(Double.valueOf(decimals.format(ball.distance())));
						
					} 
					
					
				}
				
			} catch (IOException e){
				e.printStackTrace();
			} catch (NumberFormatException e){
				System.out.println("Probable error concerning inputed paramaters for object");
				e.printStackTrace();
			} 

		} else {
			

			
			while(true) {
				System.out.println("Which calculation would you like, 'basketball' specific or general 'projectile' (type those specified in the quotation marks) - or 'stop' to end");
				String inputObject = userInput.nextLine().toLowerCase().trim();
				
				//Exit loop if user inputs 'stop' - anything else runs code for either 'basketball' or 'projectile'
				if (inputObject.equals("stop")){
					break;
				} else if (inputObject.equals("basketball")){
					//Basketball thrower's name inputed by user
					System.out.println("Enter the name of the new basketball thrower or 'stop' to end");
					String inputName = userInput.nextLine().trim();
					
					//Same 'stop' check
					if (inputName.equals("stop")){
						break;
					}
					
					//User has choice to check values for the height if they are acceptable
					System.out.println("Would you like to enter the height checker? 'yes' / 'no'");
					if (userInput.nextLine().toLowerCase().trim().equals("yes")){
						while(true){
							System.out.println("What value for the height would you like to check? (Enter numerical value or 'exit' to move on)");
							String inputCheckHeight = userInput.nextLine().trim();
							
							//Exits the height checker 
							if (inputCheckHeight.equals("exit")){
								break;
							}
							
							Basketball testBall = new Basketball(0, 0);
							System.out.println(testBall.checkHeight(Double.parseDouble(inputCheckHeight))); //returns a sys out string as to whether the height works or not
						}
					}
					
					//Initial height inputed by user
					System.out.println("Enter the initial height of the new ball (in meters)");
					String inputHeight = userInput.nextLine().trim();
					
					//Creates a new Basketball to test if the height is above 1.5m - if it is new input requested
					Basketball testBall = new Basketball(Double.parseDouble(inputHeight), 0);
					while(testBall.checkHeight() == false) {
						System.out.println("You cannot be above 1.5 meters, please enter a proper initial height of the ball (in meters)");
						inputHeight = userInput.nextLine().trim();
						testBall.setHeight(Double.parseDouble(inputHeight)); //Sets the new height of basketball
					}
					
					//Initial velocity inputed by user
					System.out.println("Enter the horizontal 'push' (velocity) of the new ball (in meters/second)");
					String inputVelocity = userInput.nextLine().trim();
					
					//Starting height and velocity gathered and placed in new object
					Projectile ball = new Basketball(Double.parseDouble(inputHeight), Double.parseDouble(inputVelocity));
					projectile.add(new Basketball(Double.parseDouble(inputHeight), Double.parseDouble(inputVelocity))); //for class reference on finishing print
					
					//Name, velocity, height, duration and distance gathered and placed in lists with 3-decimal formating (except name)
					listOfNames.add(inputName);
					listOfVelocities.add(Double.valueOf(decimals.format(ball.velocity())));
					listOfHeights.add(Double.valueOf(decimals.format(ball.height())));
					listOfDurations.add(Double.valueOf(decimals.format(ball.duration())));
					listOfDistances.add(Double.valueOf(decimals.format(ball.distance())));
				} else {
					//Projectile thrower's name inputed by user
					System.out.println("Enter the name of the new projectile thrower or 'stop' to end");
					String inputName = userInput.nextLine().trim();
					
					//Same 'stop' check
					if (inputName.equals("stop")){
						break;
					}
					
					//Initial height inputed by user
					System.out.println("Enter the initial height of the new ball (in meters)");
					String inputHeight = userInput.nextLine().trim();
					
					//Initial velocity inputed by user
					System.out.println("Enter the horizontal 'push' (velocity) of the new ball (in meters/second)");
					String inputVelocity = userInput.nextLine().trim();
					
					//Starting height and velocity gathered and placed in new object
					Projectile ball = new Projectile(Double.parseDouble(inputHeight), Double.parseDouble(inputVelocity));
					projectile.add(new Projectile(Double.parseDouble(inputHeight), Double.parseDouble(inputVelocity))); //for class reference on finishing print
					
					//Name, velocity, height, duration and distance gathered and placed in lists with 3-decimal formating  (except name)
					listOfNames.add(inputName);
					listOfVelocities.add(Double.valueOf(decimals.format(ball.velocity())));
					listOfHeights.add(Double.valueOf(decimals.format(ball.height())));
					listOfDurations.add(Double.valueOf(decimals.format(ball.duration())));
					listOfDistances.add(Double.valueOf(decimals.format(ball.distance())));
				}
				
				
			} 
			
		}
		
		
		
		
		//Goes through the list and prints out relevant information for each object
		for (int i = 0; i < listOfNames.size(); i++){
			System.out.println("\n" + listOfNames.get(i) + " threw his/her " + projectile.get(i) + " " + listOfVelocities.get(i) + " m/s from a height of " + listOfHeights.get(i) 
				+ " meter(s) and it took\n" + listOfDurations.get(i) + " second(s) to reach a distance of " +  listOfDistances.get(i) + " meter(s).");
		}
		

	}

}
