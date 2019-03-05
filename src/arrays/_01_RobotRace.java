package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		int sideBySide = 0;
		int advantage = 0;
		Random rand = new Random();
		boolean gameOver = false;
		
		
		Robot[] rob = new Robot[2];
		for (int i = 0; i < rob.length; i++) {
			rob[i] = new Robot("mini");
			rob[i].setX(100 + sideBySide);
			rob[i].setY(300 + advantage);
			sideBySide = sideBySide + 35;
			advantage = advantage - 2;
			rob[i].setSpeed(10);
		}
		
		while (!gameOver) {
			for (int i = 0; i < rob.length; i++) {
				rob[i].move(rand.nextInt(49)+1);
				rob[i].turn(10);
				if(rob[i].getY() < 50) {
					gameOver = true;
					JOptionPane.showMessageDialog(null, "Congratulations Robot " + (i+1) + "!");
					break;
				}
			}
			
		}
		
	}
	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.

		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
