public class Homework1Harris {

	public static void main(String[] args) {
		//setting coordinates
		//Plan to use Distance = sqrt((x1-x2)^2 + (y1-y2)^2)
		final double xStart = 10;
		final double yStart = 10;
		
		final double xEnd = 30;
		final double yEnd = 30;
		
		//setting current coordinates
		double xCurrent = xStart;
		double yCurrent = yStart;
		
		//setting constants and variables to use in the while loop
		double waterRemaining = 18;
		double waterConsumed = 0;
		final double waterPerHour = 1.5;
		
		final double firstSpeed = 4;
		final double secondSpeed = 2;
		final double thirdSpeed = 1;
		double currentSpeed = 0;
		
		//separate hour counts to use for finding average speed at the end
		double hourCount = 0;
		double hoursat4 = 0;
		double hoursat2 = 0;
		double hoursat1 = 0;
		
		double averageSpeed = 0;
		
		//variables to keep track of the various distances
		double distanceTraveled = 0;
		double distancePerHour = 0;
		double distanceRemaining = Math.sqrt(Math.pow(xStart - xEnd, 2) + Math.pow(yStart - yEnd, 2));
		
		//while loop that handles everything
		while (xCurrent < xEnd) {
			
			//this handles printing out initial conditions
			if (hourCount == 0) {
				//using printf and println to handle formatting the "table"
				//I tested how the table looks through Eclipse and the terminal, so hopefully it looks decent on whoever grades this computer
				System.out.println("                                               StormTrooper Movement Calculations Chart");
				System.out.println("                                                    Chart Prepared By Isaac Harris");
				System.out.println(" ");
				System.out.println("Hour" + "\t" + "Current Location" + "\t" + "Current Speed" + "\t" + "Distance (Hour)" + "\t" + "Total Distance (Hour)" + "\t" + "Distance Remaining" + "     " + "Water Consumed" + "\t" + "Water Remaining" + "\n" + "_______________________________________________________________________________________________________________________________________________");
				System.out.printf("%-7.0f %2.1f, %2.1f 		%-3.1fkph 		%-4.2fkm 		%-5.0fkm 		%-4.2fkm 	       %-3.1fL 		%-3.1fL ", hourCount, xCurrent, yCurrent, currentSpeed, distancePerHour, distanceTraveled, distanceRemaining, waterConsumed, waterRemaining);
				hourCount += 1;
			} 
			//this handles when the speed is 4
			if (hourCount <= 4 && hourCount != 0) {
				//updating variables to match current conditions
				currentSpeed = firstSpeed;
				waterConsumed = waterConsumed + waterPerHour;
				waterRemaining = waterRemaining - waterPerHour;
				// I used the 45 45 90 triangle to find that speed/sqrt(2) gives the change in x and y
				double changeInX = (currentSpeed/Math.sqrt(2));
				double changeInY = (currentSpeed/Math.sqrt(2));
				//I made changeInX/Y just so I could change xyCurrent and update the distance variables
				xCurrent = xCurrent + changeInX;
				yCurrent = yCurrent + changeInY;
				
				//Used the pythagorean theorem to find the total distance traveled, basically computed the hypotenuse
				distanceTraveled += Math.sqrt(Math.pow(changeInX, 2) + Math.pow(changeInY, 2));
				distanceRemaining = Math.sqrt(Math.pow(xCurrent - xEnd, 2) + Math.pow(yCurrent - yEnd, 2));
				distancePerHour = Math.sqrt(Math.pow(changeInX, 2) + Math.pow(changeInY, 2));
				
				//printing out values to my "table"
				System.out.printf("%n%-7.0f %2.1f, %2.1f 		%3.1fkph 		%4.2fkm 		%-5.0fkm 		%-2.2fkm 	       %-4.1fL 		%-4.1fL ", hourCount, xCurrent, yCurrent, currentSpeed, distancePerHour, distanceTraveled, distanceRemaining, waterConsumed, waterRemaining);
				hourCount += 1;
				hoursat4 += 1;
			}
			//this handles when the speed is 2
			if (hourCount <= 8 && hourCount > 4) {
				//updating variables to match current conditions
				currentSpeed = secondSpeed;
				waterConsumed = waterConsumed + waterPerHour;
				waterRemaining = waterRemaining - waterPerHour;
				// I used the 45 45 90 triangle to find that speed/sqrt(2) gives the change in x and y
				double changeInX = (currentSpeed/Math.sqrt(2));
				double changeInY = (currentSpeed/Math.sqrt(2));
				//I made changeInX/Y just so I could change xyCurrent and update the distance variables
				xCurrent = xCurrent + changeInX;
				yCurrent = yCurrent + changeInY;
				//Used the pythagorean theorem to find the total distance traveled, basically computed the hypotenuse
				distanceTraveled += Math.sqrt(Math.pow(changeInX, 2) + Math.pow(changeInY, 2));
				distanceRemaining = Math.sqrt(Math.pow(xCurrent - xEnd, 2) + Math.pow(yCurrent - yEnd, 2));
				distancePerHour = Math.sqrt(Math.pow(changeInX, 2) + Math.pow(changeInY, 2));
				
				//printing out values to my "table"
				System.out.printf("%n%-7.0f %2.1f, %2.1f 		%3.1fkph 		%4.2fkm 		%-5.0fkm 		%-5.2fkm 	       %-4.1fL 		%-4.1fL ", hourCount, xCurrent, yCurrent, currentSpeed, distancePerHour, distanceTraveled, distanceRemaining, waterConsumed, waterRemaining);
				hourCount += 1;
				hoursat2 += 1;
			}
			//this handles when the speed is 1
			if (hourCount > 8) {
				//this if condition handles when the water has not yet been completely consumed
				if (waterRemaining != 0) {

					currentSpeed = thirdSpeed;
					waterConsumed = waterConsumed + waterPerHour;
					waterRemaining = waterRemaining - waterPerHour;
					// I used the 45 45 90 triangle to find that speed/sqrt(2) gives the change in x and y
					double changeInX = (currentSpeed/Math.sqrt(2));
					double changeInY = (currentSpeed/Math.sqrt(2));
					//I made changeInX/Y just so I could change xyCurrent and update the distance variables
					xCurrent = xCurrent + changeInX;
					yCurrent = yCurrent + changeInY;
					//Used the pythagorean theorem to find the total distance traveled, basically computed the hypotenuse
					distanceTraveled += Math.sqrt(Math.pow(changeInX, 2) + Math.pow(changeInY, 2));
					distanceRemaining = Math.sqrt(Math.pow(xCurrent - xEnd, 2) + Math.pow(yCurrent - yEnd, 2));
					distancePerHour = Math.sqrt(Math.pow(changeInX, 2) + Math.pow(changeInY, 2));
					
					//printing out values to my "table"
					System.out.printf("%n%-7.0f %2.1f, %2.1f 		%3.1fkph 		%4.2fkm 		%-5.0fkm 		%-5.2fkm 	       %-4.1fL 		%-4.1fL ", hourCount, xCurrent, yCurrent, currentSpeed, distancePerHour, distanceTraveled, distanceRemaining, waterConsumed, waterRemaining);
					hourCount += 1;
					hoursat1 += 1;
				}
				//this if conditional handles when all the water is consumed and the distance remaining is less than 1
				if (distanceRemaining < 1 && waterRemaining == 0) {
					//I used the 45 45 triangle to find how much x/y changes when distance remaining is the hypotenuse
					double changeInX = (distanceRemaining/Math.sqrt(2));
					double changeInY = (distanceRemaining/Math.sqrt(2));
					double finalSpeed = Math.sqrt(Math.pow(changeInX, 2) + Math.pow(changeInY, 2));
					
					xCurrent = xCurrent + changeInX;
					yCurrent = yCurrent + changeInY;
					//Used the pythagorean theorem to find the total distance traveled, basically computed the hypotenuse
					distanceTraveled += Math.sqrt(Math.pow(changeInX, 2) + Math.pow(changeInY, 2));
					distanceRemaining = Math.sqrt(Math.pow(xCurrent - xEnd, 2) + Math.pow(yCurrent - yEnd, 2));
					distancePerHour = Math.sqrt(Math.pow(changeInX, 2) + Math.pow(changeInY, 2));
					
					//printing out values to my "table"
					//I have water consumed as 0L to reflect the slides for hour 13
					//I asked Professor Locklear via email, and he said it was fine if I had .28km or 1km under Distance (Hours)
					System.out.printf("%n%-7.0f %2.1f, %2.1f 		%3.1fkph 		%4.2fkm 		%-5.1fkm 		%-5.0fkm 	       %-4.1fL 		%-4.1fL ", hourCount, xCurrent, yCurrent, currentSpeed, distancePerHour, distanceTraveled, distanceRemaining, waterRemaining, waterRemaining);
					
					averageSpeed = ((hoursat4 * firstSpeed) + (hoursat2 * secondSpeed) + (hoursat1 * thirdSpeed) + (finalSpeed))/hourCount;
					System.out.println("");
					System.out.printf("%nThe Stormtrooper Squad arrived in %.0f hours and travelled %.2f kilometers", hourCount, distanceTraveled);
					System.out.printf("%nThe Stormtrooper Squad's average speed was %2.2fkph", averageSpeed);
				}
			}

		}
		
	//I separated this into a static method to make my code easier to read, all it does is find the distance and return it
	//Since we can't use static methods on this exercise, I just commented it out but left it here
	/*public static double distanceCalc(double x1, double x2, double y1, double y2) {
		double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		return distance;
	} */

	}
}
