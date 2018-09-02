package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace2 {
	//1. make a main method
public static void main(String[] args) {
	

	//2. create an army of 5 robots.
Robot[] botArray = new Robot[10];
	//3. use a for loop to initialize the robots.
for(int i = 0;i<botArray.length;i++) {
	botArray[i]=new Robot();
	botArray[i].setX(70);
	botArray[i].setY(500);
	botArray[i].setSpeed(50);
}
		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
Random rand = new Random();
boolean winner = false;
int winnerRobot=0;
while(!winner) {
for(int i = 0;i<botArray.length;i++) {
	botArray[i].move(rand.nextInt(50));
	if(botArray[i].getY()<50){
		botArray[i].turn(90);
		botArray[i].setY(50);
	}
	if(botArray[i].getX()>650){
		botArray[i].turn(90);
		botArray[i].setX(650);
	}
	if(botArray[i].getY()>500){
		botArray[i].turn(90);
		botArray[i].setY(500);
	}
	if(botArray[i].getX()<50){
		winnerRobot= i+1;
		winner=true;
	}

}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
}
	//7. declare that robot the winner and throw it a party!
JOptionPane.showMessageDialog(null, "Robot "+winnerRobot+" won! [throwing a party sounds]");
	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}}
