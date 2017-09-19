import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;



public class Checkpoint0 {
	
public static void main(String[] args) {

	String color = JOptionPane.showInputDialog("What's your favorite color?");
	JOptionPane.showMessageDialog(null,color + " is my favorite color too!");
	
	Robot t = new Robot("batman");
	t.setSpeed(10);
	if (color.equalsIgnoreCase("blue")) {
		t.setPenColor(Color.);
	}
t.penDown();

t.turn(30);
t.move(100);
t.turn(120);
t.move(100);
t.turn(120);
t.move(100);
	
	
	
}
}
