package practice;

public class Car {
	private int yearModel; 
	private String make; 
	private int speed; 

	/* Constructor
	 * @param year is the yearModel
	 * @param carMake is the make
	 */
	public Car(int year, String carMake) {
		yearModel = year;
		make = carMake;
		speed = 0;
	}
	
	/* gets and returns the yearModel
	 * of the car
	 */
	public int getyearModel() {
		return yearModel;
	}
	
	/* gets and returns the make
	 * of the car
	 */
	public String getMake() {
		return make;
	}
	
	/* gets and returns the speed
	 * of the car
	 */
	public int getSpeed() {
		return speed;
	}
	
	// Adding 5 to car speed 
	public void accelerate() {
		speed += 5;
	}
	
	// Subtracting 5 to car speed 
	public void brake() {
		speed -= 5;
	}
	
}
