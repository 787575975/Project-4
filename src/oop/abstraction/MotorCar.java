package oop.abstraction;

public abstract class MotorCar implements Car {
//car
	public void start() {
		System.out.println("stat the car to drive");
	}
	public void stop() {
		System.out.println("put on break to stop the car");
		}
	public void oilMotorEngine() {
		System.out.println("runs on oil");
	}
	
	public abstract void fourWheelCar();
	
}
