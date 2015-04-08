import java.util.Scanner;

import javax.swing.JOptionPane;


public class ClassDriver2 {

	public static void main(String[] args) {
		String color1 =JOptionPane.showInputDialog(null, "Enter the color you want for car 1:");
		Car Car1 = new Car();
		Car1.setColor(color1);
		
		String Horsepower1 = JOptionPane.showInputDialog(null, "Enter the horsepower for car 1:");
		int integerHorsePower = Integer.parseInt(Horsepower1);
		Car1.setHorsePower(integerHorsePower);
		
		String Engine1= JOptionPane.showInputDialog(null,"Enter the engine size for car 1:");
		Car1.setEngineSize(Engine1);
		
		String color2 =JOptionPane.showInputDialog(null, "Enter the color you want for car 2:");
		Car Car2 = new Car();
		Car2.setColor(color2);
		
		String Horsepower2 = JOptionPane.showInputDialog(null, "Enter the horsepower for car 2:");
		int integerHorsePower2 = Integer.parseInt(Horsepower2);
		Car2.setHorsePower(integerHorsePower2);
		
		String Engine2= JOptionPane.showInputDialog(null,"Enter the engine size for car 2:");
		Car2.setEngineSize(Engine2);
		
		String color3 =JOptionPane.showInputDialog(null, "Enter the color you want for car 3:");
		Car Car3 = new Car();
		Car3.setColor(color3);
		
		String Horsepower3 = JOptionPane.showInputDialog(null, "Enter the horsepower for car 3:");
		int integerHorsePower3 = Integer.parseInt(Horsepower3);
		Car3.setHorsePower(integerHorsePower3);
		
		String Engine3= JOptionPane.showInputDialog(null,"Enter the engine size for car 3:");
		Car3.setEngineSize(Engine3);
		JOptionPane.showMessageDialog(null, Car1.toString() + "\n" + Car2.toString() + "\n"+  Car3.toString() );
		
		Car Car4 = new Car(color1,integerHorsePower,Engine1);
		JOptionPane.showMessageDialog(null, "Is car 1 equal to car 4?  \n" + Car4.equals(Car1));
		
		
		
		
	}

}
