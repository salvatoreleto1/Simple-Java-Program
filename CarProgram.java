package practice;

public class CarProgram {

	public static void main(String[] args) {
		
		/* Creates a Car object passing 2006
		 * and C180 as arguments to the constructor 
		 */ 
		Car Mercedes = new Car(2006, "C180");
		
		/* Gets the current speed and accelerates car
		 * speed by 5, and displays it 
		 * through every for loop iteration
		 */
		for (int times = 0; times < 5; times++) {
			Mercedes.accelerate();
			System.out.println("Accelerating: " + Mercedes.getSpeed());
		}
		
		/* Gets the current speed and decelerates car
		 * speed by 5, and displays it 
		 * through every for loop iteration
		 */
		for (int times = 0; times < 5; times++) {
			Mercedes.brake();
			System.out.println("Braking: " + Mercedes.getSpeed());
		}
	}

}
