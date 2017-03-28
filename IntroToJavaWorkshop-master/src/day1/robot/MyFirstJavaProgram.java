package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot liza = new Robot();
liza.penDown();
liza.setPenColor(Color.BLUE);
int sides = 8;
for (int i = 0; i < 8; i++) 
{
	liza.setSpeed(10);
	liza.move(100);
	liza.turn(360/sides);	
}

	}
}